package com.bytedance.demo;

import android.app.Application;
import android.os.Environment;

import com.bytedance.raphael.Raphael;

import java.io.File;

public class DemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String space = getExternalFilesDir("") + "/raphael";
        new File(space).delete();
        new File(space).mkdirs();
        Raphael.start(Raphael.MAP64_MODE | Raphael.ALLOC_MODE | 0x1F0000 | 1024, space, null);
//      Raphael.start(Raphael.MAP64_MODE|Raphael.ALLOC_MODE|0x0F0000|1024, space, ".*libhwui\\.so$");
    }
}