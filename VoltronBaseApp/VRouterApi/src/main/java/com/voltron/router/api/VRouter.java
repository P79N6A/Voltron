package com.voltron.router.api;

import android.app.Activity;

public class VRouter {
    public static void init(Activity activity) {
        VRouterInternal.init(activity);
    }
}