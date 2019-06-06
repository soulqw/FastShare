package com.test.tools

import android.content.Context
import android.widget.Toast


/**
 *
 * @author cd5160866
 */

object KtTools {

    @JvmStatic
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}