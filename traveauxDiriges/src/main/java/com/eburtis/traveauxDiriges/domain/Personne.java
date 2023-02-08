package com.eburtis.traveauxDiriges.domain;

import com.eburtis.traveauxDiriges.Model.PersonneModel;
import com.eburtis.traveauxDiriges.service.IDepartementService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = Personne.TABLE_NAME)


public class Personne {

    public static final String TABLE_NAME="personne";
    public static final String TABLE_ID=TABLE_NAME+"_id" ;
    public static final String TABLE_SEQ = TABLE_ID + "_seq";

    @Id
    @SequenceGenerator(name = TABLE_SEQ,sequenceName =TABLE_SEQ )
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator =TABLE_SEQ )
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private  String status;
    @ManyToOne
    @JoinColumn(name = Departement.TABLE_ID,nullable = false)
    private Departement departement;

     public Personne() {
    }
    public Personne(String nom, String prenom, int age, Departement departement) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.departement = departement;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Departement getDepartement() {
        return departement;
    }
    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void mettreAjour(PersonneModel personneModel) {
        this.nom = personneModel.getNom();
        this.prenom = personneModel.getPrenom();
        this.age= personneModel.getAge();
        this.status=personneModel.getStatus();
    }

    public void ajoutStatus(String status){
         this.status=status;
    }

}
