package com.example.ahmed.criminalintent;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ahmed on 15/06/15.
 */
public class Crime implements Serializable{
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate=new Date();

    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public boolean isSolved() {
        return mSolved;
    }
}

