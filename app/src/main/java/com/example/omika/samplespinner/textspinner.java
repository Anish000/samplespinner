package com.example.omika.samplespinner;

import android.graphics.drawable.Drawable;

public class textspinner {
    private String mtext;
    private int mtextImage;

    public textspinner(String text, int textImage) {
        mtext = text;
        mtextImage = textImage;
    }


    public void setMtext(String mtext) {
        this.mtext = mtext;
    }

    public void setMtextImage(int mtextImage) {
        this.mtextImage = mtextImage;
    }

    public String gettext() {
        return mtext;
    }

    public int gettextImage() {
        return mtextImage;
    }
}
