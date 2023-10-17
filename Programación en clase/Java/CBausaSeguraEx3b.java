import java.util.*;
public class CBausaSeguraEx3b {
    public static void main(String[] args) {
    System.out.print("Introduce el radio\n");
    Scanner radio = new Scanner(System.in);
    int x = radio.nextInt();
    System.out.println("El àrea del circulo es: " + (x*x)* 3.1415926535897932384626433832795028841971693993751058209);
    System.out.println("El perimetro del circulos es: "+ 2 * 3.1415926535897932384626433832795028841971693993751058209 * x);
    radio.close();
    }
}
