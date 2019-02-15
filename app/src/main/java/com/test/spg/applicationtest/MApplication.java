package com.test.spg.applicationtest;

import android.app.Application;

public class MApplication extends Application {

    private String share_string = "default";

    public String getShare_string() {
        return share_string;
    }

    public void setShare_string(String share_string) {
        this.share_string = share_string;
    }

    public WHUER master = new WHUER("master", 18);
}
