package com.tankorbox.kotlinbasemvp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tankorbox.kotlinbasemvp.data.database.repository.options.Options
import com.tankorbox.kotlinbasemvp.data.database.repository.options.OptionsDao
import com.tankorbox.kotlinbasemvp.data.database.repository.questions.Question
import com.tankorbox.kotlinbasemvp.data.database.repository.questions.QuestionsDao

@Database(entities = [(Question::class), (Options::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun optionsDao(): OptionsDao

    abstract fun questionsDao(): QuestionsDao

}