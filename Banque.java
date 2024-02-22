
import java.util.ArrayList;
import java.util.List;
public class Banque {
    
    String nom;
    List<Compte> clients;
    public Banque(String nom){
        this.nom = nom;
        this.clients = new ArrayList<Compte>();
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return this.nom;
    }
    public void addCompte(Compte c){
        this.clients.add(c);
    }
   
    public String toString(){
        String res = " Banque "+this.nom+" \n";
        int l=res.length();
        for (int i=0;i<this.clients.size();i++){
            res+=this.clients.get(i).toString()+"\n";
        }
        return res;
}
}
