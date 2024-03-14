package com.huanchengfly.tieba.post.api.retrofit.exception

import com.huanchengfly.tieba.post.App
import com.huanchengfly.tieba.post.R
import com.huanchengfly.tieba.post.api.Error

fun Throwable.getErrorCode(): Int {
    return if (this is TiebaException) {
        code
    } else {
        Error.ERROR_UNKNOWN
    }
}

fun Throwable.getErrorMessage(): String {
    return if (message.isNullOrEmpty()) {
        App.INSTANCE.getString(R.string.error_unknown)
    } else {
        message!!
    }
}