package model;

public class Circle implements Shape{
    @Override
    public boolean draw() {
        System.out.println("đây là hình tròn");
        return false;
    }
}
