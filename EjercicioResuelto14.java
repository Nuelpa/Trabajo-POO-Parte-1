import java.util.Scanner;
public class EjercicioResuelto14 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double ventas_dep1, ventas_dep2, ventas_dep3, salar, totventas, porven, salar1, salar2, salar3;
    System.out.println("Ingrese las ventas del departamento 1: ");
    ventas_dep1 = entrada.nextDouble();
    System.out.println("Ingrese las ventas del departamento 2: ");
    ventas_dep2 = entrada.nextDouble();
    System.out.println("Ingrese las ventas del departamento 3: ");
    ventas_dep3 = entrada.nextDouble();
    System.out.println("Ingrese el salario de los trabajadores: ");
    salar = entrada.nextDouble();
    salar1 = salar;
    salar2 = salar;
    salar3 = salar;
    totventas = ventas_dep1 + ventas_dep2 + ventas_dep3;
    porven = totventas * 0.33;

    if(ventas_dep1>porven){
    salar1 = salar1 + salar1 * 0.20;
    System.out.println("Salario vendedores departemento 1: " + salar1 + "\n" + "Salario vendedores departamento 2: " + 
    salar2 + "\n" + "Salario vendedores departamento 3: " + salar3);
    }else if(ventas_dep2>porven){
        salar2 = salar2 + salar2 * 0.20;
        System.out.println("Salario vendedores departemento 1: " + salar1 + "\n" + "Salario vendedores departamento 2: " + 
        salar2 + "\n" + "Salario vendedores departamento 3: " + salar3);
    }else if(ventas_dep3>porven){
        salar3 = salar3 + salar3 * 0.20;
        System.out.println("Salario vendedores departemento 1: " + salar1 + "\n" + "Salario vendedores departamento 2: " + 
        salar2 + "\n" + "Salario vendedores departamento 3: " + salar3);
}
}
}