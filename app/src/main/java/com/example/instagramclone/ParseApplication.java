package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VqyTzjsaRSSfKGTf2Tyd8snvzV9UYyCoDzTrFctK")
                .clientKey("R5bQMNokSw9vhC3E5EUzDBUfzq07bsmV0LGXvvGd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
