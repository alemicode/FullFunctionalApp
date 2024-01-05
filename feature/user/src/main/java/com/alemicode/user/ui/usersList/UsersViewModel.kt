package com.alemicode.user.ui.usersList

import androidx.lifecycle.ViewModel
import com.alemicode.model.User
import androidx.lifecycle.viewModelScope
import com.alemicode.domain.GetUsersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    private val getUsers: GetUsersUseCase,
) : ViewModel() {

    val uiState: StateFlow<UsersUiState> = getUsers().map(
        UsersUiState::Success
    ).stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = UsersUiState.Loading
    )
}

sealed interface UsersUiState {
    data object Loading : UsersUiState
    data class Success(
        val users: List<User>
    ) : UsersUiState

    data object Error : UsersUiState
}