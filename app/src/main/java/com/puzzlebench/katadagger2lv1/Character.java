package com.puzzlebench.katadagger2lv1;

/**
 * Created by andresdavid on 13/01/17.
 */

public class Character {

    private int name;
    private int image;


    public Character() {
        this.image = R.drawable.descarga;
        this.name = R.string.lblname;

    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
