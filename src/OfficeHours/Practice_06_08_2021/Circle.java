package OfficeHours.Practice_06_08_2021;

public class Circle extends Shape{
    double radius;
    double diameter;

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
    }
}
