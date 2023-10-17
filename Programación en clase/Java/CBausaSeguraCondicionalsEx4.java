import java.util.Scanner;

public class CBausaSeguraCondicionalsEx4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el año que quieres saber si es bisiesto");
        Double año = input.nextDouble();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0)){
            System.out.println("El año "+ año + " es bisiesto");
        }
        else{
            System.out.println("El año "+ año + " no es bisiesto");
        }
        input.close();
    }
}
