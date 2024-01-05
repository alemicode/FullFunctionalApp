package com.alemicode.user.ui.user

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alemicode.data.repository.UserAndPostRepository
import com.alemicode.data.repository.UserRepository
import com.alemicode.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    userAndPostRepository: UserAndPostRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    // user Id is given via Navigation Component
    val userId = savedStateHandle.get<Int>("user_id") ?: 1

    val uiState: StateFlow<UserUiState> =
        userAndPostRepository.getUserAndPosts(userId)
            .map(UserUiState::Success)
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = UserUiState.Loading
            )
}

sealed interface UserUiState {
    data object Loading : UserUiState
    data class Success(
        val user: User
    ) : UserUiState

    data object Error : UserUiState
}