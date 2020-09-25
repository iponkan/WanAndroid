package com.example.administrator.wanandroid.database

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author  : Alex
 * @date    : 2018/10/19
 * @version : V 2.0.0
 */

@Entity(tableName = "collect")
  data class CollectArticle ( var articleId : Int ){

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0


}