/* (Calculadora de comisiones de ventas)
200 por semana, mas el 9% de su venta*/

import java.util.Scanner;

public class Ejercicio419 
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);

        String nombre;
        int numArticulo, salario=200, res ;
        double salarioExtra;

        System.out.println("Nombre del Empleado: ");
        nombre=entrada.next();

        do{
        System.out.println("Numero del Articulo Vendido: ");
        numArticulo=entrada.nextInt();

        if(numArticulo==1)
        {
        salarioExtra = 239.99*0.09;
        System.out.printf("%s supago es: %.2f%n",nombre,salario+salarioExtra);
        }
        if(numArticulo==2)
        {
        salarioExtra = 129.75*0.09;
        System.out.printf("%s supago es: %.2f%n",nombre,salario+salarioExtra);
        }
        if(numArticulo==3)
        {
        salarioExtra = 99.95*0.09;
        System.out.printf("%s supago es: %.2f%n",nombre,salario+salarioExtra);
        }
        if(numArticulo==4)
        {
        salarioExtra = 350.89*0.09;
        System.out.printf("%s supago es: %.2f%n",nombre,salario+salarioExtra);
        }


        System.out.printf("Desea ingresar otro articulo 1)SI o 2)NO\n");
        res=entrada.nextInt();

        }
        while(res==1);

    

    }
}
