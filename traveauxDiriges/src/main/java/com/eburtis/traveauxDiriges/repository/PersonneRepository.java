package com.eburtis.traveauxDiriges.repository;

import com.eburtis.traveauxDiriges.domain.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
