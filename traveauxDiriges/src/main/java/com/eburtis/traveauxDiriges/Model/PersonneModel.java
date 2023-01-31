package com.eburtis.traveauxDiriges.Model;

public class PersonneModel {
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private Long departementId;


    public PersonneModel(String nom, String prenom, int age, Long departementId) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.departementId = departementId;
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

    public Long getDepartementId() {
        return departementId;
    }

    public void setDepartementId(Long departementId) {
        this.departementId = departementId;
    }
}
