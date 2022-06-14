import java.util.Scanner; 
  
  public class Ejercicio516
  {         
    public void Imprime()
    {      
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIngrese cinco enteros entre 5 y 30  y se imprimira un histograma horizontal.");

        int numero;
        int contador = 1;
        while ( contador <= 5 )
        {         
            System.out.printf("\nIngrese el numero %d:\n ", contador);
            numero = entrada.nextInt();
            if ((5 <= numero) && ( 30 >= numero))
            { 
                for ( int i = 1; i <= numero; i++ )
                System.out.print("*");
                System.out.println();
                contador++;
            }       
        } 
    }     
  }        