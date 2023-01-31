package com.eburtis.traveauxDiriges.service;

import com.eburtis.traveauxDiriges.domain.Departement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class DepartementServiceTest {

    @Autowired
    private IDepartementService iDepartementService;
    @Test
    void enregistrerDepartement() {
        Departement  depExpected= new Departement("CD_DSABOU","dabou");

        Departement  depSaved=iDepartementService.enregistrerDepartement(depExpected);

        assertNotNull(depExpected);
        assertNotNull(depSaved.getId());
        Assertions.assertEquals(depExpected.getCode(),depSaved.getCode());
        Assertions.assertEquals(depExpected.getDesignation(),depSaved.getDesignation());
    }

    @Test
    void updateDepartement() {

        Departement  depExpected= new Departement("CD_DSABOU","dabou");

        Departement  depSaved=iDepartementService.enregistrerDepartement(depExpected);

        Departement depUpdate=depSaved;

        depUpdate.setCode("okkkkkkkkk");

        depSaved=iDepartementService.enregistrerDepartement(depUpdate);


        assertNotNull(depExpected);
        assertNotNull(depSaved.getId());
        Assertions.assertEquals(depExpected.getCode(),depUpdate.getCode());
        Assertions.assertEquals(depExpected.getDesignation(),depUpdate.getDesignation());
    }
}