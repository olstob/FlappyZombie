package com.olstob.gameobjects;

/**
 * Created by Olivier on 7/12/2016.
 */
public class Grass extends Scrollable{
    public Grass(float x, float y, int width, int height, float scrollSpeed){
        super(x, y, width, height, scrollSpeed);
    }

    public void onRestart(float x, float scrollSpeed){
        position.x = x;
        velocity.x = scrollSpeed;
    }
}
