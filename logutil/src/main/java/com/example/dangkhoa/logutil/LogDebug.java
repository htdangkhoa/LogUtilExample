package com.example.dangkhoa.logutil;

import android.util.Log;

/**
 * Created by dangkhoa on 11/20/17.
 */

public class LogDebug {
    private static String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
