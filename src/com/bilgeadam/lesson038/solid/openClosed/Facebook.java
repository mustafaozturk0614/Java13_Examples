package com.bilgeadam.lesson038.solid.openClosed;

public class Facebook extends  SocialMedia{
    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(34);
                break;
            case "png":
                setScaleRatio(37);
                break;
            default:
               setScaleRatio(45);
                break;
        }

    }
}
