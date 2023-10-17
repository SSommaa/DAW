import java.util.Scanner;

public class CBausaSeguraCondicionalsEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 3 numeros, primero uno y despues otro, tres veces seguidas: ");
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();
        
        if (num1 >= num2 && num2 >= num3){
            System.out.println("Has introducido los numeros de mayor a menor");
        }
        else if (num3 >= num2 && num2 >= num1){
            System.out.println("Has introducido los numeros de menor a mayor");
        }
        else{
            System.out.println("Has introducido los numeros desordenados");
        }
        input.close();
    }   

}
