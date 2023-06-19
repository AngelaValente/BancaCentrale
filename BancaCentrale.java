import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class BancaCentrale {
    public ArrayList<String> nomeUtenti = new ArrayList<>();
    public ArrayList<String> passwordUtenti = new ArrayList<>();

    public void RegistrazioneControllo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome utente: ");
        String nomeUtente = scanner.nextLine();
        System.out.println("Inserisci la tua password: ");
        String passwordUtente = scanner.nextLine();
        boolean trovato1 = false;
        for(int i = 0; i < nomeUtenti.size(); i++){
            if (!Objects.equals(nomeUtenti.get(i), nomeUtente)){
                System.out.println("Registrazione effettuata con successo!");
                nomeUtenti.add(nomeUtente);
                passwordUtenti.add(passwordUtente);
                trovato1 = true;
            }
        }
            if(!trovato1){
                System.out.println("Siamo spiacenti, queste credenziali sono già in uso.");
            }
    }

    public void Accesso(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome utente: ");
        String nomeUtente = scanner.nextLine();
        System.out.println("Inserisci la tua password: ");
        String passwordUtente = scanner.nextLine();
        boolean trovato2 = false;
        for(int i = 0; i < nomeUtenti.size(); i++){
            if (Objects.equals(nomeUtenti.get(i), nomeUtente)){
                System.out.println("Accesso effettuato con successo!");
                trovato2 = true;
            }
        }
            if(!trovato2){
                System.out.println("Siamo spiacenti, accesso negato.");
            }
    }

    public void sceltabanca() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il capitale: ");
        int capitale = scanner.nextInt();
        System.out.println("A quale banca vuoi accedere?");
        System.out.println("1. Banca SBI.");
        System.out.println("2. Banca ICICI.");
        System.out.println("3. Banca AXIS.");
        scanner.nextLine();
        int scelta = scanner.nextInt();
        float interesse = 0;
        switch(scelta){
            case 1: 
                AXIS banca1 = new AXIS();
                interesse = banca1.getTassoInteresse(capitale);
                System.out.println("In riferimento al capitale inserito, l'interesse corrisponde a: " + interesse + ".");
                break;
            case 2:
                ICICI banca2 = new ICICI();
                interesse = banca2.getTassoInteresse(capitale);
                System.out.println("In riferimento al capitale inserito, l'interesse corrisponde a: " + interesse + ".");
                break;
            case 3:
                ICICI banca3 = new ICICI();
                interesse = banca3.getTassoInteresse(capitale);
                System.out.println("In riferimento al capitale inserito, l'interesse corrisponde a: " + interesse + ".");
                break;
            default: 
                System.out.println("Operazione non disponibile.");
                break;
        }
    }
}

class Banca extends BancaCentrale {
    public float getTassoInteresse(int capitale) { //Creo una funzione che stampa il tasso di interesse.
        return capitale;
    }
}

class SBI extends Banca { //Estendo classe Banca. 
        //SBI tasso1 = new SBI(); //Creo nuovo oggetto SBI.
        int tasso1 = 8; //Dichiaro valore tasso.
        // interesse = tasso1.getTassoInteresse(valore1); //Richiamo funzione ereditata dalla classe Banca.
        public float getTassoInteresse(int capitale){
            float interesse = 0;
            interesse = ((capitale/100)*tasso1);
            return interesse;
        }
    }

class ICICI extends Banca {
    //public static void main(String[] args){
        //ICICI tasso2 = new ICICI();
        int tasso2 = 7;
        public float getTassoInteresse(int capitale){
            float interesse = 0;
            interesse = ((capitale/100)*tasso2);
            return interesse;
        //tasso2.getTassoInteresse(valore2);
    //}
    }
}

class AXIS extends Banca {
    //public static void main(String[] args){
        //AXIS tasso3 = new AXIS();
        int tasso3 = 9;
        //tasso3.getTassoInteresse(valore3);
    //}
    public float getTassoInteresse(int capitale){
            float interesse = 0;
            interesse = ((capitale/100)*tasso3);
            return interesse;
    }
}

