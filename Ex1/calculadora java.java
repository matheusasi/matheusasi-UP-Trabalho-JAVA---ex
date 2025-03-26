public class Calculadora {

    //adição
    public static double somar(double a, double b) {
        return a + b;
    }

    //subtração
    public static double subtrair(double a, double b) {
        return a - b;
    }

    //multiplicação
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    //divisão
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro:Divisão por Zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
    
        double num1 = 25;
        double num2 = 2;
        double num3 = 0;

        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
        System.out.println("Divisão: " + dividir(num1, num2));

    
        System.out.println("Divisão por zero: " + dividir(num1, num3));
    }
}

