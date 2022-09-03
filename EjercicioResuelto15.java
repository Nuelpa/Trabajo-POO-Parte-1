import java.util.Scanner;
public class EjercicioResuelto15 {
    public static void main(String[] args) {
      
        
    Scanner entrada = new Scanner(System.in);

    double PesoA, PesoB, PesoC, PesoD;
    System.out.println("Ingrese el peso de la esfera A: ");
    PesoA = entrada.nextDouble();
    System.out.println("Ingrese el peso de la esfera B: ");
    PesoB = entrada.nextDouble();
    System.out.println("Ingrese el peso de la esfera C: ");
    PesoC = entrada.nextDouble();
    System.out.println("Ingrese el peso de la esfera D: ");
    PesoD= entrada.nextDouble();

    if (PesoA == PesoB && PesoA ==PesoC){
        System.out.println("La esfera D es la esfera de distinto peso");
        if (PesoD<PesoA){
            System.out.println("Su peso es menor al de las otras esferas ");
            }else{
                System.out.println("Su peso es mayor al de las otras esferas");
            }
        }
    else if (PesoA == PesoB && PesoA ==PesoD){
        System.out.println("La esfera C es la esfera de distinto peso");
        if (PesoC<PesoA){
            System.out.println("Su peso es menor al de las otras esferas ");
            }else{
                System.out.println("Su peso es mayor al de las otras esferas");
            }
        }
    else if (PesoA == PesoC && PesoA ==PesoD){
        System.out.println("La esfera B es la esfera de distinto peso");
        if (PesoB<PesoA){
            System.out.println("Su peso es menor al de las otras esferas ");
            }else{
                System.out.println("Su peso es mayor al de las otras esferas");
            }
        }
    else if (PesoA!=PesoB){
        System.out.println("La esfera A es la esfera de distinto peso");
        if (PesoA<PesoB){
            System.out.println("Su peso es menor al de las otras esferas ");
        }else{
            System.out.println("Su peso es mayor al de las otras esferas");
        }
        }
    }        
    }        
    
    
    




        

