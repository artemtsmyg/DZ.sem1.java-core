package org.example.task1;

import org.example.calculator.Calculator;

/**
 * Создаём класс со второй точкой фхода
 */

/**
 * HW.sem1.core\HW.sem1.core\src\main
 * javac -sourcepath ./java -d out java/org/example/task1/Program.java
 * java -classpath ./out org.example.task1.Program
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages org
 */

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 5;

        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        double division = calculator.divide(num1, num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Деление: " + division);
    }
}