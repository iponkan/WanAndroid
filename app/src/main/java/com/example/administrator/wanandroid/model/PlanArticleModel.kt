package com.example.administrator.wanandroid.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.administrator.wanandroid.database.AndroidDataBase
import com.example.administrator.wanandroid.database.ReadPlanArticle
import com.example.administrator.wanandroid.database.StudyProject

/**
 * @author  : Alex
 * @date    : 2018/10/19
 * @version : V 2.0.0
 */
class PlanArticleModel(application: Application) : AndroidViewModel(application) {

    val dao = AndroidDataBase.getInstence(application).getReadPlanDao()
    val daoProject = AndroidDataBase.getInstence(application).getStudyProjectDao()

    val livePagingList : LiveData<PagedList<ReadPlanArticle>> = LivePagedListBuilder(dao.getArticleList(),PagedList.Config.Builder()
            .setPageSize(5)
            .build()).build()

    val livePagedListProject : LiveData<PagedList<StudyProject>> = LivePagedListBuilder(daoProject.getArticleList(),PagedList.Config.Builder()
            .setPageSize(5)
            .build()).build()
}