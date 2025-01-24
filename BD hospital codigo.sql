-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Hospital
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Hospital
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Hospital` DEFAULT CHARACTER SET utf8 ;
USE `Hospital` ;

-- -----------------------------------------------------
-- Table `Hospital`.`Médicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Hospital`.`Médicos` (
  `idMédicos` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Especialidad` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `fecha_contratacion` DATE NOT NULL,
  PRIMARY KEY (`idMédicos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Hospital`.`Enfermedades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Hospital`.`Enfermedades` (
  `idEnfermedades` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `Pacientes_idPacientes` INT NOT NULL,
  PRIMARY KEY (`idEnfermedades`, `nombre`, `descripcion`),
  INDEX `fk_Enfermedades_Pacientes1_idx` (`Pacientes_idPacientes` ASC) VISIBLE,
  CONSTRAINT `fk_Enfermedades_Pacientes1`
    FOREIGN KEY (`Pacientes_idPacientes`)
    REFERENCES `Hospital`.`Pacientes` (`idPacientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Hospital`.`Pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Hospital`.`Pacientes` (
  `idPacientes` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `nacimiento` DATE NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `Médicos_idMédicos` INT NOT NULL,
  `Enfermedades_idEnfermedades` INT NOT NULL,
  `Enfermedades_nombre` VARCHAR(45) NOT NULL,
  `Enfermedades_descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPacientes`),
  INDEX `fk_Pacientes_Médicos_idx` (`Médicos_idMédicos` ASC) VISIBLE,
  INDEX `fk_Pacientes_Enfermedades1_idx` (`Enfermedades_idEnfermedades` ASC, `Enfermedades_nombre` ASC, `Enfermedades_descripcion` ASC) VISIBLE,
  CONSTRAINT `fk_Pacientes_Médicos`
    FOREIGN KEY (`Médicos_idMédicos`)
    REFERENCES `Hospital`.`Médicos` (`idMédicos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pacientes_Enfermedades1`
    FOREIGN KEY (`Enfermedades_idEnfermedades` , `Enfermedades_nombre` , `Enfermedades_descripcion`)
    REFERENCES `Hospital`.`Enfermedades` (`idEnfermedades` , `nombre` , `descripcion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Hospital`.`Medicamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Hospital`.`Medicamentos` (
  `idMedicamentos` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `Pacientes_idPacientes` INT NOT NULL,
  PRIMARY KEY (`idMedicamentos`, `nombre`, `descripcion`),
  INDEX `fk_Medicamentos_Pacientes1_idx` (`Pacientes_idPacientes` ASC) VISIBLE,
  CONSTRAINT `fk_Medicamentos_Pacientes1`
    FOREIGN KEY (`Pacientes_idPacientes`)
    REFERENCES `Hospital`.`Pacientes` (`idPacientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Hospital`.`Recetas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Hospital`.`Recetas` (
  `idRecetas` INT NOT NULL,
  `fechaReceta` DATE NOT NULL,
  `Médicos_idMédicos` INT NOT NULL,
  `Pacientes_idPacientes` INT NOT NULL,
  `Medicamentos_idMedicamentos` INT NOT NULL,
  `Medicamentos_nombre` VARCHAR(45) NOT NULL,
  `Medicamentos_descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idRecetas`),
  INDEX `fk_Recetas_Médicos1_idx` (`Médicos_idMédicos` ASC) VISIBLE,
  INDEX `fk_Recetas_Pacientes1_idx` (`Pacientes_idPacientes` ASC) VISIBLE,
  INDEX `fk_Recetas_Medicamentos1_idx` (`Medicamentos_idMedicamentos` ASC, `Medicamentos_nombre` ASC, `Medicamentos_descripcion` ASC) VISIBLE,
  CONSTRAINT `fk_Recetas_Médicos1`
    FOREIGN KEY (`Médicos_idMédicos`)
    REFERENCES `Hospital`.`Médicos` (`idMédicos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Recetas_Pacientes1`
    FOREIGN KEY (`Pacientes_idPacientes`)
    REFERENCES `Hospital`.`Pacientes` (`idPacientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Recetas_Medicamentos1`
    FOREIGN KEY (`Medicamentos_idMedicamentos` , `Medicamentos_nombre` , `Medicamentos_descripcion`)
    REFERENCES `Hospital`.`Medicamentos` (`idMedicamentos` , `nombre` , `descripcion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Hospital`.`Citas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Hospital`.`Citas` (
  `idCitas` INT NOT NULL,
  `fecha` DATE NOT NULL,
  `motivo` VARCHAR(45) NOT NULL,
  `Médicos_idMédicos` INT NOT NULL,
  `Pacientes_idPacientes` INT NOT NULL,
  PRIMARY KEY (`idCitas`),
  INDEX `fk_Citas_Médicos1_idx` (`Médicos_idMédicos` ASC) VISIBLE,
  INDEX `fk_Citas_Pacientes1_idx` (`Pacientes_idPacientes` ASC) VISIBLE,
  CONSTRAINT `fk_Citas_Médicos1`
    FOREIGN KEY (`Médicos_idMédicos`)
    REFERENCES `Hospital`.`Médicos` (`idMédicos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Citas_Pacientes1`
    FOREIGN KEY (`Pacientes_idPacientes`)
    REFERENCES `Hospital`.`Pacientes` (`idPacientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM médicos ;
INSERT INTO Médicos (idMédicos, Nombre, Especialidad, telefono, fecha_contratacion) VALUES
(1, 'Dr. Juan Pérez', 'Cardiología', '555-1001', '2005-04-15'),
(2, 'Dra. Ana López', 'Neurología', '555-1002', '2007-06-20'),
(3, 'Dr. Carlos Gómez', 'Pediatría', '555-1003', '2010-02-11'),
(4, 'Dr. María Fernández', 'Dermatología', '555-1004', '2003-08-09'),
(5, 'Dra. Rosa Sánchez', 'Traumatología', '555-1005', '2008-03-18'),
(6, 'Dr. Luis Ortiz', 'Oncología', '555-1006', '2006-10-05'),
(7, 'Dra. Beatriz Ruiz', 'Endocrinología', '555-1007', '2009-11-23'),
(8, 'Dr. Pedro Méndez', 'Psiquiatría', '555-1008', '2002-05-30'),
(9, 'Dra. Silvia Gutiérrez', 'Ginecología', '555-1009', '2001-01-14'),
(10, 'Dr. Andrés Robles', 'Urología', '555-1010', '2012-09-01'),
(11, 'Dr. Javier Castro', 'Hematología', '555-1011', '2004-03-25'),
(12, 'Dr. Miguel Herrera', 'Reumatología', '555-1012', '2007-12-31'),
(13, 'Dra. Laura Morales', 'Alergología', '555-1013', '2003-05-16'),
(14, 'Dr. Jorge Vega', 'Neumología', '555-1014', '2010-07-07'),
(15, 'Dra. Clara Rojas', 'Geriatría', '555-1015', '2002-11-11'),
(16, 'Dr. Álvaro Torres', 'Cirugía General', '555-1016', '2001-01-22'),
(17, 'Dra. Patricia Navarro', 'Cirugía Plástica', '555-1017', '2008-04-04'),
(18, 'Dr. Enrique Ramos', 'Oftalmología', '555-1018', '2009-09-18'),
(19, 'Dra. Marta Espinosa', 'Otorrinolaringología', '555-1019', '2000-02-19'),
(20, 'Dr. Manuel Suárez', 'Medicina Interna', '555-1020', '2006-06-20'),
(21, 'Dra. Daniela Varela', 'Medicina Familiar', '555-1021', '2005-10-10'),
(22, 'Dr. Adrián Castillo', 'Nefrología', '555-1022', '2011-03-29'),
(23, 'Dra. Estefanía Flores', 'Cardiología', '555-1023', '2007-08-08'),
(24, 'Dr. Santiago Luna', 'Neurología', '555-1024', '2002-07-12'),
(25, 'Dra. Elena Vargas', 'Oncología', '555-1025', '2001-12-03'),
(26, 'Dr. Gonzalo Aguilar', 'Psiquiatría', '555-1026', '2000-10-25'),
(27, 'Dra. Liliana Ortiz', 'Endocrinología', '555-1027', '2009-05-30'),
(28, 'Dr. Rodrigo Salinas', 'Traumatología', '555-1028', '2004-02-14'),
(29, 'Dra. Irene Díaz', 'Dermatología', '555-1029', '2005-12-05'),
(30, 'Dr. Tomás Romero', 'Pediatría', '555-1030', '2003-01-30'),
(31, 'Dra. Verónica Álvarez', 'Reumatología', '555-1031', '2010-03-11'),
(32, 'Dr. Eduardo Peralta', 'Hematología', '555-1032', '2001-08-22'),
(33, 'Dra. Sofía Mendoza', 'Geriatría', '555-1033', '2002-09-13'),
(34, 'Dr. Óscar Pacheco', 'Neumología', '555-1034', '2007-01-27'),
(35, 'Dra. Lorena Valdés', 'Cirugía Plástica', '555-1035', '2000-04-21'),
(36, 'Dr. Emilio Fuentes', 'Medicina Interna', '555-1036', '2008-06-06'),
(37, 'Dra. Gabriela Sandoval', 'Ginecología', '555-1037', '2006-12-17'),
(38, 'Dr. Nicolás Andrade', 'Urología', '555-1038', '2009-07-19'),
(39, 'Dra. Paula Quintana', 'Alergología', '555-1039', '2003-11-22'),
(40, 'Dr. Ignacio Bravo', 'Cirugía General', '555-1040', '2010-01-30'),
(41, 'Dra. Alicia Reyes', 'Oftalmología', '555-1041', '2002-06-15'),
(42, 'Dr. Sebastián Campos', 'Otorrinolaringología', '555-1042', '2000-03-04'),
(43, 'Dra. Teresa Calderón', 'Medicina Familiar', '555-1043', '2001-07-18'),
(44, 'Dr. Fernando Silva', 'Nefrología', '555-1044', '2005-02-09'),
(45, 'Dra. Valeria Prieto', 'Cardiología', '555-1045', '2004-09-28'),
(46, 'Dr. Ricardo Maldonado', 'Neurología', '555-1046', '2006-04-16'),
(47, 'Dra. Mariana Figueroa', 'Dermatología', '555-1047', '2011-11-14'),
(48, 'Dr. Arturo Flores', 'Psiquiatría', '555-1048', '2008-08-03'),
(49, 'Dra. Alejandra Peña', 'Oncología', '555-1049', '2002-01-20'),
(50, 'Dr. Teresa Morales', 'Geriatría', '555-1050', '2000-09-11');

COMMIT;


select * from Médicos;

DELETE FROM pacientes ;

INSERT INTO Pacientes (idPacientes,nombre, nacimiento,telefono, Médicos_idMédicos, Enfermedades_idEnfermedades, Enfermedades_nombre, Enfermedades_descripcion) VALUES
(1, 'Pedro Sánchez', '1980-05-20', '555-2321',1,1,  'Hipertensión', 'Presión arterial alta'),
(2, 'Lucía Méndez', '1995-03-15', '555-2002',2,2,  'Migraña', 'Dolores de cabeza severos'),
(3, 'Marcos Rivera', '1978-07-09', '555-2003',3, 3, 'Asma', 'Dificultad para respirar'),
(4, 'Sofía Torres', '1985-12-25', '555-2004', 4, 4, 'Dermatitis', 'Irritación en la piel'),
(5, 'Gabriel López', '1972-06-01', '555-2005', 5, 5, 'Diabetes', 'Altos niveles de azúcar en la sangre'),
(6, 'Carla Gómez', '1998-11-17', '555-2006', 6, 6, 'Hipotiroidismo', 'Disminución de actividad tiroidea'),
(7, 'Javier Pérez', '1964-04-08', '555-2007', 7, 7, 'Alergias', 'Reacciones alérgicas frecuentes'),
(8, 'Marta Castillo', '2001-03-30', '555-2008', 8, 8, 'Artritis', 'Dolores e inflamación en las articulaciones'),
(9, 'Santiago Ramírez', '1988-09-25', '555-2009', 9, 9, 'Insuficiencia renal', 'Disfunción renal crónica'),
(10, 'Adriana Morales', '1992-07-15', '555-2010', 10, 10, 'Epilepsia', 'Convulsiones recurrentes'),
(11, 'Roberto Díaz', '1983-05-10', '555-2011', 11, 11, 'Hepatitis', 'Inflamación del hígado'),
(12, 'Ana López', '1975-10-02', '555-2012', 12, 12, 'Gastritis', 'Inflamación en la mucosa del estómago'),
(13, 'Luis Ortiz', '1986-08-19', '555-2013', 13, 13, 'Hipertrofia prostática', 'Crecimiento de la próstata'),
(14, 'Clara Méndez', '1999-01-07', '555-2014', 14, 14, 'Acné severo', 'Erupciones en la piel'),
(15, 'Daniel Gómez', '1956-06-22', '555-2015', 15, 15, 'Ansiedad', 'Trastornos de ansiedad generalizada'),
(16, 'Laura García', '1990-04-01', '555-2016', 16, 16, 'Faringitis', 'Dolor e inflamación en la garganta'),
(17, 'Miguel Torres', '2000-05-25', '555-2017', 17, 17, 'Bronquitis', 'Inflamación en los bronquios'),
(18, 'Carmen Vargas', '1984-12-20', '555-2018', 18, 18, 'Lumbalgia', 'Dolor en la parte baja de la espalda'),
(19, 'Ricardo Sánchez', '1997-08-15', '555-2019', 19, 19, 'Otitis', 'Inflamación del oído medio'),
(20, 'Paula Fernández', '1994-02-12', '555-2020', 20, 20, 'Rinitis', 'Inflamación de las vías nasales'),
(21, 'Juan Cruz', '1959-11-05', '555-2021', 21, 21, 'Obesidad', 'Exceso de peso y grasa corporal'),
(22, 'Andrea Torres', '1993-07-13', '555-2022', 22, 22, 'Osteoporosis', 'Reducción de la densidad ósea'),
(23, 'Carlos Rivera', '1981-03-14', '555-2023', 23, 23, 'Depresión', 'Trastorno del estado de ánimo'),
(24, 'Sandra Vega', '1996-01-19', '555-2024', 24, 24, 'Esguince', 'Lesión en los ligamentos'),
(25, 'Martín Herrera', '1974-06-08', '555-2321', 25, 25, 'Pancreatitis', 'Inflamación en el páncreas'),
(26, 'Elena Ríos', '1987-02-25', '555-2321', 26, 26, 'Hipercalcemia', 'Altos niveles de calcio en sangre'),
(27, 'David Luna', '1991-10-09', '555-2027', 27, 27, 'Neumonía', 'Infección en los pulmones'),
(28, 'Lucía Flores', '2003-12-11', '555-2028', 28, 28, 'Anemia', 'Deficiencia de hierro en la sangre'),
(29, 'Raúl Castillo', '1982-05-03', '555-2029', 29, 29, 'Varices', 'Venas inflamadas y retorcidas'),
(30, 'Isabel Medina', '1998-08-23', '555-2030', 30, 30, 'Psoriasis', 'Afección crónica de la piel'),
(31, 'Pablo Reyes', '1985-01-29', '555-2031', 31, 31, 'Cáncer de pulmón', 'Tumores en el pulmón'),
(32, 'María Ramos', '1994-06-18', '555-2032', 32, 32, 'Hiperglucemia', 'Altos niveles de glucosa en sangre'),
(33, 'Fernando León', '1979-11-30', '555-2033', 33, 33, 'Hipotensión', 'Baja presión arterial'),
(34, 'Sofía Aguilar', '2002-09-01', '555-2034', 34, 34, 'Cistitis', 'Infección en la vejiga'),
(35, 'Guillermo Peña', '1988-12-27', '555-2035', 35, 35, 'Colitis', 'Inflamación del colon'),
(36, 'Alejandra Guzmán', '1995-04-16', '555-2036', 36, 36, 'Esclerosis múltiple', 'Enfermedad autoinmune'),
(37, 'Francisco Silva', '1986-03-05', '555-2037', 37, 37, 'Hernia discal', 'Desplazamiento de discos vertebrales'),
(38, 'Luisa Sánchez', '1992-07-20', '555-2038', 38, 38, 'Insuficiencia cardíaca', 'Fallos en el bombeo del corazón'),
(39, 'Joaquín Vargas', '1977-10-12', '555-2039', 39, 39, 'Trombosis', 'Coágulos en los vasos sanguíneos'),
(40, 'Patricia Lozano', '1999-05-31', '555-2040', 40, 40, 'Esquizofrenia', 'Trastorno psicótico'),
(41, 'Ramón Díaz', '1989-06-22', '555-2041', 41, 41, 'Glaucoma', 'Presión alta en los ojos'),
(42, 'Gloria Pérez', '2000-03-03', '555-2042', 42, 42, 'Anorexia', 'Trastorno alimenticio'),
(43, 'Héctor Márquez', '1983-09-08', '555-2043', 43, 43, 'Bulimia', 'Trastorno alimenticio'),
(44, 'Natalia Ruiz', '1997-01-14', '555-2321', 44, 44, 'Amigdalitis', 'Infección en las amígdalas'),
(45, 'Mario Vega', '1984-11-17', '555-2045', 45, 45, 'Cáncer de próstata', 'Tumores en la próstata'),
(46, 'Victoria Herrera', '1973-12-30', '555-2046', 46, 46, 'Esclerosis lateral', 'Afección neurológica degenerativa'),
(47, 'Diego Gutiérrez', '1990-05-09', '555-2047', 47, 47, 'Encefalitis', 'Inflamación del cerebro'),
(48, 'Lorena Vargas', '1982-02-07', '555-2048', 48, 48, 'Lupus', 'Enfermedad autoinmune crónica'),
(49, 'Tomás Aguilar', '196-08-16', '555-2321', 49, 49, 'Fibromialgia', 'Dolor musculoesquelético crónico'),
(50, 'Rocío Hernández', '1940-03-29', '555-2050', 50, 50, 'Parkinson', 'Trastorno del sistema nervioso central');
COMMIT;



delete from enfermedades;


INSERT INTO Enfermedades (idEnfermedades, nombre,descripcion, Pacientes_idPacientes) VALUES
(1, 'Hipertensión', 'Presión arterial alta', 1),
(2, 'Migraña', 'Dolores de cabeza severos', 2),
(3, 'Asma', 'Dificultad para respirar', 3),
(4, 'Dermatitis', 'Irritación en la piel', 4),
(5, 'Diabetes', 'Altos niveles de azúcar en la sangre', 5),
(6, 'Hipotiroidismo', 'Disminución de actividad tiroidea', 6),
(7, 'Alergias', 'Reacciones alérgicas frecuentes', 7),
(8, 'Artritis', 'Dolores e inflamación en las articulaciones', 8),
(9, 'Insuficiencia renal', 'Disfunción renal crónica', 9),
(10, 'Epilepsia', 'Convulsiones recurrentes', 10),
(11, 'Hepatitis', 'Inflamación del hígado', 11),
(12, 'Gastritis', 'Inflamación en la mucosa del estómago', 12),
(13, 'Hipertrofia prostática', 'Crecimiento de la próstata', 13),
(14, 'Acné severo', 'Erupciones en la piel', 14),
(15, 'Ansiedad', 'Trastornos de ansiedad generalizada', 15),
(16, 'Faringitis', 'Dolor e inflamación en la garganta', 16),
(17, 'Bronquitis', 'Inflamación en los bronquios', 17),
(18, 'Lumbalgia', 'Dolor en la parte baja de la espalda', 18),
(19, 'Otitis', 'Inflamación del oído medio', 19),
(20, 'Rinitis', 'Inflamación de las vías nasales', 20),
(21, 'Obesidad', 'Exceso de peso y grasa corporal', 21),
(22, 'Osteoporosis', 'Reducción de la densidad ósea', 22),
(23, 'Depresión', 'Trastorno del estado de ánimo', 23),
(24, 'Esguince', 'Lesión en los ligamentos', 24),
(25, 'Pancreatitis', 'Inflamación en el páncreas', 25),
(26, 'Hipercalcemia', 'Altos niveles de calcio en sangre', 26),
(27, 'Neumonía', 'Infección en los pulmones', 27),
(28, 'Anemia', 'Deficiencia de hierro en la sangre', 28),
(29, 'Varices', 'Venas inflamadas y retorcidas', 29),
(30, 'Psoriasis', 'Afección crónica de la piel', 30),
(31, 'Cáncer de pulmón', 'Tumores en el pulmón', 31),
(32, 'Hiperglucemia', 'Altos niveles de glucosa en sangre', 32),
(33, 'Hipotensión', 'Baja presión arterial', 33),
(34, 'Cistitis', 'Infección en la vejiga', 34),
(35, 'Colitis', 'Inflamación del colon', 35),
(36, 'Esclerosis múltiple', 'Enfermedad autoinmune', 36),
(37, 'Hernia discal', 'Desplazamiento de discos vertebrales', 37),
(38, 'Insuficiencia cardíaca', 'Fallos en el bombeo del corazón', 38),
(39, 'Trombosis', 'Coágulos en los vasos sanguíneos', 39),
(40, 'Esquizofrenia', 'Trastorno psicótico', 40),
(41, 'Glaucoma', 'Presión alta en los ojos', 41),
(42, 'Anorexia', 'Trastorno alimenticio', 42),
(43, 'Bulimia', 'Trastorno alimenticio', 43),
(44, 'Amigdalitis', 'Infección en las amígdalas', 44),
(45, 'Cáncer de próstata', 'Tumores en la próstata', 45),
(46, 'Esclerosis lateral', 'Afección neurológica degenerativa', 46),
(47, 'Encefalitis', 'Inflamación del cerebro', 47),
(48, 'Lupus', 'Enfermedad autoinmune crónica', 48),
(49, 'Fibromialgia', 'Dolor musculoesquelético crónico', 49),
(50, 'Parkinson', 'Trastorno del sistema nervioso central', 50);
COMMIT;



DELETE FROM medicamentos ;

INSERT INTO medicamentos(idMedicamentos,nombre, descripcion, Pacientes_idPacientes) VALUES
(1, 'Paracetamol', 'Analgésico y antipirético', 1),
(2, 'Ibuprofeno', 'Antiinflamatorio no esteroideo', 2),
(3, 'Amoxicilina', 'Antibiótico de amplio espectro', 3),
(4, 'Loratadina', 'Antihistamínico para alergias', 4),
(5, 'Metformina', 'Regula niveles de glucosa', 5),
(6, 'Levotiroxina', 'Tratamiento para hipotiroidismo', 6),
(7, 'Omeprazol', 'Protector gástrico', 7),
(8, 'Salbutamol', 'Broncodilatador', 8),
(9, 'Enalapril', 'Control de presión arterial', 9),
(10, 'Diclofenaco', 'Antiinflamatorio para dolores', 10),
(11, 'Simvastatina', 'Controla el colesterol', 11),
(12, 'Ranitidina', 'Reductor de ácido estomacal', 12),
(13, 'Prednisona', 'Corticosteroide para inflamaciones', 13),
(14, 'Alprazolam', 'Trastornos de ansiedad', 14),
(15, 'Clonazepam', 'Control de convulsiones', 15),
(16, 'Insulina', 'Control de diabetes tipo 1', 16),
(17, 'Furosemida', 'Diurético para hipertensión', 17),
(18, 'Aspirina', 'Anticoagulante y analgésico', 18),
(19, 'Carbamazepina', 'Control de epilepsia', 19),
(20, 'Propranolol', 'Control de migrañas', 20),
(21, 'Cefalexina', 'Antibiótico contra infecciones', 21),
(22, 'Dexametasona', 'Inflamaciones graves', 22),
(23, 'Hidroxicloroquina', 'Tratamiento para lupus', 23),
(24, 'Ketorolaco', 'Analgésico potente', 24),
(25, 'Losartán', 'Control de hipertensión', 25),
(26, 'Metoclopramida', 'Antiemético para náuseas', 26),
(27, 'Amlodipino', 'Reductor de presión arterial', 27),
(28, 'Esomeprazol', 'Inhibidor de ácido gástrico', 28),
(29, 'Sertralina', 'Antidepresivo ISRS', 29),
(30, 'Tamsulosina', 'Problemas urinarios', 30),
(31, 'Claritromicina', 'Antibiótico para infecciones respiratorias', 31),
(32, 'Vitamina D', 'Fortalecimiento óseo', 32),
(33, 'Calcio', 'Suplemento para osteoporosis', 33),
(34, 'Bromuro de ipratropio', 'Inhalador para EPOC', 34),
(35, 'Rivastigmina', 'Demencia leve a moderada', 35),
(36, 'Colchicina', 'Ataques de gota', 36),
(37, 'Albuterol', 'Alivio rápido del asma', 37),
(38, 'Fluoxetina', 'Antidepresivo', 38),
(39, 'Budesonida', 'Inhalador para asma crónica', 39),
(40, 'Tamoxifeno', 'Tratamiento de cáncer de mama', 40),
(41, 'Bisoprolol', 'Insuficiencia cardíaca', 41),
(42, 'Finasteride', 'Crecimiento prostático', 42),
(43, 'Quetiapina', 'Trastorno bipolar', 43),
(44, 'Montelukast', 'Prevención de asma', 44),
(45, 'Azitromicina', 'Antibiótico contra bacterias', 45),
(46, 'Gabapentina', 'Dolores neuropáticos', 46),
(47, 'Levetiracetam', 'Convulsiones epilépticas', 47),
(48, 'Clopidogrel', 'Prevención de coágulos', 48),
(49, 'Sitagliptina', 'Control de diabetes tipo 2', 49),
(50, 'Spironolactona', 'Diurético y control hormonal', 50);
COMMIT;

DELETE FROM Recetas ;


INSERT INTO Recetas (idRecetas, fechaReceta, Médicos_idMédicos, Pacientes_idPacientes, Medicamentos_idMedicamentos, Medicamentos_nombre, Medicamentos_descripcion) VALUES
(1, '2024-11-01', 1, 1, 1, 'Paracetamol', 'Analgésico y antipirético'),
(2, '2024-11-02', 2, 2, 2, 'Ibuprofeno', 'Antiinflamatorio no esteroideo'),
(3, '2024-11-03', 3, 3, 3, 'Amoxicilina', 'Antibiótico de amplio espectro'),
(4, '2024-11-04', 4, 4, 4, 'Loratadina', 'Antihistamínico para alergias'),
(5, '2024-11-05', 5, 5, 5, 'Metformina', 'Regula niveles de glucosa'),
(6, '2024-11-06', 6, 6, 6, 'Levotiroxina', 'Tratamiento para hipotiroidismo'),
(7, '2024-11-07', 7, 7, 7, 'Omeprazol', 'Protector gástrico'),
(8, '2024-11-08', 8, 8, 8, 'Salbutamol', 'Broncodilatador'),
(9, '2024-11-09', 9, 9, 9, 'Enalapril', 'Control de presión arterial'),
(10, '2024-11-10', 10, 10, 10, 'Diclofenaco', 'Antiinflamatorio para dolores'),
(11, '2024-11-11', 11, 11, 11, 'Simvastatina', 'Controla el colesterol'),
(12, '2024-11-12', 12, 12, 12, 'Ranitidina', 'Reductor de ácido estomacal'),
(13, '2024-11-13', 13, 13, 13, 'Prednisona', 'Corticosteroide para inflamaciones'),
(14, '2024-11-14', 14, 0, 14, 'Alprazolam', 'Trastornos de ansiedad'),
(15, '2024-11-15', 15, 15, 15, 'Clonazepam', 'Control de convulsiones'),
(16, '2024-11-16', 16, 16, 16, 'Insulina', 'Control de diabetes tipo 1'),
(17, '2024-11-17', 17, 17, 17, 'Furosemida', 'Diurético para hipertensión'),
(18, '2024-11-18', 18, 18, 18, 'Aspirina', 'Anticoagulante y analgésico'),
(19, '2024-11-19', 19, 19, 19, 'Carbamazepina', 'Control de epilepsia'),
(20, '2024-11-20', 20, 20, 20, 'Propranolol', 'Control de migrañas'),
(21, '2024-11-21', 21, 21, 21, 'Cefalexina', 'Antibiótico contra infecciones'),
(22, '2024-11-22', 22, 22, 22, 'Dexametasona', 'Inflamaciones graves'),
(23, '2024-11-23', 23, 23, 23, 'Hidroxicloroquina', 'Tratamiento para lupus'),
(24, '2024-11-24', 24, 24, 24, 'Ketorolaco', 'Analgésico potente'),
(25, '2024-11-25', 25, 25, 25, 'Losartán', 'Control de hipertensión'),
(26, '2024-11-26', 26, 26, 26, 'Metoclopramida', 'Antiemético para náuseas'),
(27, '2024-11-27', 27, 27, 27, 'Amlodipino', 'Reductor de presión arterial'),
(28, '2024-11-28', 28, 28, 28, 'Esomeprazol', 'Inhibidor de ácido gástrico'),
(29, '2024-11-29', 29, 29, 29, 'Sertralina', 'Antidepresivo ISRS'),
(30, '2024-11-30', 30, 30, 30, 'Tamsulosina', 'Problemas urinarios'),
(31, '2024-12-01', 31, 31, 31, 'Claritromicina', 'Antibiótico para infecciones respiratorias'),
(32, '2024-12-02', 32, 32, 32, 'Vitamina D', 'Fortalecimiento óseo'),
(33, '2024-12-03', 33, 33, 33, 'Calcio', 'Suplemento para osteoporosis'),
(34, '2024-12-04', 34, 34, 34, 'Bromuro de ipratropio', 'Inhalador para EPOC'),
(35, '2024-12-05', 35, 35, 35, 'Rivastigmina', 'Demencia leve a moderada'),
(36, '2024-12-06', 36, 36, 36, 'Colchicina', 'Ataques de gota'),
(37, '2024-12-07', 37, 37, 37, 'Albuterol', 'Alivio rápido del asma'),
(38, '2024-12-08', 38, 38, 38, 'Fluoxetina', 'Antidepresivo'),
(39, '2024-12-09', 39, 39, 39, 'Budesonida', 'Inhalador para asma crónica'),
(40, '2024-12-10', 40, 40, 40, 'Tamoxifeno', 'Tratamiento de cáncer de mama'),
(41, '2024-12-11', 41, 41, 41, 'Bisoprolol', 'Insuficiencia cardíaca'),
(42, '2024-12-12', 42, 42, 42, 'Finasteride', 'Crecimiento prostático'),
(43, '2024-12-13', 43, 43, 43, 'Quetiapina', 'Trastorno bipolar'),
(44, '2024-12-14', 44, 44, 44, 'Montelukast', 'Prevención de asma'),
(45, '2024-12-15', 45, 45, 45, 'Azitromicina', 'Antibiótico contra bacterias'),
(46, '2024-12-16', 46, 46, 46, 'Gabapentina', 'Dolores neuropáticos'),
(47, '2024-12-17', 47, 47, 47, 'Levetiracetam', 'Convulsiones epilépticas'),
(48, '2024-12-18', 48, 48, 48, 'Clopidogrel', 'Prevención de coágulos'),
(49, '2024-12-19', 49, 49, 49, 'Sitagliptina', 'Control de diabetes tipo 2'),
(50, '2024-12-20', 50, 50, 50, 'Spironolactona', 'Diurético y control hormonal');
COMMIT;

DELETE FROM Citas ;

INSERT INTO Citas (idCitas, fecha, motivo, Médicos_idMédicos, Pacientes_idPacientes) VALUES
(1, '2024-01-01', 'Control de hipertensión',1, 1),
(2, '2024-01-02', 'Consulta por migraña', 2, 2),
(3, '2024-01-03', 'Revisión de asma', 3, 3),
(4, '2024-01-04', 'Chequeo dermatológico', 4, 4),
(5, '2024-01-05', 'Control de diabetes', 5, 5),
(6, '2024-01-06', 'Consulta de seguimiento', 6, 6),
(7, '2024-01-07', 'Evaluación endocrinológica', 7, 7),
(8, '2024-01-08', 'Consulta psiquiátrica', 8, 8),
(9, '2024-01-09', 'Control prenatal', 9, 9),
(10, '2024-01-10', 'Consulta urológica', 10, 10),
(11, '2024-01-11', 'Revisión hematológica', 11, 11),
(12, '2024-01-12', 'Control reumatológico', 12, 12),
(13, '2024-01-13', 'Consulta por alergias', 13, 13),
(14, '2024-01-14', 'Chequeo neumológico', 14, 14),
(15, '2024-01-15', 'Evaluación geriátrica', 15, 15),
(16, '2024-01-16', 'Preoperatorio general', 16, 16),
(17, '2024-01-17', 'Consulta por cirugía plástica', 17, 17),
(18, '2024-01-18', 'Revisión oftalmológica', 18, 18),
(19, '2024-01-19', 'Consulta otorrinolaringológica', 19, 19),
(20, '2024-01-20', 'Evaluación médica general', 20, 20),
(21, '2024-01-21', 'Consulta familiar', 21, 21),
(22, '2024-01-22', 'Evaluación nefrológica', 22, 22),
(23, '2024-01-23', 'Seguimiento cardiológico', 23, 23),
(24, '2024-01-24', 'Chequeo neurológico', 24, 24),
(25, '2024-01-25', 'Control de tratamiento', 25, 25),
(26, '2024-01-26', 'Consulta psiquiátrica', 26, 26),
(27, '2024-01-27', 'Evaluación endocrinológica', 27, 27),
(28, '2024-01-28', 'Consulta traumatológica', 28, 28),
(29, '2024-01-29', 'Revisión dermatológica', 29, 29),
(30, '2024-01-30', 'Control pediátrico', 30, 30),
(31, '2024-02-01', 'Revisión reumatológica', 31, 31),
(32, '2024-02-02', 'Control hematológico', 32, 32),
(33, '2024-02-03', 'Evaluación geriátrica', 33, 33),
(34, '2024-02-04', 'Consulta neumológica', 34, 34),
(35, '2024-02-05', 'Cirugía programada', 35, 35),
(36, '2024-02-06', 'Control médico general', 36, 36),
(37, '2024-02-07', 'Control ginecológico', 37, 37),
(38, '2024-02-08', 'Consulta urológica', 38, 38),
(39, '2024-02-09', 'Tratamiento de alergias', 39, 39),
(40, '2024-02-10', 'Evaluación quirúrgica', 40, 40),
(41, '2024-02-11', 'Consulta oftalmológica', 41, 41),
(42, '2024-02-12', 'Control otorrinolaringológico', 42, 42),
(43, '2024-02-13', 'Consulta médica familiar', 43, 43),
(44, '2024-02-14', 'Control nefrológico', 44, 44),
(45, '2024-02-15', 'Revisión cardiológica', 45, 45),
(46, '2024-02-16', 'Control neurológico', 46, 46),
(47, '2024-02-17', 'Chequeo dermatológico', 47, 47),
(48, '2024-02-18', 'Consulta psiquiátrica', 48, 48),
(49, '2024-02-19', 'Control oncológico', 49, 49),
(50, '2024-02-20', 'Revisión geriátrica', 50, 50);
COMMIT;


SET SQL_SAFE_UPDATES = 1;


