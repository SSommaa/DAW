import java.util.Scanner;
public class CBausaSeguraEx1 {
    public static void main(String[] args) {
    System.out.print("Introduce un numero entero");
    Scanner numero = new Scanner(System.in);
    int x = numero.nextInt();
    System.out.println("El valor del cuadrado del número es:"+ x*x);
    numero.close();
    }
    
}