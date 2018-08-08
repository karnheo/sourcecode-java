package com.pcc.th.yyy;

public interface Mobile {
    void call();
    void playMusic();
    
}

interface Mobile2018 extends Mobile{
    void takePhoto();
}

interface NewMobileV2 extends Mobile,Mobile2018{
    void call();
    void playMusic();
    void takePhoto();
}
class SamSung implements NewMobileV2 {

    @Override
    public void call() {
        // TODO Auto-generated method stub

    }

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub

    }

    @Override
    public void takePhoto() {
        // TODO Auto-generated method stub
        
    }
}

class IPhone implements Mobile,Mobile2018 {

    @Override
    public void call() {
        // TODO Auto-generated method stub

    }

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub

    }

    @Override
    public void takePhoto() {
        // TODO Auto-generated method stub
        
    }

}