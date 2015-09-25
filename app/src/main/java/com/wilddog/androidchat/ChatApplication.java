package com.wilddog.androidchat;

import com.wilddog.client.Wilddog;

/**
 * @author Jeen
 * @since 9/16/15
 *
 * Initialize Wilddog with the application context. This must happen before the client is used.
 */
public class ChatApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Wilddog.setAndroidContext(this);
    }
}
