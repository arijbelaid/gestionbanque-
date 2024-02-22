
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
    public String Reform(String x,int l){
        
        for(int i = x.length()+3 ;i<l ;i++){
            x+=" ";
        }
        x+="**";
        return x;
    }
    public String toString(){
        System.out.println("");
        String res = "** Banque "+this.nom+" **\n";
        int l=res.length();
        for (int i=0;i<this.clients.size();i++){
            res+=this.Reform("**"+ this.clients.get(i).toString(),l)+"\n";
        }
        return res;
    }
}
    
