
import java.time.LocalDateTime;
import java.util.*;
public class Ejercicioabraham2 {
    public static void main(String[] args) {
        System.out.print("Introduce tu nombre\n");
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        System.out.print("Introduce la tarea a realizar\n");
        String tarea = input.nextLine();
        LocalDateTime hora = LocalDateTime.now();
        System.out.println(nombre + "ha realizado " + tarea + "a las " + hora);
        input.close();
        }
    
    
    
    
}
