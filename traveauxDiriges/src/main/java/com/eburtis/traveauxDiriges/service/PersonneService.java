package com.eburtis.traveauxDiriges.service;

import com.eburtis.traveauxDiriges.Model.PersonneModel;
import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.domain.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.eburtis.traveauxDiriges.repository.PersonneRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonneService implements IPersonneService{

    @Autowired
    private PersonneRepository personneRepository;
    @Autowired
    private IDepartementService iDepartementService;
    @Override
    public Personne enregistrerPersonne(PersonneModel personneModel) {
        Departement dep = iDepartementService.rechercherDepartementParId(personneModel.getDepartementId());

        Personne pers=new Personne(personneModel.getNom(),personneModel.getPrenom(),personneModel.getAge(),dep);

        if (personneModel.getAge()>=18){
            pers.setStatus("Majeur");
        }else {
            pers.setStatus("Mineur");
        }

        return personneRepository.save(pers);
    }

    @Override
    public List<Personne> listePersone() {
        return personneRepository.findAll();
    }

    @Override
    public Personne updatePersonne(Personne personne) {

        return personneRepository.save(personne);
    }

    @Override
    public void supprimerPersonne(Personne personne) {
        personneRepository.deleteById(personne.getId());
    }

    @Override
    public Personne rechercherParId(Long id) {
        Optional<Personne> ut = personneRepository.findById(id);
        return ut.get();
    }
}
