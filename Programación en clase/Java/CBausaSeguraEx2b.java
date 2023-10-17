import java.util.Scanner;
public class CBausaSeguraEx2b {
    public static void main(String[] args) {
    System.out.print("Tu nombre\n");
    Scanner nombre = new Scanner(System.in);
    String personaString = nombre.nextLine();
    System.out.println("Hola "+ personaString);
    System.out.print("Introduce un numero entero");
    Scanner numero = new Scanner(System.in);
    int x = numero.nextInt();
    System.out.print("Introduce otro numero entero");
    Scanner numero2 = new Scanner(System.in);
    int y = numero2.nextInt();
    System.out.println("El valor del cuadrado del número es:"+ x*y);
    nombre.close();
    numero.close();
    numero2.close();
    }    
}
