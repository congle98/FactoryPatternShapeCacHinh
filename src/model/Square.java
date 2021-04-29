package model;

public class Square implements Shape{
    @Override
    public boolean draw() {
        System.out.println("Đây là hình vuông");
        return false;
    }
}
