import java.util.Scanner;

public class Cbausaseguracondicionalsex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de horas que has trabajado esta semana: ");
        Double horas = input.nextDouble();
        Double horas_extra = 0.0;
        Double a_pagar = 0.0;
        if (horas > 35){
            horas_extra = horas - 35;
            System.out.println("Has trabajado un total de: " + horas_extra + "horas extra");
        }
        System.out.println("Introduce lo que cobras por hora: ");
        Double precio_hora = input.nextDouble();
        if (horas_extra == 0){
            a_pagar = precio_hora * horas;
            System.out.println("has ganado un total de: " + a_pagar);

        }
        else {
            a_pagar = precio_hora * 35 + (horas_extra * (precio_hora * 1.50));
            System.out.println("has ganado un total de: " + a_pagar);

        }
        input.close();
    }
}
