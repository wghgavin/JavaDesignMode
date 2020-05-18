package BridgeMode.ImagePaintImpl;

import BridgeMode.IImagePaint;

public class LinuxImageImpl implements IImagePaint {
    @Override
    public void doPaint() {
        System.out.println("在linux显示图片");
    }
}
