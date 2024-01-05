package com.alemicode.fullfunctionalapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alemicode.data.repository.PostAndCommentsRepository
import com.alemicode.data.repository.UserAndPostRepository
import com.alemicode.data.repository.UserRepository
import com.alemicode.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val postRepository: PostAndCommentsRepository,
    private val userAndPostRepository: UserAndPostRepository
) : ViewModel() {

}