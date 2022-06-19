CREATE DATABASE Asesoria_BD;
USE Asesoria_BD;

CREATE TABLE Facultad (
    FacultadID int auto_increment,
    Nombre varchar(100) NOT NULL,
    PRIMARY KEY (FacultadID)
);

CREATE TABLE Escuela (
    EscuelaID int auto_increment,
    FacultadID int,
    NombreEAP varchar(50) NOT NULL,
    PRIMARY KEY (EscuelaID),
    FOREIGN KEY (FacultadID) REFERENCES Facultad (FacultadID)
);

CREATE TABLE Tutor (
    TutorID varchar(8),
    EscuelaID int,
    Dni varchar(8) UNIQUE NOT NULL,
    Apellidos varchar(45) NOT NULL,
    Nombres varchar(45) NOT NULL,
    CorreoInstitucional varchar(45) NOT NULL,
    Celular int DEFAULT NULL,
    Fecha_nacimiento date DEFAULT NULL,
    Img longblob DEFAULT NULL,
    PRIMARY KEY (TutorID),
    FOREIGN KEY (EscuelaID) REFERENCES Escuela (EscuelaID)
);

CREATE TABLE Tutorado (
    TutoradoID int auto_increment,
    Apellidos varchar(45) NOT NULL,
    Nombres varchar(45) NOT NULL,
    Celular int DEFAULT NULL,
    Correo varchar(45) DEFAULT NULL,
    PRIMARY KEY (TutoradoID)
);

CREATE TABLE Sesion (
    SesionID int auto_increment,
    TutorID varchar(8),
    TutoradoID int,
    FechaActual datetime DEFAULT now(),
    FechaAcordada datetime NOT NULL,
    Curso varchar(30) NOT NULL,
    Descripcion varchar(200) DEFAULT NULL,
    PRIMARY KEY (SesionID),
    FOREIGN KEY (TutorID) REFERENCES Tutor (TutorID),
    FOREIGN KEY (TutoradoID) REFERENCES Tutorado (TutoradoID)    
);

CREATE TABLE AsistenciaTutor(
    TutorID varchar(8),
    SesionID int,
    HoraLLegada datetime DEFAULT now(),
    PRIMARY KEY (TutorID, SesionID),
    FOREIGN KEY (TutorID) REFERENCES Tutor (TutorID),
    FOREIGN KEY (SesionID) REFERENCES Sesion (SesionID)    
);

CREATE TABLE AsistenciaTutorado(
    TutoradoID int,
    SesionID int,
    HoraLLegada datetime DEFAULT now(),
    PRIMARY KEY (TutoradoID, SesionID),
    FOREIGN KEY (TutoradoID) REFERENCES Tutorado (TutoradoID),
    FOREIGN KEY (SesionID) REFERENCES Sesion (SesionID)    
);

/* REGISTRO DE FACULTADES */
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ingeniería de Sistemas e Informática');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ingeniería Electrónica y Eléctrica');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ingeniería Geológica, Minera, Metalúrgica y Geográfica');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Administrativas');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Derecho y Ciencia Política');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ingeniería Industrial');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Química e Ingeniería Química');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Medicina');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Farmacia y Bioquímica');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Odontología');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Medicina Veterinaria');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Psicología');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Biológicas');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Físicas');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Matemáticas');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Contables');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Económicas');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Letras y Ciencias Humanas');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Educación');
INSERT INTO Facultad (Nombre) VALUES ('Facultad de Ciencias Sociales');

/* REGISTRO DE ESCUELAS */
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (1, 'Ingeniería de Sistemas');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (1, 'Ingeniería de Software');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (1, 'Ciencias de la computación');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (2, 'Ingeniería Electrónica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (2, 'Ingeniería de Telecomunicaciones');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (2, 'Ingeniería Eléctrica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (2, 'Ingeniería Biomédica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (3, 'Ingeniería Geológica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (3, 'Ingeniería Geográfica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (3, 'Ingeniería de Minas');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (3, 'Ingeniería Metalúrgica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (3, 'Ingeniería Civil');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (3, 'Ingeniería Ambiental');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (4, 'Administración');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (4, 'Administración de Turismo');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (4, 'Administración de Negocios Internacionales');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (5, 'Derecho');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (5, 'Ciencia Política');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (6, 'Ingeniería Industrial');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (6, 'Ingeniería Textil y Confecciones');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (6, 'Ingeniería de Seguridad y Salud en el Trabajo');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (7, 'Química');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (7, 'Ingeniería Química');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (7, 'Ingeniería Agroindustrial');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (8, 'Medicina Humana');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (8, 'Obstetricia');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (8, 'Enfermería');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (8, 'Tecnología Médica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (8, 'Nutrición');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (9, 'Farmacia y Bioquímica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (9, 'Ciencia de los Alimentos');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (9, 'Toxicología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (10, 'Odontología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (11, 'Medicina Veterinaria');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (12, 'Psicología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (12, 'Psicología Organizacional y de la Gestión Humana');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (13, 'Ciencias Biológicas');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (13, 'Genética y Biotecnología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (13, 'Microbiología y Parasitología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (14, 'Física');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (14, 'Ingeniería Mecánica de Fluidos');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (15, 'Matemática');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (15, 'Estadística');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (15, 'Investigación Operativa');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (15, 'Computación Científica');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (16, 'Contabilidad');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (16, 'Gestión Tributaria');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (16, 'Auditoría Empresarial y del Sector Público');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (17, 'Economía');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (17, 'Economía Pública');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (17, 'Economía Internacional');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Literatura');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Filosofía');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Lingüística');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Comunicación social');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Arte');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Conservación y Restauración');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Bibliotecología y Ciencias de la Información');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (18, 'Danza');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (19, 'Educación');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (19, 'Educación Física');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (20, 'Historia');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (20, 'Sociología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (20, 'Antropología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (20, 'Arqueología');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (20, 'Trabajo Social');
INSERT INTO Escuela (FacultadID, NombreEAP) VALUES (20, 'Geografía');

/* REGISTRO DE TUTORES */

ALTER TABLE Tutor MODIFY Dni int UNIQUE;
ALTER TABLE Tutorado MODIFY celular int;

# PROCEDIMIENTOS ALMACENADOS
DELIMITER //
CREATE PROCEDURE SesionesDisponiblesTutor (in idTutor varchar(10))
BEGIN
	SELECT S.SesionID, S.FechaAcordada, S.Curso
    FROM Sesion S
	WHERE SesionID <> ALL (SELECT SesionID
                    FROM AsistenciaTutor
                    WHERE TutorID = idTutor);
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE SesionesDisponiblesTutorado (in idTutorado int)
BEGIN
	SELECT S.SesionID, S.FechaAcordada, S.Curso
    FROM Sesion S
	WHERE SesionID <> ALL (SELECT SesionID
                    FROM AsistenciaTutorado
                    WHERE TutoradoID = idTutorado);
END//
DELIMITER ;


DROP PROCEDURE SesionesDisponiblesTutor;

select * from sesion;

CALL SesionesDisponiblesTutor (18200188);
select * from tutor;

select * from asistenciatutor;
select * from asistenciatutorado;