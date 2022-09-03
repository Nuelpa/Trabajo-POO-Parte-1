import java.util.Scanner;
public class EjercicioResuelto12 {
    public static void main(String[] args) {
        
        String nombre;
        int horas_trabajadas, valor_hora, horas_extra, horas_extra_ocho, salario, pago_horas_extra;
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas_trabajadas = entrada.nextInt();

        System.out.println("Ingrese el valor de cada hora trabajada: ");
        valor_hora = entrada.nextInt();

        System.out.println("Ingrese las horas extra trabajadas: ");
        horas_extra = entrada.nextInt();

        System.out.println("Ingrese las horas extras que exceden las 8: ");
        horas_extra_ocho = entrada.nextInt();



        if (horas_trabajadas>40){
            horas_extra = horas_trabajadas - 40;
            if (horas_extra>8){
                horas_extra_ocho = horas_extra - 8;
        
                pago_horas_extra = (valor_hora * 2 * 8 + valor_hora * 3 * horas_extra_ocho);
                salario = ((valor_hora * 40) + pago_horas_extra);
                System.out.println("El trabajador " + nombre + " devengó: $" + salario);

            }
            else{
            pago_horas_extra = horas_extra * 2;    
            salario = ((valor_hora * 40) + pago_horas_extra);
            System.out.println("El trabajador " + nombre + " devengó: $" + salario);
            }              
       }
        else{
            salario = valor_hora * horas_trabajadas;
            System.out.println("El trabajador " + nombre + " devengó: $" + salario);

        }
}
}