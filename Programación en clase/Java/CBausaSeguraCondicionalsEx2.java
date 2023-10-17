import java.util.*;
public class CBausaSeguraCondicionalsEx2 {
    public static void main(String[] args) {
        System.out.println("Introduce las horas que has trabajado");
        Scanner input = new Scanner(System.in);
        Double horas = input.nextDouble();
        System.out.println("Introduce los metros de cable instalados");
        Double metros_cable = input.nextDouble();
        System.out.println("El preu brut a pagar es de: " + (metros_cable*0.5 + horas*30) + "€");
        System.out.println("El preu brut a pagar es de: " + (metros_cable*0.5 + horas*30)*1.21 + "€" );
        input.close();
    }
}
