package com.eburtis.traveauxDiriges.repository;

import com.eburtis.traveauxDiriges.domain.Departement;
import com.eburtis.traveauxDiriges.domain.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
}