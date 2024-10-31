package ma.xproce.metier;

import ma.xproce.dao.Etudiant;
import ma.xproce.dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;
    public EtudiantManager(EtudiantDAO etudiantDAO){
        this.etudiantDAO = etudiantDAO;
    }
    public Etudiant addEtudiant(Etudiant etudiant){

        for(Etudiant e : etudiantDAO.getAllEtudiants())
        {
            if( e.getEmail().equals(etudiant.getEmail()) && e.getNom().equals(etudiant.getNom()) && e.getPrenom().equals(etudiant.getPrenom()) )
            {
                throw new IllegalArgumentException("Email déjà utilisé !");
            }

        }
        return etudiantDAO.addEtudiant(etudiant);

    }
    public List<Etudiant> getAllEtudiants()
    {
        return etudiantDAO.getAllEtudiants();
    }
}
