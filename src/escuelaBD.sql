DROP DATABASE IF EXISTS escuela;
CREATE DATABASE escuela;

use escuela;
CREATE TABLE escuela(
	id int(7) auto_increment PRIMARY KEY NOT NULL,
	nombre varChar(50),
    app varChar(50),
    apm varChar(50),
    escuela varChar(100)
);

select * from escuela;