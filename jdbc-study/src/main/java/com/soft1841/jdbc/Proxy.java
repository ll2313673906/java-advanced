package com.soft1841.jdbc;

/**
 * java设计模式四
 * 创建代理对象类
 * author刘恋
 * 2019.5.23
 */
public class Proxy implements Subject{

    public void buyMac() {
        //引用并创建真实对象实例，即我
        RealSubject realSubject = new RealSubject();
        //调用真实对象的方法，进行代理购买Mac;
        realSubject.buyMac();
        //代理对象额外做的操作
        this.WrapMac();
    }
    public void WrapMac(){
        System.out.println("用盒子包装好Mac");
    }
}
