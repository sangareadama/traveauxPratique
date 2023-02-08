package com.eburtis.traveauxDiriges.domain;

import jakarta.persistence.*;

@Entity
@Table(name =Departement.TABLE_NAME )
public class Departement {

    public static final String TABLE_NAME="departement";
    public static final String TABLE_ID=TABLE_NAME+"_id" ;
    public static final String TABLE_SEQ = TABLE_ID + "_seq";

    @Id
    @SequenceGenerator(name = TABLE_SEQ,sequenceName =TABLE_SEQ )
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator =TABLE_SEQ )
    private Long id;
    private String code;
    private String designation;

    public Departement(){
    }
    public Departement(String code, String designation) {
        this.code = code;
        this.designation = designation;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
