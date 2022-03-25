package com.zerodev.unsplashapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zerodev.unsplashapp.data.local.dao.UnsplashImageDao
import com.zerodev.unsplashapp.data.local.dao.UnsplashRemoteKeysDao
import com.zerodev.unsplashapp.model.UnsplashImage
import com.zerodev.unsplashapp.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}