import java.util.Scanner;

public class EjercicioResuelto10 {
    public static void main(String[] args) {
        
        double patrimonio, estrato, pagmat = 50000;
        String nombres, numero_inscripcion;

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Ingrese el numero de inscripcion del estudiante: ");
        numero_inscripcion = entrada.nextLine();

        System.out.println("Ingrese los nombres del estudiante: ");
        nombres = entrada2.nextLine();

        System.out.println("Ingrese el patrimonio del estudiante ");
        patrimonio = entrada.nextDouble();

        System.out.println("Ingrese el estrato del estudiante: ");
        estrato = entrada.nextDouble();


        if (patrimonio > 2000000 && estrato > 3){
            pagmat = (pagmat + (patrimonio * 0.03));

            System.out.println("El estudiante con numero de inscripcion " + numero_inscripcion + 
            " y nombre " + nombres + " debe pagar $" + pagmat);
            }
            else if (patrimonio < 2000000){

                System.out.println("El estudiante con numero de inscripcion " + numero_inscripcion + 
            " y nombre " + nombres + " debe pagar $" + pagmat);
            
            }
            else if (estrato <= 3){

                System.out.println("El estudiante con numero de inscripcion " + numero_inscripcion + 
            " y nombre " + nombres + " debe pagar $" + pagmat);
            }
         }

    }

