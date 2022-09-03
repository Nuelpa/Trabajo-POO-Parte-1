import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        
        ladostriangulo eltriangulo = new ladostriangulo();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del triangulo");
        eltriangulo.lado1 = entrada.nextDouble();

        System.out.println("Ingrese el lado 2 del triangulo");
        eltriangulo.lado2 = entrada.nextDouble();

        System.out.println("Ingrese el lado 3 del triangulo");
        eltriangulo.lado3 = entrada.nextDouble();


        eltriangulo.perimetro = (eltriangulo.lado1 + eltriangulo.lado2 + eltriangulo.lado3);

        eltriangulo.semiperimetro = ((eltriangulo.lado1 + eltriangulo.lado2 + eltriangulo.lado3)/2);

        eltriangulo.area = (Math.sqrt(eltriangulo.semiperimetro * (eltriangulo.semiperimetro - eltriangulo.lado1)
        * (eltriangulo.semiperimetro - eltriangulo.lado2) * (eltriangulo.semiperimetro - eltriangulo.lado3)));

        System.out.println("El perimetro del triangulo es: " + eltriangulo.perimetro + "\n" + 
        "El semiperimetro del triangulo es: " + eltriangulo.semiperimetro + "\n" + 
        "El area del triangulo es: " + eltriangulo.area);




    }
}


class ladostriangulo{
    double lado1;
    double lado2;
    double lado3;
    double perimetro;
    double semiperimetro;
    double area;
}