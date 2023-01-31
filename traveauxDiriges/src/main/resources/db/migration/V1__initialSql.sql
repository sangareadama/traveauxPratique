
CREATE SEQUENCE departement_id_seq START WITH 1 INCREMENT BY 50;
create table departement
(
    id       int8
            primary key,
    code     varchar(20),
    designation  varchar(20)

);

INSERT INTO departement (id, code, designation)
VALUES (1,'BO5','Dabou'),
        (2,'B06','YAkassé'),
        (3,'B08','Lahou');



CREATE SEQUENCE personne_id_seq START WITH 1 INCREMENT BY 50;
create table personne
(
    id       int8
            primary key,
    departement_id int8,
    nom     varchar(20),
    prenom  varchar(20),
    age     int4,
    status varchar(10),
    constraint personne_depatement_fk foreign key (departement_id) references departement(id)

);
