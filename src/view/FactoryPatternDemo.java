package view;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = null;
        System.out.println("Mời nhập kiểu hình");
        String type = new Scanner(System.in).nextLine();
        shape = shapeFactory.getShape(type);
        System.out.println(shape.draw());

    }
     static class  ShapeFactory {
         //    int count = 0;
//    public ShapeFactory(){
//
//    }
//    public Shape getShape(){
//        if(count == 0){
//            count++;
//            return new Circle();
//        }
//        if(count == 1){
//            count++;
//            return new Square();
//        }
//        if(count == 2){
//            count = 0;
//            return new Rectangle();
//        }
//        return null;
//    }
         public Shape getShape(String type) {
             if (type.equals("Circle")) {
                 return new Circle();
             }
             if (type.equals("Square")) {
                 return new Square();
             }
             if (type.equals("Rectangle")) {
                 return new Rectangle();
             }
             return null;
         }
     }
}
