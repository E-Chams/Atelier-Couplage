package ma.xproce.presentation;

import ma.xproce.dao.Etudiant;
import ma.xproce.dao.EtudiantDAO;
import ma.xproce.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args)
    {
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        //Adding new students
        etudiantManager.addEtudiant(new Etudiant(1L,"Echams","SALMA","echams@gmail.com"));
        etudiantManager.addEtudiant(new Etudiant(2L,"Daraaoui","Ibtissam","daraaoui@gmail.com"));
        etudiantManager.addEtudiant(new Etudiant(3L,"Mahloul","Inass","mahloul@gmail.com"));
        etudiantManager.addEtudiant(new Etudiant(4L,"Riahi","Kenza","Kenza@gmail.com"));

        for(Etudiant e : etudiantManager.getAllEtudiants()){
            System.out.println(e.getEmail());
        }



    }
}
