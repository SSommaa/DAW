import java.util.*;
public class CBausaSeguraEx3 {
  public static void main(String[] args) {
    System.out.print("Introduce la base\n");
    Scanner base = new Scanner(System.in);
    int b = base.nextInt();
    System.out.print("Introduce la altura\n");
    Scanner altura = new Scanner(System.in);
    int h = altura.nextInt();
    System.out.println("El perimetro del rectangulo es: "+ (b*2 + h*2));   
    System.out.println("El àrea del rectangulo es: " + b*h);
    base.close();
    altura.close();
    
  }
}
