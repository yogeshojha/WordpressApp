package com.techdevfan.wordpressapp.model.post;

import android.arch.persistence.room.ColumnInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import static com.techdevfan.wordpressapp.database.AppDatabase.COLUMN_NAME_RENDERED;

/**
 * Created by shubham on 22/7/17.
 */

public class ContentData {
    @SuppressWarnings("unused")
    private static final String TAG = "ContentData";

    @ColumnInfo(name = COLUMN_NAME_RENDERED)
    @SerializedName("rendered")
    @Expose
    public String rendered;


    public ContentData() {
        this.rendered = "";
    }

    public String getRendered() {
        if (rendered == null) {
            return "";
        }
        return rendered;
    }
}


