//Este codigo sirve para saber si un número es par o impar
import java.util.*;
public class CBausaSeguraCondicionalsEx1 {
    public static void main(String[] args) {
     System.out.println(" Introduce el numero que quieres saber si es par o impar");
        Scanner input = new Scanner(System.in);
        // Creamos la variable x como Double por si el numero introducido por el usuario es un numero decimal
        int x = input.nextInt();
        // el % te da el resto de la división, al dividir entre 2 un numero siempre tendremos 2 opciónes que el resto sea 0 (en el caso de los numeros pares) 
        // y el 1 (en el caso de los numeros impares)
       
        if ( x%2 == 0){
            System.out.println("El numero: " + x + " es par");
        }
        else{
            System.out.println("El numero: " + x + " es impar");
        }
        input.close();
    }
}