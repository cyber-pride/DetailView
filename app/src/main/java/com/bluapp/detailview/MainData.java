package com.bluapp.detailview;

import android.graphics.drawable.Drawable;

public class MainData {
    private String header;
    private int image;
    private String title;
    private String subtitle;

    public MainData(String header, int image, String title, String subtitle){
        this.header = header;
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getHeader() {
        return header;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subtitle;
    }


}
