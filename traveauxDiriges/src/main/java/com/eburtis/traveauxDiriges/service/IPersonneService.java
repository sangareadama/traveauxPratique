package com.eburtis.traveauxDiriges.service;

import com.eburtis.traveauxDiriges.Model.PersonneModel;
import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.domain.Personne;

import java.util.List;

public interface IPersonneService{
    public Personne enregistrerPersonne(PersonneModel personneModel);
    public List<Personne> listePersone();
    public Personne updatePersonne(PersonneModel personneModel);
    public  void supprimerPersonne(Personne personne);

    public Personne completeUpdate(Personne personne);
    public Personne rechercherParId(Long id);
}
