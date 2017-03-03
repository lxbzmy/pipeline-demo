package cn.devit.demo;

public class NumberFormats {

    public String readableBytes(long bytesLength) {
        if (bytesLength >= 1024) {
            return String.format("%d KB", bytesLength / 1024);
        }
        return String.format("%d bytes", bytesLength);
    }
}
