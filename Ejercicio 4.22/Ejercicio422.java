//(Salida tabular) Escriba una aplicación en Java que utilice ciclos para imprimir la siguiente tabla de valores

public class Ejercicio422 
{
    public static void main(String[] args)
    {
        String linea[]=new String[5];

        System.out.println("N   10*N    100*N    1000*N");

        for(int i=1; i<=linea.length; i++ )
        {
            System.out.printf("%d%6d%9d%10d%n", i, i*10, i*100, i*1000);
        }
    }
}
