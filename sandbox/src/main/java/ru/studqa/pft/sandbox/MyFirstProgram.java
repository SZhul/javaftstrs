package ru.studqa.pft.sandbox;

public class MyFirstProgram {
public static void main(String[] args){

    hello("World");
    double i = 5;
    double v = 2;
    double c = 6;
    System.out.println("Площадь квадрата со стороной " + i + " равна " + area(i));
    System.out.println("Площадь прямоугольника с длиной " + c + " и высотой " + v + " равна " + area(c, v));
}

    public static void hello(String somebody) {
        System.out.println("Hello" + " " + somebody);
    }
    public static double area (double l){
        return l*l;
    }
    public static double area(double l, double i){
        return l*i;
    }
}

