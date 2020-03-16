package com.freelog.cg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
    public static void copyFile(String source, String dest) throws IOException {

        ClassLoader classLoader = App.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(source);
//
        OutputStream output = new FileOutputStream(dest);

        for (; ; ) {
            assert inputStream != null;
            int n = inputStream.read(); // 反复调用read()方法，直到返回-1
            if (n == -1) {
                break;
            }
            output.write(n);
        }
        inputStream.close(); // 关闭流
        output.close();
    }
}
