package com.soft1841.jdbc;

/**
 * 单例模式测试程序
 * author刘恋
 * 2019.5。20
 */
public class SingletonTest {
    public static void main(String[] args) {
        //编译错误，因为构造方法是不可见的，只能在SingLeton类内部使用
        //SingLeton object = new Singleton()
        // 通过Singleton的类方法Singleton.getInstance*()获取唯一可用的对象
        Singleton object = Singleton.getInstance();
        //显示消息
        object.showMessage();

    }
}
