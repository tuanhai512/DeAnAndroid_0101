package com.example.doanltdd.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

public class Contact {
    String Title;
    Bitmap Image;

    public Contact()
    {

    }
    public Contact(String Title) {
        this.Title = Title;
    }

    public Contact(String Title, Bitmap Image)
    {
        this.Title = Title;
        this.Image = Image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Bitmap getImage() {
        return Image;
    }

    public void setImage(Bitmap Image) {
        this.Image = Image;
    }

    public static Bitmap convertStringToBitmapFromAccess(Context context, String
            filename){
        AssetManager assetManager = context.getAssets();
        try {
            InputStream is = assetManager.open(filename);
            return BitmapFactory.decodeStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
