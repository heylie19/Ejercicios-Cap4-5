public class Ejercicio425
{
   public static void main(String[] args)
    {
        int cuenta = 1;
    
        while (cuenta <= 10)
        {
            System.out.println(cuenta % 2 == 1 ? "****" : "++++++++");
            ++cuenta;
        }
   }
}
