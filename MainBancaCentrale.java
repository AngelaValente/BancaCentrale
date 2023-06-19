import java.util.Scanner;
import java.util.ArrayList;

public class MainBancaCentrale {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BancaCentrale nuovaBancaCentrale = new BancaCentrale();
        boolean flag = true;
        while(flag){
            System.out.println("Operazioni disponibili: ");
            System.out.println("1. Registrazione.");
            System.out.println("2. Accesso.");
            System.out.println("3. Uscita.");
            int scelta = scanner.nextInt();
            switch(scelta){
                case 1:
                case 2:
                case 3:
                default: 
                //occorre ancora definire i casi.
            }
        }
    }
}
