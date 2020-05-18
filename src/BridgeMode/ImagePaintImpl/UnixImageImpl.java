package BridgeMode.ImagePaintImpl;

import BridgeMode.IImagePaint;

public class UnixImageImpl implements IImagePaint {
    @Override
    public void doPaint() {
        System.out.println("在unix显示图片");
    }
}
