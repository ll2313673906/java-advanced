package com.soft1841.jdbc;

/**
 * 设计模式二
 * author；刘恋
 * 2019.5.21
 */
public class FactoryTest {
    public static void main(String[] args) {
        Shap circle = ShapeFactory.getCircleTnstance();
        circle.draw();
        Shap rectangle = ShapeFactory.getRectangleInstance();
        rectangle.draw();
    }
}
