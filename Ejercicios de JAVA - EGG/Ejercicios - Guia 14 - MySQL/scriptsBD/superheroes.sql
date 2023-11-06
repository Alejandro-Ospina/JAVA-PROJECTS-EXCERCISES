DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );
  
insert into creador (id_creador, nombre) values (1,"Marvel");
insert into creador (id_creador, nombre) values (2,"DC Comics");

select * from creador;

insert into personajes (id_personaje, nombre_real, personaje, inteligencia, fuerza, velocidad, 
poder, aparicion, ocupacion, id_creador) values 
(1, "Bruce Banner", "Hulk", 160, "600 mil", 75, 98, 1962, "Físico nuclear", 1),
(2, "Tony Stark", "Iron man", 170, "200 mil", 70, 123, 1963, "Inventor industrial", 1),
(10, "Barry Allen", "Flash", 160, "10 mil", 120, 168, 1956, "científico forense", 2),
(11, "Bruce Wayne", "Batman", 170, "500", 32, 47, 1939, "Hombre de negocios", 2),
(12, "Clark Kent", "Superman", 165, "infinita", 120, 182, 1948, "Reportero", 2);

select * from personajes;

update personajes set aparicion = 1938 where id_personaje = 12;

select * from personajes;

delete from personajes where id_personaje = 10;

select * from personajes;

select nombre_real, (velocidad+poder) from personajes;

select nombre_real, personaje from personajes where poder <= 70;

select nombre_real from personajes where nombre_real like "b%";

select nombre_real, personaje from personajes order by inteligencia asc;