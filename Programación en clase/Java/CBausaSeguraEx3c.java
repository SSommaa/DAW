import java.util.*;
public class CBausaSeguraEx3c {
    public static void main(String[] args) {
    System.out.print("Introduce el radio\n");
    Scanner radio = new Scanner(System.in);
    int x = radio.nextInt();
    Double y = 4.0/3.0;
    System.out.println("El volumen de la esfera es: " + (y)* 3.1415926535897932384626433832795028841971693993751058209 * (x*x*x));
    radio.close();
    }
}
