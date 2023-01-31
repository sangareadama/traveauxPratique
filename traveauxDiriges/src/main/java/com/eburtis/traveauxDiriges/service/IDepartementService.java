package com.eburtis.traveauxDiriges.service;

import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.domain.Personne;

import java.util.List;

public interface IDepartementService{

    public Departement enregistrerDepartement(Departement departement);
    public List<Departement> listeDepartement();
    public Departement updateDepartement(Departement departement);
    public  void supprimerDepartement(Departement departement);
    public Departement rechercherDepartementParId(Long id);
}
