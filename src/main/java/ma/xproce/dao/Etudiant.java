package ma.xproce.dao;
import java.awt.*;

public class Etudiant {
    private long id;
    private String nom;
    private String prenom;
    private String email;

    //Constructeur
    public Etudiant(Long id , String nom , String prenom , String email){
        this.id = id;
        this.prenom = prenom;
        this.email = email;
    }

    //Getters
    public  Long getId() {return  id;}
    public String getNom() {return  nom;}
    public String getPrenom() {return  prenom;}
    public  String getEmail() {return email;}



}
