package BridgeMode;

public abstract class BaseImageParse {
    protected IImagePaint impl;
    public void setImagePaint(IImagePaint imagePaint){
        this.impl = imagePaint;
    }
    public abstract void parseFile(String fileName);
}
