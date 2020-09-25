package com.example.administrator.wanandroid.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

/**
 * @author  : Alex
 * @date    : 2018/10/19
 * @version : V 2.0.0
 */

@Dao
interface CollectedDao {

    @Query("SELECT * FROM collect WHERE articleId = :id")
    fun isCollected(id:Int):CollectArticle

    @Insert
    fun insert(collectArticle: CollectArticle)


    @Delete
    fun delete(collectArticle: CollectArticle)

}