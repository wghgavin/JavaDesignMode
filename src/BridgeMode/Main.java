package BridgeMode;

import BridgeMode.ImagePaintImpl.LinuxImageImpl;
import BridgeMode.ImageParseImpl.BmpParseImpl;

/**
 * 桥接模式
 * 用于具有多维的系统方便扩展
 * 例子：开发跨平台的图像浏览系统,能够显示bmp,jpg,gif,png等多种格式文件,能够在windows,linux,unix等多个操作系统运行
 */
public class Main {
    public static void main(String[] args) {
          IImagePaint impl =new LinuxImageImpl();
          BaseImageParse imageParse = new BmpParseImpl();
          imageParse.setImagePaint(impl);
          imageParse.parseFile("123.jpg");
    }
}
