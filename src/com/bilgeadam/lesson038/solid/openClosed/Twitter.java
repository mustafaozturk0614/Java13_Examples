package com.bilgeadam.lesson038.solid.openClosed;

public class Twitter extends SocialMedia{

    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(TwitterConstant.JPG);
                break;
            case "png":
                setScaleRatio(20);
                break;
            default:
                setScaleRatio(30);
                break;
        }
    }
}
