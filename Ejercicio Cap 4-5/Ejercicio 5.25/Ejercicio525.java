import java.util.Scanner;


   public class Ejercicio525

   {        

        private int tamanio = 9;
        public void Imprime()
        { 
            Scanner entrada = new Scanner(System.in);
            int x = 4;

            while ( x % 2 == 0 )
            { 

                System.out.println("\nIngrese un entero impar que definira la dimension del rombo: ");
                x = entrada.nextInt();
            }
            tamanio = x;

            System.out.println("\nRombo: \n\n");

            for ( int i = 1; i <= ((tamanio/2) + 1); i ++ )
            {  
                    
                for ( int  r = 1; r <= tamanio / 2 - i + 1; r++ )
                System.out.printf(" ");      
                for ( int j = (tamanio / 2) - i + 2; j <= (tamanio / 2) + i; j++ )  
                System.out.printf("*");


                System.out.printf("\n"); 
                
            }   

            for ( int l = 1; l <= tamanio / 2; l++ )
            {    

                for( int m = 1; m <= l; m++ )
                {    
                
                    System.out.printf(" "); 
                
                }    

                for (int n = l + 1; n <= tamanio - l  ; n++)
                System.out.printf("*");

                    
                System.out.println();

            }    

        }     
   }        