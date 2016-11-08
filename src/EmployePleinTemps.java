/**
 * Created by fatima on 06/11/16.
 */
public class EmployePleinTemps extends Employe{
    private double salaireS,prime;
    //constructeur

    public EmployePleinTemps(String nom, String fonction, double salaireS, double prime){
        super(nom,fonction);
        this.salaireS=salaireS;
        this.prime=prime;
    }

    public double getSalaireS() {
        return salaireS;
    }

    public double getPrime() {
        return prime;
    }
    //j'ai redéfinie la méthode
    public double calcule_salaire(){
        salaire=(salaireS*4)+prime;
        return salaire;
    }

    public String affiche(){
        return "l'employer : "+this.nom+"  qui est "+this.fonction+"  a comme salaire "+calcule_salaire()+" DA";
    }

}
