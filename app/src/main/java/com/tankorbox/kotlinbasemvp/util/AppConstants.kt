package com.tankorbox.kotlinbasemvp.util

object AppConstants {

    internal const val APP_DB_NAME = "mindorks_mvp.db"
    internal const val PREF_NAME = "mindorks_pref"
    internal const val SEED_DATABASE_QUESTIONS = "seed/questions.json"
    internal const val SEED_DATABASE_OPTIONS = "seed/options.json"
    internal const val EMPTY_EMAIL_ERROR = 1001
    internal const val INVALID_EMAIL_ERROR = 1002
    internal const val EMPTY_PASSWORD_ERROR = 1003
    internal const val LOGIN_FAILURE = 1004
    internal const val NULL_INDEX = -1L

    enum class LoggedInMode constructor(val type: Int) {
        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3)
    }
}