package BridgeMode.ImagePaintImpl;

import BridgeMode.IImagePaint;

public class WindowsImageImpl implements IImagePaint {
    @Override
    public void doPaint() {
        System.out.println("在windows显示图片");
    }
}
