
    /**
     * Created by fatima on 06/11/16.
     */
    public class Main {
        public static void main(String[] args) {
            //déclaration d'un tableau de type Employe
            Employe[] t =new Employe[3];

            t[0]=new Employe("Salim","programmeur");
            t[0].setSalaire(100000);
            System.out.println(t[0].affiche());

            //upcasting  / type de déclaration du tableau t est Employe et le type réel est EmployePleinTemps
            t[1]=new EmployePleinTemps("Halima","sécrétaire",2000.00,400.00);

            System.out.println(t[1].affiche());

            // la méme chose mais ici le type réel est EmployeTempsPartiel
            t[2]=new EmployeTempsPartiel("Abdelbalim","agent de sécurité",400,3);

            System.out.println( t[2].affiche());

        }
    }


