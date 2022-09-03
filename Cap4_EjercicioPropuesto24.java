import java.util.Scanner;
public class EjercicioPropuesto24 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double esferaA, esferaB, esferaC;

        System.out.println("Ingrese el peso de la esfera A: ");
        esferaA = entrada.nextDouble();

        System.out.println("Ingrese el peso de la esfera B: ");
        esferaB = entrada.nextDouble();

        System.out.println("Ingrese el peso de la esfera C: ");
        esferaC = entrada.nextDouble();

        if(esferaA>esferaB && esferaA>esferaC){
            System.out.println("La esfera A es la más pesada");

        }else if(esferaB>esferaA && esferaB>esferaC){
                System.out.println("La esfera B es la más pesada");

            
            }else if (esferaC>esferaA && esferaC>esferaB){
            System.out.println("La esfera C es la más pesada");
            }
        }
}
