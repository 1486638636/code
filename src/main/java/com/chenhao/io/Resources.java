package com.chenhao.io;

import java.io.InputStream;

/**
 * 加载配置文件
 * @author chenhao
 * @date 2020/11/13 20:57
 **/
public class Resources {

    /**
     * 根据配置文件路径加载配置文件，形成字节输入流，存储到内存中
     *
     * @author chenhao
     * @date 2020/11/13 20:59
     * @param path
     * @return java.io.InputStream
     */
    public static InputStream getResourceAsStream(String path){
        InputStream resourceStream = Resources.class.getClassLoader().getResourceAsStream(path);
        return resourceStream;
    }
}
