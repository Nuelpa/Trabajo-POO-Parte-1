import java.util.Scanner;
public class EjercicioResuelto13 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        double valor_compra, valor_pagar, descuento;
        String color_bolita;

        System.out.println("Ingrese el valor de la compra: ");
        valor_compra= entrada.nextDouble();

        System.out.println("Ingrese el color de la bolita: ");
        color_bolita= entrada2.nextLine();

        
        if (color_bolita.equals("blanco")){
            System.out.println("El cliente debe pagar $" + valor_compra + " , no se obtuvo descuento alguno");
        
               }else if (color_bolita.equals("verde")){
                valor_compra = valor_compra - valor_compra * 0.10;
                System.out.println("El cliente debe pagar $" + valor_compra);
                
               }else if (color_bolita.equals("amarillo") ){
                valor_compra = valor_compra - valor_compra * 0.25;
                System.out.println("El cliente debe pagar $" + valor_compra);
                 
               }else if (color_bolita.equals("azul") ) {
                valor_compra = valor_compra - valor_compra * 0.50;
                System.out.println("El cliente debe pagar $" + valor_compra);
                }

    }
}

