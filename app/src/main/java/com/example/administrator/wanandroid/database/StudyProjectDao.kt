package com.example.administrator.wanandroid.database

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
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
 interface StudyProjectDao {

    @Insert
    fun insert(readPlanArticle: StudyProject)

    @Delete
    fun remove(readPlanArticle: StudyProject)

    @Query("SELECT * from project")
    fun getArticleList():DataSource.Factory<Int,StudyProject>

    @Query("SELECT * from project WHERE articleId = :id")
    fun getArticle(id :Int):StudyProject

}