public class sansSoldeException extends Exception{
    public sansSoldeException() {}
    public sansSoldeException(String message) {
        super(message);
    }
    public String toString(){
        return "Solde insuffisant !!!";
    }
}

