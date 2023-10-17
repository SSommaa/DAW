import java.util.Scanner;

public class Cbausaseguracondicionalsex6 {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("===============================\n" + "= 1.- Euros a Dolares \n" + "= 2.- Euros a Yenes \n" + "= 3.- Dolares a Euros \n" + "= 4.- Dolares a Yenes \n" + 
     "= 5.- Yenes a Euro\n" + "= 6.- Yenes a Dolares \n" + "===============================\n" + "= Tria una opció de conversio = \n" + "===============================\n");
     Double euros_dolars = 1.11894;
     Double euro_yen = 115.998;
     int opció = input.nextInt();
     Double euros = 0.00;
     Double dolares = 0.00;
     Double dolar_yen = 0.00;
     if (opció == 1){
        System.out.println("Has escogido pasar de Euros a dolares, introduce la cantidad de euros que tienes: ");
        euros = input.nextDouble();
        System.out.println("Tienes: " + euros * euros_dolars + "Dolars");
     }
    else if (opció == 2){
        System.out.println("Has escogido pasar de Euros a Yenes, introduce la cantidad de euros que tienes: ");
        euros = input.nextDouble();
        System.out.println("Tienes: " + euros * euro_yen + " Yenes");

     }
     else if (opció == 3){
        System.out.println("Has escogido pasar de Dolares a Euros, introduce la cantidad de dolares que tienes: ");
        dolares = input.nextDouble();
        System.out.println("Tienes: " + dolares / euros_dolars + " dolares");

     }
     else if (opció == 4){
        System.out.println("Has escogido pasar de Dolares a Euros, introduce la cantidad de dolares que tienes: ");
        dolares = input.nextDouble();
        System.out.println("Tienes: " + dolares / euros_dolars + " dolares");

     }

  }   
}

