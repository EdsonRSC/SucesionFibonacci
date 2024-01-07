import java.util.Scanner;
public class SucesionFibonacci {
    public static void main(String[] args) {
    //Declaracion de variables
    int a=0, b=1, aux;
    Scanner en = new Scanner(System.in);
    System.out.println("Hasta que numero quieres que se impriman?");
    int limite = en.nextInt();
    if (limite >= 0) {
        System.out.print(a);

        if (limite > 0) {
            System.out.print(", ");
        }

        for (int i = 1; i <= limite; i++) {
            aux = a;
            a = b;
            b = aux + b;

            if (i < limite) {
                System.out.print(a + ", ");
            } else {
                System.out.print(a);
            }
        }
    } else {
        System.out.println("Por favor, ingresa un número no negativo para el límite.");
    }
    en.close();
}
}
