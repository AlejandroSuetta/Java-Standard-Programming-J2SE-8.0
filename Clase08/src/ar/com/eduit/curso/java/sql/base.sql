drop database if exists colegio;
create database colegio;
use colegio;
create table cursos(
    id          int auto_increment primary key,
    titulo      varchar(20) not null,
    profesor    varchar(20) not null,
    dia         varchar(20) not null 
        check(dia in('Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes')),
    turno       varchar(20) not null 
        check(turno in ('Mañana', 'Tarde', 'Noche'))
);
create table alumnos(
    id          int auto_increment primary key,
    nombre      varchar(20) not null,
    apellido    varchar(20) not null,
    edad        int not null,
    curso       int not null
);
alter table alumnos
    add constraint FK_alumnos_curso
    foreign key(curso) references cursos(id); 