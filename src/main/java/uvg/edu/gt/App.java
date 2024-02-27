package uvg.edu.gt;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        boolean mainBool = true;
        String stackType = null;
        while (mainBool) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el numero correspondiente a la estructura de datos que desea utilizar:");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            int mainSelect = scanner.nextInt();
            switch (mainSelect) {
                case 1:
                    stackType = "arraylist";
                    mainBool = false;
                    break;
                case 2:
                    stackType = "vector";
                    mainBool = false;
                    break;
                default:
                    System.out.println("Valor ingresado incorrecto");
            }
        }
        System.out.println(stackType);
        Calculator calc = new Calculator(stackType);
        System.out.println(calc.infixToPostfix("1+2*9"));
        System.out.println(calc.eval("1+2*9"));
        System.out.println(calc.infixToPostfix("(1+2)*9"));
        System.out.println(calc.eval("(1+2)*9"));
    }
}
