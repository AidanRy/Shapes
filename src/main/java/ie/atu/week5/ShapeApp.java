package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Please enter the length of the Rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("you entered :" + length);

        System.out.println("Please enter the width of the Rectangle");
        double width = input.nextDouble();
        System.out.println("you entered :" + width);
    }
}
