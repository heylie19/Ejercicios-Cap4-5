/* validar sus entradas. 
Para cualquier entrada, si el valor introducido es distinto de 1 o 2, debe seguir iterando 
hasta que el usuario introduzca un valor correcto.*/

import java.util.Scanner;
public class Ejercicio435
{


    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);

        int res, contador=1;

        while(contador<=10)
        {
        System.out.print("Ingrese un numero distinto de 1 y 2 para seguir repitiendo el mensaje: ");
        res=entrada.nextInt();

        if(res>=3)
        {
            System.out.println("Hola, Bienvenido a java");
        }

        if(res==1 || res==2)
        {
            System.out.println("Programa Terminado");
            break;
        }

        }
    }
}
