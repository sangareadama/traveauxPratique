package com.eburtis.traveauxDiriges.service;

import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DepartementService implements IDepartementService{


    @Autowired
    DepartementRepository departementRepository;

    @Override
    public Departement enregistrerDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> listeDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public Departement updateDepartement(Departement departement) {

        Departement dep =rechercherDepartementParId(departement.getId());

        dep.setCode(departement.getCode());
        dep.setDesignation(departement.getDesignation());
        return departementRepository.save(dep);
    }

    @Override
    public void supprimerDepartement(Departement departement) {

    }

    @Override
    public Departement rechercherDepartementParId(Long id) {
        Optional<Departement> ut = departementRepository.findById(id);
        return ut.get();
    }
}
