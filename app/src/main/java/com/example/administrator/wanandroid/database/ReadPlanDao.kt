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
 interface ReadPlanDao {
    @Insert
    fun insert(readPlanArticle: ReadPlanArticle)
    @Delete
    fun remove(readPlanArticle: ReadPlanArticle)
    @Query("SELECT * from read_plan")
    fun getArticleList():DataSource.Factory<Int,ReadPlanArticle>
    @Query("SELECT * from read_plan WHERE articleId = :id")
    fun getArticle(id :Int):ReadPlanArticle
}