package com.bilgeadam.lesson038.solid.openClosed;

public class WhatsApp extends SocialMedia{

    @Override
    public void resize(String type) {
        switch (type){
            case "jpg":
                setScaleRatio(28);
                break;
            case "png":
                setScaleRatio(32);
                break;
            default:
                setScaleRatio(36);
                break;
        }
    }
}
