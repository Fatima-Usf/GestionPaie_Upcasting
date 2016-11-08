/**
 * Created by Fatima on 06/11/16.
 */
public class EmployeTempsPartiel extends Employe{
    double salaireHr, heures;



    public EmployeTempsPartiel(String nom, String fonction, double salaireHr, double heures){
        super(nom,fonction);
        this.salaireHr=salaireHr;
        this.heures=heures;
    }
    //getter
    public double getSalaireHr() {
        return salaireHr;
    }

    public double getHeures() {
        return heures;
    }

    //setter
    public void setSalaireHr(double salaireHr) {
        this.salaireHr = salaireHr;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }


    //redéfinition de la méthode calcule salaire
    public double calcule_salaire(){
        salaire=salaireHr*heures;
        return salaire;
    }

    public String affiche(){
        return "l'employer : "+this.nom+"  qui est "+this.fonction+"  a comme salaire "+calcule_salaire()+" DA";
    }
}
