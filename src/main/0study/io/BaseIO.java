package io;

import java.io.*;

/**
 * IO流操作步骤
 * 1、创建源
 * 2、选择流
 * 3、操作（读、写）
 * 4、释放资源
 *
 * @Author created by barrett in 2020/5/14 23:05
 */
public class BaseIO {

    public static void main(String[] args) {
        test2();

    }

    static void test1() {
        //源头：文件路径
        File file = new File("readme.txt");

        try {
            //操作方式：字节读取
            InputStream is = new FileInputStream(file);

            int read1 = is.read();
            int read2 = is.read();
            int read3 = is.read();

            System.out.println((char) read1);
            System.out.println((char) read2);
            System.out.println((char) read3);
            //释放
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void test2() {
        File url = new File("io.txt");

        InputStream is = null;
        try {
            is = new FileInputStream(url);
            int read;
            while ((read = is.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
