package com.eburtis.traveauxDiriges.service;

import com.eburtis.traveauxDiriges.Model.PersonneModel;
import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.domain.Personne;
import com.eburtis.traveauxDiriges.repository.PersonneRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class PersonneServiceTest {

    @Autowired
    private IPersonneService iPersonneService;

    @Autowired
    private IDepartementService iDepartementService;
    @Test
    public void enregistrerPersonne() {
        PersonneModel persExpected=new PersonneModel("kone","karnom",25,1L);
        Personne persSave= iPersonneService.enregistrerPersonne(persExpected);
        assertNotNull(persExpected);
        assertNotNull(persSave.getId());
        Assertions.assertEquals(persExpected.getNom(),persSave.getNom());
        Assertions.assertEquals(persExpected.getPrenom(),persSave.getPrenom());
        Assertions.assertEquals(persExpected.getAge(),persSave.getAge());
    }

    @Test
    public void updatePersonne() {
        PersonneModel persExpected=new PersonneModel("kone","karnom",25,1L);
        Personne persSave= iPersonneService.enregistrerPersonne(persExpected);

        PersonneModel persModelsave= new PersonneModel(persSave.getNom(),persSave.getPrenom(),persSave.getAge(),persSave.getDepartement().getId());

        PersonneModel persModelToUpdated=persModelsave;
        persModelToUpdated.setNom("ouatarra");

        persSave= iPersonneService.enregistrerPersonne(persModelToUpdated);
        assertNotNull(persModelToUpdated);
        //assertNotNull(persModelToUpdated.getId());
        Assertions.assertEquals(persModelToUpdated.getNom(),persSave.getNom());
        Assertions.assertEquals(persModelToUpdated.getPrenom(),persSave.getPrenom());
        Assertions.assertEquals(persModelToUpdated.getAge(),persSave.getAge());
    }


}

