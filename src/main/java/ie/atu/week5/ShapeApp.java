package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        //created first instance of rectangle
        System.out.println("Please enter the length of the Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("you entered :" + shapeRect.getLength());


        System.out.println("Please enter the width of the Rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("you entered :" + shapeRect.getWidth());

        //cerated second instance of rectangle
        Rectangle shapeRect2 = new Rectangle();
        System.out.println("Please enter the length of second Rectangle");
        double length2 = input.nextDouble();
        shapeRect2.setLength(length2);
        System.out.println("you entered :" + shapeRect2.getLength());



        System.out.println("Please enter the width of second Rectangle");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("you entered :" + shapeRect2.getWidth());
    }
}
