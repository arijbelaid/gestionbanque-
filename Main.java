public class Main {
    public static void main (String[] args) throws sansSoldeException{
        Banque uib = new Banque("uib");
        Compte A1 = new Compte("lamia",500);
        Compte A2 = new Compte("aya",750);
        Compte A3 = new CompteEpargne("asma", 600, 0.07);
        Compte A4 = new CompteEpargne("takwa ", 500, 0.07);
        A1.retire(700);
        A1.depose(450);
        uib.addCompte(A1);
        uib.addCompte(A2);
        uib.addCompte(A3);
        uib.addCompte(A4);
        System.out.println(uib);
    }
}

