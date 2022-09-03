import java.util.Scanner;
public class EjercicioPropuesto23 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double a, b, c, x1, x2;

        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        c = entrada.nextDouble();

        if (a!=0){

            if( (b*b)-(4*a*c) >= 0 ){

            x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/2*a;
            x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/2*a;


            System.out.println("solucion 1: " + x1 + ", solucion 2: " + x2);
            }else{

                System.out.println("Raices complejas");

            }
        }else{
            System.out.println("La unica solucion es: " + -c/b);
        }
          
    }
}
