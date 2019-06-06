package com.test.tools;

import android.content.Context;
import android.widget.Toast;

/**
 * @author cd5160866
 */
public class CommonTools {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
