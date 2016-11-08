/**
 * Created by fatima on 06/11/16.
 */
public class Employe {

    protected String nom,fonction;
    protected double salaire;
    //constructeur

    public Employe(String nom, String fonction)

    {   this.nom=nom;
        this.fonction=fonction;
    }
    //getter
    public String getNom() {
        return nom;
    }


    public String getFonction() {
        return fonction;
    }


    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    //j'ai mis set ici car le nom d'un(e) employé  peut etre modifié si par exemple une femme se mari
    public void setNom(String nom) {
        this.nom = nom;
    }


    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public double getScalaire() {
        return salaire;
    }

    //méthode qui affiche le nom, la fonction et le salaire
    public String affiche(){
        return "l'employer : "+this.nom+"  qui est "+this.fonction+"  a comme salaire "+this.getScalaire()+" DA ";
    }

    //juste pour redefinre dans les classes filles
    public double calcule_salaire(){
        return salaire;
    }

}




