import java.util.Scanner;
public class Cap3_Ejercicio18 {
    public static void main(String[] args) {
        empleado elempleado = new empleado();    
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Ingrese el codigo del empleado: ");
        elempleado.codigo_empleado = entrada.nextInt();

        System.out.println("Ingrese el nombre del empleado: ");  
        elempleado.nombres = entrada2.nextLine();
       
        System.out.println("Ingrese las horas trabajadas: ");
        elempleado.horas_trabajadas = entrada.nextInt();

        System.out.println("Ingrese el valor de cada hora: ");
        elempleado.valor_hora = entrada.nextInt();

        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        elempleado.porcentaje_ret_fuente= entrada.nextFloat();

        //Resultados:
        elempleado.salario_bruto = (elempleado.horas_trabajadas * elempleado.valor_hora);
        elempleado.cantidad_retenida = (elempleado.salario_bruto * (elempleado.porcentaje_ret_fuente/100));
        elempleado.salario_neto = (elempleado.salario_bruto - elempleado.cantidad_retenida);

        System.out.println("El codigo del empleado es: " + elempleado.codigo_empleado + "\n" + 
        "El nombre del empleado es: " + elempleado.nombres + "\n" + "Su salario bruto es de: " + elempleado.salario_bruto +
        "\n" + "Su salario neto es de: " + elempleado.salario_neto );
    }
    
    

}

class empleado{
    int codigo_empleado;
    String nombres;
    int horas_trabajadas;
    int valor_hora;
    float porcentaje_ret_fuente; 
    float salario_bruto;
    float salario_neto;
    float cantidad_retenida;
}


