package com.alemicode.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import com.alemicode.database.model.CommentsEntity
import com.alemicode.database.model.PostAndComments
import com.alemicode.database.model.PostsEntity
import com.alemicode.database.model.UserAndPosts
import com.alemicode.database.model.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insetUsers(usersEntity: UserEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertPosts(postsEntity: PostsEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertComments(commentsEntity: CommentsEntity)

    @Query("SELECT * FROM user_table")
    fun getAllUsers(): Flow<List<UserEntity>>


    @Transaction
    @Query("SELECT * FROM user_table WHERE id = :userId ")
    fun getUserAndPosts(userId: Int): Flow<UserAndPosts>

    @Transaction
    @Query("SELECT * FROM posts_table WHERE id = :postId ")
    fun getPostAndComments(postId: Int): Flow<PostAndComments>


}