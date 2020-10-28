/**
 * Autor: Izan Torres Barceló.
 * Descripción: El programa compila perfectamente y da el mismo resultado que el de la imagen, no he tenido ninguna dificultad, lo único que me había liado con el printf.
 * pero enseguida lo he solucionado.
 */
import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        final double NUMERO_PI = 3.141;
        int radio, altura, cateto1, cateto2;
        double base, circuloPerimetro, circuloArea, rectanguloArea, hipotenusaAlCuadrado, hipotenusa;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el valor del 'radio' de un círculo:");
        radio = teclado.nextInt();
        System.out.println("Ahora dime el valor de la 'base' de un rectángulo:");
        base = teclado.nextDouble();
        System.out.println("No olvides decirme también el valor de la 'altura' del rectángulo:");
        altura = teclado.nextInt();
        circuloPerimetro = 2*NUMERO_PI*radio;
        circuloArea = NUMERO_PI*radio*radio;
        rectanguloArea = base*altura;
        System.out.printf("De momento tenemos un círculo de perímetro %.2f y área %.2f y un rectángulo de área %.2f\n", circuloPerimetro, circuloArea, rectanguloArea);

        System.out.println("Me gusta el teorema de Pitágoras, dime el valor del 'cateto 1': ");
        cateto1 = teclado.nextInt();
        System.out.println("Y también del 'cateto 2': ");
        cateto2 = teclado.nextInt();
        hipotenusaAlCuadrado = cateto1*cateto1 + cateto2*cateto2;
        hipotenusa = Math.sqrt(hipotenusaAlCuadrado);
        System.out.printf("Vale, pues el valor de la hipotenusa al cuadrado es %.2f,  por lo tanto el valor de la hipotenusa es %.2f\n", hipotenusaAlCuadrado, hipotenusa);

    } 
}
