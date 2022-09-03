import java.util.Scanner;

public class EjercicioResuelto11 {
    
    public static void main(String[] args) {
        int A, B, C;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        A = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        B = entrada.nextInt();

        System.out.println("Ingrese el tercer numero");
        C = entrada.nextInt();


        if (A > B ){
            if (A > C){
                System.out.println("El numero mayor es " + A);
            }
        }
        if (B > C ){
            if (B > A){
                System.out.println("El numero mayor es " + B);

            }
        }

        if (C > A ){
            if (C > B){
                System.out.println("El numero mayor es " + C);
            }
        }


}

}    

