package com.alemicode.fullfunctionalapp

import android.util.Log
import androidx.lifecycle.ViewModel
import com.alemicode.fullfunctionalapp.data.network.retrofit.RemoteDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : ViewModel() {
    suspend fun getComments() {
        /**
         * Here We just check the response comming from server
         * This class will be refactored
         * */
        remoteDataSource.getUsers()?.let {
            Log.d("TAG", "getComments: ddd ${it.body()?.users}")
        }

        remoteDataSource.getPosts()?.let {
            Log.d("TAG", "getComments: ddd ${it.body()?.posts}")
        }
    }
}