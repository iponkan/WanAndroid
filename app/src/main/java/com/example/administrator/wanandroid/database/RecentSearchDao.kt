package com.example.administrator.wanandroid.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.Observable

/**
 * @author  : Alex
 * @date    : 2018/10/29
 * @version : V 2.0.2
 */
@Dao
interface RecentSearchDao {
    @Insert
    fun insert(recentSearch: RecentSearch)

    @Query("SELECT * from recent_search ORDER BY id desc")
    fun getRecentSearch(): LiveData<List<RecentSearch>>

    @Query("SELECT * from recent_search WHERE string = :string")
    fun isExist(string: String): RecentSearch?
}
