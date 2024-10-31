package ma.xproce.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionnary {
    private Map<Long, Etudiant> etudiantsMap = new HashMap<>();
    public Etudiant addEtudiant(Etudiant etudiant)
    {
        etudiantsMap.put(etudiant.getId(),etudiant);
        return etudiant;
    }
    public List<Etudiant> getAllEtudiants()
    {
        return new ArrayList<>(etudiantsMap.values());
    }

}
