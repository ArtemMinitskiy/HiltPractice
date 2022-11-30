package com.example.hiltpracticepartone.di

import android.content.Context
import androidx.room.Room
import com.example.hiltpracticepartone.utils.Constants.NOTE_DATABASE
import com.example.hiltpracticepartone.database.NoteDatabase
import com.example.hiltpracticepartone.database.NoteEntity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbModule {

    @Provides
    @Singleton
    fun provide(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, NoteDatabase::class.java, NOTE_DATABASE)
        .allowMainThreadQueries()
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideDao(db: NoteDatabase) = db.noteDoa()

    @Provides
    fun provideEntity() = NoteEntity()

}