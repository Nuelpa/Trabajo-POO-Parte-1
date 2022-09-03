import java.util.Scanner;
public class Cap4_EjercicioPropuesto22 {
    public static void main(String[] args) {
        


        String nombre;
        double salario_hora, horas_trabajadas, salario_mensual;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el salario por hora del trabajador: ");
        salario_hora = entrada.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        horas_trabajadas = entrada.nextDouble();

        salario_mensual = horas_trabajadas * salario_hora;

        if (salario_mensual > 450000 ){
            System.out.println(nombre + " gana " + salario_mensual + " mensualmente");
        }else{
            System.out.println(nombre);
        }

    }
}
