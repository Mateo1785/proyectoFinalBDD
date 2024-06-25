-- Eliminacion de Vistas
drop view if exists v_consultar_receta_cedula;
drop view if exists v_consultar_cita_cedula;
drop view if exists v_citas_ingresadas;
drop view if exists v_citas_doctor;
drop view if exists v_doctor;
drop view if exists v_especialidad_doctor;
drop view if exists v_horarios_doctor;
drop view if exists v_paciente_citas;

-- Eliminacion de tablas
drop table if exists receta_detalle;
drop table if exists receta_cabecera;
drop table if exists medicamento;
drop table if exists cita_medica;
drop table if exists horario_doctor;
drop table if exists horario;
drop table if exists paciente;
drop table if exists auditoria_paciente;
drop table if exists doctor;
drop table if exists especialidad;

-- Creacion de tablas 

CREATE TABLE especialidad (
    id_especialidad SERIAL PRIMARY KEY not null,
    nombre VARCHAR(100) not null unique,
    descripcion VARCHAR(300)not null
);

CREATE TABLE doctor (
    id_doctor SERIAL PRIMARY KEY not null,
    cedula VARCHAR (10) not null unique,
    nombre VARCHAR(50) not null,
    apellido VARCHAR(50) not null,
    telefono VARCHAR(15) not null unique,
    email VARCHAR(200) not null unique,
    id_especialidad INT not null,
    FOREIGN KEY (id_especialidad) REFERENCES especialidad(id_especialidad)
);
CREATE INDEX doctor_pk1 on doctor(cedula);

CREATE TABLE paciente (
    id_paciente SERIAL PRIMARY KEY not null,
    cedula VARCHAR (10) not null UNIQUE,
    nombre VARCHAR(50) not null,
    apellido VARCHAR(50) not null,
    fecha_nacimiento DATE not null,
	sexo VARCHAR(1) not null,
    direccion VARCHAR(200) null,
    telefono VARCHAR(15) UNIQUE not null, 
    email VARCHAR(200) UNIQUE not null
);
CREATE INDEX paciente_pk1 on paciente(cedula);

CREATE TABLE auditoria_paciente (
    id_auditoria SERIAL PRIMARY KEY not null,
    accion VARCHAR(10) not null,
    cedula VARCHAR (10) not null,
    nombre VARCHAR(50) not null,
    apellido VARCHAR(50) not null,
    fecha_nacimiento DATE not null,
	sexo VARCHAR(1) not null,
    direccion VARCHAR(200) null,
    telefono VARCHAR(15) not null, 
    email VARCHAR(200) not null
);

CREATE TABLE horario (
    id_horario SERIAL PRIMARY KEY not null,
    fecha DATE not null,
    hora TIME not null
);

CREATE TABLE horario_doctor (
    id_codigo SERIAL PRIMARY KEY not null,
	id_horario INT not null,
	id_doctor INT not null,
	estado VARCHAR(15) default 'DISPONIBLE',
    FOREIGN KEY (id_horario) REFERENCES horario(id_horario),
    FOREIGN KEY (id_doctor) REFERENCES doctor(id_doctor)
);

CREATE TABLE cita_medica (
    id_cita SERIAL PRIMARY KEY not null,
    id_paciente INT not null ,
    id_doctor INT not null,
	id_horario INT not null,
	motivo VARCHAR(200) not null,
    fecha_generacion DATE default current_timestamp,
	estado VARCHAR(15) default 'INGRESADO',
    FOREIGN KEY (id_paciente) REFERENCES paciente(id_paciente),
    FOREIGN KEY (id_doctor) REFERENCES doctor(id_doctor),
	FOREIGN KEY (id_horario) REFERENCES horario_doctor(id_codigo)
);
CREATE UNIQUE INDEX cita_medica_pk1 on cita_medica(id_paciente, id_horario);
CREATE UNIQUE INDEX cita_medica_pk2 on cita_medica(id_doctor, id_horario);

CREATE TABLE medicamento (
    id_medicamento SERIAL PRIMARY KEY not null,
    nombre VARCHAR(100) not null UNIQUE,
    descripcion VARCHAR(300) not null
);

CREATE TABLE receta_cabecera (
    id_receta_cab SERIAL PRIMARY KEY not null,
    id_cita INT not null,
    diagnostico VARCHAR(200) not null,
    FOREIGN KEY (id_cita) REFERENCES cita_medica(id_cita)
);

CREATE TABLE receta_detalle (
    id_receta_det SERIAL PRIMARY KEY not null,
    id_receta_cab INT not null,
    id_medicamento INT not null,
	dosis VARCHAR(50),
    dias VARCHAR(50),
    indicaciones VARCHAR(300) not null,
    FOREIGN KEY (id_receta_cab) REFERENCES receta_cabecera(id_receta_cab),
	FOREIGN KEY (id_medicamento) REFERENCES medicamento(id_medicamento)
);

