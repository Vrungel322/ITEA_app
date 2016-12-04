package com.nanddgroup.itea_app;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Nikita on 04.12.2016.
 */

public class POJOTest implements Parcelable {
    private String name;
    private String surName;

    public POJOTest(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(surName);
    }

    protected POJOTest(Parcel in) {
        name = in.readString();
        surName = in.readString();
    }

    public static final Creator<POJOTest> CREATOR = new Creator<POJOTest>() {
        @Override
        public POJOTest createFromParcel(Parcel in) {
            return new POJOTest(in);
        }

        @Override
        public POJOTest[] newArray(int size) {
            return new POJOTest[size];
        }
    };
}
