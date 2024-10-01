package operaciones;

public class Operaciones {
    double num1, num2;
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double suma() {
        return num1 + num2;
    }

    public double resta() {
        return num1 - num2;
    }

    public double multiplicacion() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("no es posible dividir por cero.");
            return Double.NaN;
        }
    }
}