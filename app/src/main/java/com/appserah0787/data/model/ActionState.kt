package com.appserah0787.data.model

data class ActionState<T> (
    val data: T? = null,
    val message: String? = null,
    val isSuccess: Boolean = true,
    var isConsumed: Boolean = false,

    )