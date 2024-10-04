import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMEN_UD1 {
    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        int aux = 0;


        while (aux == 0) {

            try {
                System.out.println("introduce un numero");
                num1 = entrada.nextInt();
                System.out.println("introduce un numero");
                num2 = entrada.nextInt();

                System.out.println("introduce un numero");
                num3 = entrada.nextInt();
                aux = 1;

            } catch (InputMismatchException er) {
                System.out.println("Error Introduzca valores correctos");
                entrada.nextLine();
                float resultado12 = num1 + num2;
                float resultadox = num3 + resultado12;
                float resultadomedia = (resultadox / 3);
                System.out.println("El resultado es" + resultadomedia);






    }
}}}