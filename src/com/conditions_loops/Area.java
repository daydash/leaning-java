package com.conditions_loops;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws IllegalStateException {
        Scanner in = new Scanner(System.in);
        float pi = 3.14159f;
        double area;


        do{
            System.out.println("Please choose the figure whose area you need to calculate : ");
            System.out.println("1.Circle\n2.Triangle\n3.Rectangle\n4.Square\n5.Parallelogram\n6.Rhombus\n0.EXIT\n");
            int ch = in.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter the radius : ");
                    float r = in.nextInt();
                    area = pi * Math.pow(r, 2);
                }
                case 2 -> {
                    System.out.println("Enter your choice(1-4):");
                    System.out.println("1.Isosceles Triangle\n2.Equilateral Triangle\n3.Using Sides\n");
                    int choose = in.nextInt();

                    switch (choose) {
                        case 1 -> {
                            System.out.println("Enter the height and base :");
                            float h = in.nextInt();
                            float b = in.nextInt();
                            area = b * h / 2;
                        }
                        case 2 -> {
                            System.out.println("Enter the equilateral side :");
                            float s = in.nextInt();
                            area = Math.sqrt(3) / 4 * Math.pow(s, 2);
                        }
                        case 3 -> {
                            System.out.println("Enter the three sides :");
                            float a = in.nextInt();
                            float b = in.nextInt();
                            float c = in.nextInt();
                            float s = (a + b + c) / 2f;
                            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        }
                        default -> throw new IllegalStateException("Unexpected value: " + choose);
                    }
                }
                case 3 -> {
                    System.out.println("Enter the length and breadth :");
                    float l = in.nextInt();
                    float b = in.nextInt();
                    area = l * b;
                }
                case 4 -> {
                    System.out.println("Enter the length of side :");
                    float s = in.nextInt();
                    area = Math.pow(s, 2);
                }
                case 5 -> {
                    System.out.println("Enter the base and height :");
                    float b = in.nextInt();
                    float h = in.nextInt();
                    area = b * h;
                }
                case 6 -> {
                    System.out.println("Enter the two diagonals :");
                    float p = in.nextInt();
                    float q = in.nextInt();
                    area = p * q / 2;
                }
                case 0 -> {
                    return;
                }
                default -> throw new IllegalStateException("Unexpected value: " + ch);
            }
            System.out.print("Area is : ");
            System.out.format("%.2f", area);
            System.out.println("\n\n");
        }while(true);
    }
}
