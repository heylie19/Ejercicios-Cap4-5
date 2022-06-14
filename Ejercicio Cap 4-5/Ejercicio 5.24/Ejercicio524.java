public class Ejercicio524 
  
{ 
    private int Tamanio = 9;

    public void Imprime()
    {      
        for ( int i = 1; i <= ((Tamanio/2) + 1); i ++ )
        {
            for ( int  k = 1; k <= Tamanio / 2 - i + 1; k++ )
            System.out.printf(" ");   
               
            for ( int j = (Tamanio / 2) - i + 2; j <= (Tamanio / 2) + i; j++ )  
            System.out.printf("*");
            System.out.printf("\n");
        }
        for ( int l = 1; l <= Tamanio / 2; l++ )
        { 
            for( int m = 1; m <= l; m++ )
            {
                System.out.printf(" ");
            } 

            for (int n = l + 1; n <= Tamanio - l  ; n++)
            System.out.printf("*");
            System.out.println();
        }    
    }    
}         
