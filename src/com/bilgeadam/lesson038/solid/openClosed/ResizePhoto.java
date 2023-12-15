package com.bilgeadam.lesson038.solid.openClosed;

public class ResizePhoto {


    public void resizePhoto(Instagram instagram,String type){
        switch (type){
            case "jpg":
                instagram.setScaleRatio(38);
                break;
            case "png":
                instagram.setScaleRatio(30);
                break;
            default:
                instagram.setScaleRatio(40);
                break;
        }
    }
    public void resizePhoto2(SocialMedia socialMedia,String type){
        switch (type){
            case "jpg":
                if (socialMedia instanceof Instagram){
                    socialMedia.setScaleRatio(38);
                }else if (socialMedia instanceof Facebook){
                    socialMedia.setScaleRatio(34);
                } else if (socialMedia instanceof WhatsApp) {
                    socialMedia.setScaleRatio(28);
                }
                break;
            case "png":
                if (socialMedia instanceof Instagram){
                    socialMedia.setScaleRatio(30);
                }else if (socialMedia instanceof Facebook){
                    socialMedia.setScaleRatio(37);
                }else if (socialMedia instanceof WhatsApp) {
                    socialMedia.setScaleRatio(32);
                }
                break;
            default:
                if (socialMedia instanceof Instagram){
                    socialMedia.setScaleRatio(40);
                }else if (socialMedia instanceof Facebook){
                    socialMedia.setScaleRatio(45);
                }else if (socialMedia instanceof WhatsApp) {
                    socialMedia.setScaleRatio(36);
                }
                break;
        }
    }

    public void resizePhoto3(SocialMedia socialMedia,String type){
        socialMedia.resize(type);
    }
}
