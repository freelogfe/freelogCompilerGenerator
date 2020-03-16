package com.freelog.cg;

import java.io.*;

public class CopyFile {
    public static void copyFile(String source, String dest) throws IOException {

        createNotExistDir(dest);

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

    private static void createNotExistDir(String path) {
        File file = new File(path);
        /*
         * 判断父目录是否存在
         * 	不存在：先创建父目录文件夹，再创建指定的文件。
         */
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
//                file.createNewFile();
            System.out.println("创建成功!");
        }

    }
}
