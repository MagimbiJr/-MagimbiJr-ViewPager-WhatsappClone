package com.tana.viewpager;

public class Chats {
    private String mName;
    private String mMessage;
    private String mDate;
    private int mImage;

    public Chats() {}

    public Chats(String name, String message, int image) {
        mName = name;
        mMessage = message;
        mImage = image;
    }

    public Chats(String name, String message, String date, int image) {
        mName = name;
        mMessage = message;
        mDate = date;
        mImage = image;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }
}
