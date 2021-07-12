package com.antoniusharpen.usercrudproject.Model;
import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    String status;
    User mUser;
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public User getmUser() {
        return mUser;
    }
    public void setKontak(User mUser) {
        mUser = mUser;
    }
}