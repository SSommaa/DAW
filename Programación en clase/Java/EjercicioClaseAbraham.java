import java.util.*;
public class EjercicioClaseAbraham {

    public static void main(String[] args) {
    System.out.print("Introduce la distancia recorrida en kilometros\n");
    Scanner distancia = new Scanner(System.in);
    int km = distancia.nextInt();
    System.out.print("Introduce el tiempo que has tardado\n");
    Scanner tiempo = new Scanner(System.in);
    int tmp = tiempo.nextInt();
    System.out.println("Has ido a una velocidad promedio de: " + (km/tmp) + " kilometros hora");
    distancia.close();
    tiempo.close();
    }


}
