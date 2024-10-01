package ejecucion;
import operaciones.Operaciones;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Digita el primer numero: ");
        double num1 = scanner1.nextDouble();

        System.out.print("Digite el segundo numero: ");
        double num2 = scanner1.nextDouble();

        Operaciones operaciones = new Operaciones(num1,num2);

        System.out.println("Que operacion deseas hacer?: ");
        System.out.println("1==>  suma");
        System.out.println("2==>  Resta");
        System.out.println("3==>  Multiplication");
        System.out.println("4==>  Division");

        int choice = scanner1.nextInt();
        double result;

        switch (choice) {
            case 1:
                result = operaciones.suma();
                System.out.println("Resultado: " + result);
                break;
            case 2:
                result = operaciones.resta();
                System.out.println("Resultado: " + result);
                break;
            case 3:
                result = operaciones.multiplicacion();
                System.out.println("Resultado: " + result);
                break;
            case 4:
                result = operaciones.divide();
                if (!Double.isNaN(result)) {
                    System.out.println("Resultado: " + result);
                }
                break;
            default:
                System.out.println("operacion no valida");
        }

        scanner1.close();
    }
}