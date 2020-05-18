package BridgeMode.ImageParseImpl;

import BridgeMode.BaseImageParse;

public class BmpParseImpl extends BaseImageParse {
    @Override
    public void parseFile(String fileName) {
        //这里省略转换
        impl.doPaint();
        System.out.println(String.format("{0},格式为bmp",fileName));
    }
}
