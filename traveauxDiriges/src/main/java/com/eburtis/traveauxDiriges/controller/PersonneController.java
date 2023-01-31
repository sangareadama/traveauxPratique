package com.eburtis.traveauxDiriges.controller;

import com.eburtis.traveauxDiriges.Model.PersonneModel;
import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.domain.Personne;
import com.eburtis.traveauxDiriges.service.DepartementService;
import com.eburtis.traveauxDiriges.service.IDepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.eburtis.traveauxDiriges.service.IPersonneService;

import java.util.List;

@RestController
@RequestMapping("/api/personne")
@RequiredArgsConstructor
public class PersonneController {

    @Autowired
    private IPersonneService iPersonneService;

    @Autowired
    private IDepartementService iDepartementService;

    @PostMapping("/save")
    public Personne enregistrerPersone(@RequestBody PersonneModel personneModel){

        return iPersonneService.enregistrerPersonne(personneModel);


    }
    @GetMapping("/liste")
    List<Personne> listePersone(){
        return iPersonneService.listePersone();
    }
    @PostMapping("/update")
    public Personne updatePersone(@RequestBody PersonneModel personneModel){
        Personne p = iPersonneService.rechercherParId(personneModel.getId());
        Departement dep = iDepartementService.rechercherDepartementParId(personneModel.getDepartementId());
        p.setNom(personneModel.getNom());
        p.setPrenom(personneModel.getPrenom());
        p.setAge(personneModel.getAge());
        p.setDepartement(dep);
        return iPersonneService.updatePersonne(p);
    }

    @PostMapping("/delete")
    public void supprimerPersone(@RequestBody Personne personne){
         iPersonneService.supprimerPersonne(personne);
    }




}
