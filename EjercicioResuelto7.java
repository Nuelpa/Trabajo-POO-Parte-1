import java.util.Scanner;
public class EjercicioResuelto7 {
    public static void main(String[] args) {
        float A, B;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor A");
        A = entrada.nextFloat();
        System.out.println("Ingrese el valor B");
        B = entrada.nextFloat();


        if (A>B){
            System.out.println("A es mayor que B");
        }

        if (A<B){
            System.out.println("A es menor que B");
        }

        if (A == B){
            System.out.println("A es igual a B");
        }
        


    }
}
