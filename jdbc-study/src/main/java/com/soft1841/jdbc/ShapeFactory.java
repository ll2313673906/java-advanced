package com.soft1841.jdbc;

/**
 * 设计模式二
 * author；刘恋
 * 2019.5.21
 */
public class ShapeFactory {
        public static Shap getCircleTnstance(){
            return new Circle();
        }
        public static Shap getRectangleInstance(){
            return new Rectangle();
        }
}
