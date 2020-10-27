import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        double num1, num2, resultado;
        byte operacion;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el primer número: ");
        num1 = teclado.nextDouble();
        System.out.print("\nDime el segundo número: ");
        num2 = teclado.nextDouble();
        System.out.print("\nIntroduce la operación deseada: ");
        operacion = teclado.nextByte();

        switch (operacion){
            case 1:
            resultado = num1+num2;
            System.out.printf("\nLa suma es :%.2f\n", resultado);
            break;
            case 2:
            resultado = num1-num2;
            System.out.printf("\nLa resta es :%.2f\n", resultado);
            break;
            case 3:
            resultado = num1*num2;
            System.out.printf("\nLa multiplicación es :%.2f\n", resultado);
            break;
            case 4:
            resultado = num1/num2;
            System.out.printf("\nLa división es :%.2f\n", resultado);
            break;
        }
       
    } 
}
