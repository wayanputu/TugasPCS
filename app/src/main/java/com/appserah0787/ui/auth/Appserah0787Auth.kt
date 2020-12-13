package com.appserah0787.ui.auth

import android.content.Context
import com.appserah0787.data.model.ActionState
import com.appserah0787.data.repository.AuthRepository
import kotlinx.coroutines.*

object Appserah0787Auth {

    fun logout(context: Context, callback: ((ActionState<Boolean>) -> Unit)? = null){
        val repo = AuthRepository(context)
        CoroutineScope(Dispatchers.IO).launch {
            val resp = repo.logout()
            withContext(Dispatchers.Main){
                if (callback != null) callback.invoke(resp)
            }
        }
    }

}