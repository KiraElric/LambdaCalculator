package com.nisum.java.calculator;

import com.nisum.java.calculator.MathOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first value: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the operator symbol (+,-,*,/): ");
            scanner.nextLine();
            String operator = scanner.nextLine();
            System.out.println("Enter the second value: ");
            int secondNumber = scanner.nextInt();

            switch (operator){
                case ("+"):
                    System.out.println(calculate(firstNumber, add(), secondNumber));
                    break;
                case ("-"):
                    System.out.println(calculate(firstNumber, subtract(), secondNumber));
                    break;
                case ("*"):
                    System.out.println(calculate(firstNumber, multiply(),secondNumber));
                    break;
                case("/"):
                    if(secondNumber != 0){
                        System.out.println(calculate(firstNumber, divide(), secondNumber));
                    }else {
                        System.out.println("Indeterminate... You can not divide for 0");
                    }
                    break;
                default:
                    System.out.println("You must choose one of the operator symbols");
                    break;
            }
        }catch (Exception e){
            System.out.println("Uppps... Sometime get wrong... :S ");
        }

    }

    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }

    private static MathOperation add(){
        MathOperation mathOperation = (firstNumber, secondNumber) -> firstNumber + secondNumber;
        return mathOperation;
    }
    private static MathOperation subtract(){
        MathOperation mathOperation = (firstNumber, secondNumber) -> firstNumber - secondNumber;
        return mathOperation;
    }
    private static MathOperation multiply(){
        MathOperation mathOperation = (firstNumber, secondNumber) -> firstNumber * secondNumber;
        return mathOperation;
    }
    private static MathOperation divide(){
        MathOperation mathOperation = (firstNumber, secondNumber) -> firstNumber / secondNumber;
        return mathOperation;
    }
}
