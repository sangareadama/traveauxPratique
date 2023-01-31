package com.eburtis.traveauxDiriges.controller;

import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.service.IDepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departement")
@RequiredArgsConstructor
public class DepartementController {

    @Autowired
    private IDepartementService iDepartementService;

    @PostMapping("/save")
    public Departement enregistrerDepartement(@RequestBody Departement departement){
        return iDepartementService.enregistrerDepartement(departement);
    }
    @GetMapping("/liste")
    List<Departement> listeDepartement(){
        return iDepartementService.listeDepartement();
    }
}
