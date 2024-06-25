-- Especialidad
insert into especialidad(nombre, descripcion) values ('Cardiología', 'Diagnóstico y tratamiento de las enfermedades del corazón y del sistema cardiovascular.');
insert into especialidad(nombre, descripcion) values ('Dermatología', 'Diagnóstico y tratamiento de las enfermedades de la piel, el cabello y las uñas.');
insert into especialidad(nombre, descripcion) values ('Endocrinología', 'Tratamiento de las enfermedades del sistema endocrino y de las hormonas, como diabetes y problemas tiroideos.');
insert into especialidad(nombre, descripcion) values ('Gastroenterología', 'Estudio del sistema digestivo y sus trastornos, incluyendo esófago, estómago, intestinos, hígado y páncreas.');
insert into especialidad(nombre, descripcion) values ('Hematología', 'Estudio de la sangre y sus enfermedades, como anemias, leucemias y linfomas.');
insert into especialidad(nombre, descripcion) values ('Infectología', 'Diagnóstico y tratamiento de las enfermedades infecciosas causadas por bacterias, virus, hongos y parásitos.');
insert into especialidad(nombre, descripcion) values ('Neumología', 'Enfermedades del sistema respiratorio, como el asma, la neumonía y la enfermedad pulmonar obstructiva crónica (EPOC).');
insert into especialidad(nombre, descripcion) values ('Nefrología', 'Tratamiento de las enfermedades de los riñones.');
insert into especialidad(nombre, descripcion) values ('Neurología', 'Estudio del sistema nervioso y sus trastornos, como epilepsia, esclerosis múltiple y accidentes cerebrovasculares.');
insert into especialidad(nombre, descripcion) values ('Obstetricia', 'Atención del embarazo, el parto y el puerperio.');
insert into especialidad(nombre, descripcion) values ('Ginecología', 'Tratamiento de las enfermedades del sistema reproductor femenino.');
insert into especialidad(nombre, descripcion) values ('Oftalmología', 'Diagnóstico y tratamiento de las enfermedades de los ojos.');
insert into especialidad(nombre, descripcion) values ('Oncología', 'Estudio y tratamiento del cáncer.');
insert into especialidad(nombre, descripcion) values ('Otorrinolaringología', 'Diagnóstico y tratamiento de las enfermedades del oído, nariz y garganta.');
insert into especialidad(nombre, descripcion) values ('Pediatría', 'Atención médica de los niños y adolescentes.');
insert into especialidad(nombre, descripcion) values ('Psiquiatría', 'Diagnóstico y tratamiento de las enfermedades mentales.');
insert into especialidad(nombre, descripcion) values ('Radiología', 'Uso de técnicas de imagen para el diagnóstico y tratamiento de enfermedades.');
insert into especialidad(nombre, descripcion) values ('Reumatología', 'Diagnóstico y tratamiento de enfermedades reumáticas y del sistema musculoesquelético.');
insert into especialidad(nombre, descripcion) values ('Urología', 'Tratamiento de las enfermedades del sistema urinario y del aparato reproductor masculino.');
insert into especialidad(nombre, descripcion) values ('Cirugía General', 'Tratamiento quirúrgico de diversas enfermedades y lesiones.');
insert into especialidad(nombre, descripcion) values ('Medicina Interna', 'Atención integral de adultos con enfermedades complejas o crónicas.');
insert into especialidad(nombre, descripcion) values ('Anestesiología', 'Administración de anestesia y manejo del dolor durante procedimientos quirúrgicos.');
insert into especialidad(nombre, descripcion) values ('Medicina Familiar', 'Atención médica integral y continua para individuos y familias.');
insert into especialidad(nombre, descripcion) values ('Medicina del Trabajo', 'Prevención, diagnóstico y tratamiento de enfermedades relacionadas con el trabajo.');
insert into especialidad(nombre, descripcion) values ('Geriatría', 'Atención médica de los ancianos y sus enfermedades.');
insert into especialidad(nombre, descripcion) values ('Medicina Deportiva', 'Prevención y tratamiento de lesiones relacionadas con la actividad física y el deporte.');
insert into especialidad(nombre, descripcion) values ('Nutriología', 'Estudio y tratamiento de los trastornos relacionados con la alimentación y la nutrición.');
insert into especialidad(nombre, descripcion) values ('Medicina Física y Rehabilitación', 'Tratamiento de la discapacidad y la mejora de la funcionalidad física.');
insert into especialidad(nombre, descripcion) values ('Patología', 'Estudio de las enfermedades a través del examen de tejidos, órganos y líquidos corporales.');
insert into especialidad(nombre, descripcion) values ('Inmunología', 'Estudio y tratamiento de las enfermedades del sistema inmunológico.');

-- Doctor
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('12345678A', 'Juan', 'Pérez', '1 600 123 456', 'juan.perez@example.com', 1);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('87654321B', 'María', 'López', '2 600 654 321', 'maria.lopez@example.com', 3);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('11223344C', 'Carlos', 'García', '3 600 111 222', 'carlos.garcia@example.com', 4);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('44332211D', 'Ana', 'Sánchez', '4 600 333 444', 'ana.sanchez@example.com', 6);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('55667788E', 'José', 'Martínez', '5 600 555 666', 'jose.martinez@example.com', 7);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('99887766F', 'Laura', 'Rodríguez', '6 600 777 888', 'laura.rodriguez@example.com', 2);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('66778899G', 'David', 'Fernández', '7 600 999 000', 'david.fernandez@example.com', 5);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('77665544H', 'Isabel', 'Gómez', '8 600 444 555', 'isabel.gomez@example.com', 8);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('22334455I', 'Antonio', 'Ruiz', '9 600 555 666', 'antonio.ruiz@example.com', 9);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('88776655J', 'Marta', 'Jiménez', '10 600 666 777', 'marta.jimenez@example.com', 10);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('33445566K', 'Javier', 'Moreno', '11 600 777 888', 'javier.moreno@example.com', 15);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('44556677L', 'Sonia', 'Muñoz', '12 600 888 999', 'sonia.munoz@example.com', 16);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('22334455M', 'Luis', 'Díaz', '13 600 111 222', 'luis.diaz@example.com', 17);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('11223344N', 'Carmen', 'Hernández', '14 600 222 333', 'carmen.hernandez@example.com', 18);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('99887766O', 'Miguel', 'Romero', '15 600 333 444', 'miguel.romero@example.com', 19);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('66778899P', 'Elena', 'Alonso', '16 600 444 555', 'elena.alonso@example.com', 20);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('77665544Q', 'Pedro', 'Gil', '17 600 555 666', 'pedro.gil@example.com', 25);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('22334455R', 'Patricia', 'Ramos', '18 600 666 777', 'patricia.ramos@example.com', 26);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('88776655S', 'Manuel', 'Torres', '19 600 777 888', 'manuel.torres@example.com', 27);
insert into doctor(cedula,nombre,apellido,telefono,email,id_especialidad) values ('33445566T', 'Teresa', 'Navarro', '20 600 888 999', 'teresa.navarro@example.com', 28);

-- Paciente
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('12345678A', 'Juan', 'Pérez', '6/25/1985', 'M', 'Calle Falsa 123, Madrid', '+34 600 123 001', 'juan.perez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('87654321B', 'María', 'López', '6/25/1985', 'F', 'Avenida Siempre Viva 456, Barcelona', '+34 600 123 002', 'maria.lopez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('11223344C', 'Carlos', 'García', '3/18/1992', 'M', 'Plaza Mayor 789, Valencia', '+34 600 123 003', 'carlos.garcia@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('44332211D', 'Ana', 'Sánchez', '11/22/1988', 'F', 'Calle Luna 101, Sevilla', '+34 600 123 004', 'ana.sanchez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('55667788E', 'José', 'Martínez', '4/30/1980', 'M', 'Calle Sol 202, Zaragoza', '+34 600 123 005', 'jose.martinez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('99887766F', 'Laura', 'Rodríguez', '7/14/1995', 'F', 'Avenida Mar 303, Málaga', '+34 600 123 006', 'laura.rodriguez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899G', 'David', 'Fernández', '9/5/1982', 'M', 'Calle Río 404, Murcia', '+34 600 123 007', 'david.fernandez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544H', 'Isabel', 'Gómez', '12/1/1993', 'F', 'Calle Montaña 505, Palma', '+34 600 123 008', 'isabel.gomez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455I', 'Antonio', 'Ruiz', '2/17/1981', 'M', 'Calle Árbol 606, Las Palmas', '+34 600 123 009', 'antonio.ruiz@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('88776655J', 'Marta', 'Jiménez', '10/10/1990', 'F', 'Avenida Flor 707, Bilbao', '+34 600 123 010', 'marta.jimenez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('33445566K', 'Javier', 'Moreno', '5/12/1984', 'M', 'Plaza Estrella 808, Alicante', '+34 600 123 011', 'javier.moreno@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('44556677L', 'Sonia', 'Muñoz', '8/20/1991', 'F', 'Calle Luna 909, Valladolid', '+34 600 123 012', 'sonia.munoz@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455M', 'Luis', 'Díaz', '3/22/1987', 'M', 'Avenida Sol 1010, Córdoba', '+34 600 123 013', 'luis.diaz@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('11223344N', 'Carmen', 'Hernández', '11/3/1994', 'F', 'Calle Río 1111, Vigo', '+34 600 123 014', 'carmen.hernandez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('99887766O', 'Miguel', 'Romero', '6/9/1986', 'M', 'Calle Mar 1212, Gijón', '+34 600 123 015', 'miguel.romero@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899P', 'Elena', 'Alonso', '4/15/1993', 'F', 'Avenida Árbol 1313, La Coruña', '+34 600 123 016', 'elena.alonso@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544Q', 'Pedro', 'Gil', '7/18/1989', 'M', 'Calle Flor 1414, Granada', '+34 600 123 017', 'pedro.gil@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455R', 'Patricia', 'Ramos', '12/27/1983', 'F', 'Avenida Montaña 1515, Santander', '+34 600 123 018', 'patricia.ramos@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('88776655S', 'Manuel', 'Torres', '1/25/1992', 'M', 'Calle Árbol 1616, Oviedo', '+34 600 123 019', 'manuel.torres@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('33445566T', 'Teresa', 'Navarro', '9/30/1988', 'F', 'Avenida Estrella 1717, San Sebastián', '+34 600 123 020', 'teresa.navarro@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('44556677U', 'Sergio', 'Molina', '4/16/1981', 'M', 'Calle Sol 1818, Tarragona', '+34 600 123 021', 'sergio.molina@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('55667788V', 'Paula', 'Castillo', '10/7/1990', 'F', 'Avenida Mar 1919, León', '+34 600 123 022', 'paula.castillo@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899W', 'Andrés', 'Ortega', '3/19/1987', 'M', 'Calle Río 2020, Badajoz', '+34 600 123 023', 'andres.ortega@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544X', 'Natalia', 'Santana', '5/25/1994', 'F', 'Avenida Árbol 2121, Logroño', '+34 600 123 024', 'natalia.santana@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455Y', 'Francisco', 'Vega', '11/1/1986', 'M', 'Calle Estrella 2222, Huelva', '+34 600 123 025', 'francisco.vega@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('11223344Z', 'Julia', 'Delgado', '7/12/1985', 'F', 'Avenida Luna 2323, Almería', '+34 600 123 026', 'julia.delgado@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('99887766A', 'Alberto', 'Castro', '2/14/1991', 'M', 'Calle Sol 2424, Burgos', '+34 600 123 027', 'alberto.castro@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899B', 'Alicia', 'Ortiz', '8/23/1990', 'F', 'Calle Río 2525, Salamanca', '+34 600 123 028', 'alicia.ortiz@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544C', 'Eduardo', 'Garrido', '3/11/1989', 'M', 'Avenida Árbol 2626, Cádiz', '+34 600 123 029', 'eduardo.garrido@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455D', 'Pilar', 'Sánchez', '10/9/1992', 'F', 'Calle Estrella 2727, Jaén', '+34 600 123 030', 'pilar.sanchez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('88776655E', 'Enrique', 'Herrera', '1/8/1987', 'M', 'Avenida Luna 2828, Orense', '+34 600 123 031', 'enrique.herrera@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('33445566F', 'Rosa', 'Marín', '4/22/1993', 'F', 'Calle Sol 2929, Zamora', '+34 600 123 032', 'rosa.marin@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('44556677G', 'Víctor', 'Aguirre', '9/17/1985', 'M', 'Avenida Mar 3030, Cuenca', '+34 600 123 033', 'victor.aguirre@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('55667788H', 'Lucía', 'Vidal', '5/24/1988', 'F', 'Calle Árbol 3131, Toledo', '+34 600 123 034', 'lucia.vidal@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899I', 'Jorge', 'Cruz', '7/3/1991', 'M', 'Avenida Sol 3232, Guadalajara', '+34 600 123 035', 'jorge.cruz@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544J', 'Beatriz', 'Méndez', '2/18/1990', 'F', 'Calle Río 3333, Pontevedra', '+34 600 123 036', 'beatriz.mendez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455K', 'Roberto', 'Blanco', '11/29/1986', 'M', 'Avenida Árbol 3434, Gerona', '+34 600 123 037', 'roberto.blanco@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('11223344L', 'Sara', 'Suárez', '10/13/1989', 'F', 'Calle Estrella 3535, Melilla', '+34 600 123 038', 'sara.suarez@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('99887766M', 'Ricardo', 'Martín', '5/20/1982', 'M', 'Avenida Luna 3636, Ceuta', '+34 600 123 039', 'ricardo.martin@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899N', 'Adriana', 'Vargas', '8/11/1994', 'F', 'Calle Sol 3737, Cartagena', '+34 600 123 040', 'adriana.vargas@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544O', 'Guillermo', 'Rivas', '3/28/1985', 'M', 'Avenida Mar 3838, Teruel', '+34 600 123 041', 'guillermo.rivas@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455P', 'Irene', 'Castillo', '7/15/1987', 'F', 'Calle Árbol 3939, Lugo', '+34 600 123 042', 'irene.castillo@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('11223344Q', 'Tomás', 'Mora', '1/20/1990', 'M', 'Avenida Estrella 4040, Ávila', '+34 600 123 043', 'tomas.mora@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('99887766R', 'Silvia', 'Lorenzo', '12/25/1989', 'F', 'Calle Luna 4141, Segovia', '+34 600 123 044', 'silvia.lorenzo@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899S', 'Ignacio', 'Medina', '9/22/1986', 'M', 'Avenida Sol 4242, Soria', '+34 600 123 045', 'ignacio.medina@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('77665544T', 'Raquel', 'Rubio', '10/17/1983', 'F', 'Calle Río 4343, Huesca', '+34 600 123 046', 'raquel.rubio@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('22334455U', 'Mario', 'León', '3/12/1994', 'M', 'Avenida Árbol 4444, Álava', '+34 600 123 047', 'mario.leon@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('11223344V', 'Lorena', 'Fuentes', '11/30/1988', 'F', 'Calle Estrella 4545, Albacete', '+34 600 123 048', 'lorena.fuentes@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('99887766W', 'Fernando', 'Paredes', '2/11/1991', 'M', 'Avenida Luna 4646, Tenerife', '+34 600 123 049', 'fernando.paredes@example.com');
insert into paciente(cedula,nombre,apellido,fecha_nacimiento,sexo,direccion,telefono,email) values ('66778899X', 'Claudia', 'Lozano', '8/3/1990', 'F', 'Calle Sol 4747, Fuerteventura', '+34 600 123 050', 'claudia.lozano@example.com');

-- Medicamento
insert into medicamento(nombre,descripcion) values('Paracetamol', 'Analgésico y antipirético utilizado para tratar el dolor y reducir la fiebre.');
insert into medicamento(nombre,descripcion) values('Ibuprofeno', 'Antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación.');
insert into medicamento(nombre,descripcion) values('Omeprazol', 'Inhibidor de la bomba de protones (IBP) utilizado para tratar úlceras gástricas y reflujo ácido.');
insert into medicamento(nombre,descripcion) values('Amoxicilina', 'Antibiótico utilizado para tratar infecciones bacterianas.');
insert into medicamento(nombre,descripcion) values('Loratadina', 'Antihistamínico utilizado para tratar alergias y síntomas de resfriado.');
insert into medicamento(nombre,descripcion) values('Aspirina', 'Antiinflamatorio, analgésico y antipirético utilizado para aliviar el dolor y reducir la fiebre.');
insert into medicamento(nombre,descripcion) values('Dipirona', 'Analgésico y antipirético utilizado para tratar el dolor y reducir la fiebre.');
insert into medicamento(nombre,descripcion) values('Metformina', 'Medicamento antidiabético utilizado para tratar la diabetes tipo 2.');
insert into medicamento(nombre,descripcion) values('Enalapril', 'Inhibidor de la enzima convertidora de angiotensina (IECA) utilizado para tratar la hipertensión y la insuficiencia cardíaca.');
insert into medicamento(nombre,descripcion) values('Simvastatina', 'Estatina utilizada para reducir los niveles de colesterol y prevenir enfermedades cardiovasculares.');
insert into medicamento(nombre,descripcion) values('Metoprolol', 'Betabloqueante utilizado para tratar la hipertensión, la angina de pecho y las arritmias cardíacas.');
insert into medicamento(nombre,descripcion) values('Sertralina', 'Antidepresivo utilizado para tratar la depresión, el trastorno obsesivo-compulsivo y la ansiedad.');
insert into medicamento(nombre,descripcion) values('Paroxetina', 'Antidepresivo utilizado para tratar la depresión, el trastorno obsesivo-compulsivo y la ansiedad.');
insert into medicamento(nombre,descripcion) values('Atorvastatina', 'Estatina utilizada para reducir los niveles de colesterol y prevenir enfermedades cardiovasculares.');
insert into medicamento(nombre,descripcion) values('Ciprofloxacino', 'Antibiótico de amplio espectro utilizado para tratar infecciones bacterianas.');
insert into medicamento(nombre,descripcion) values('Prednisona', 'Glucocorticoide utilizado para tratar diversas condiciones inflamatorias y autoinmunes.');
insert into medicamento(nombre,descripcion) values('Ranitidina', 'Antagonista del receptor H2 utilizado para tratar la úlcera péptica y el reflujo ácido.');
insert into medicamento(nombre,descripcion) values('Pantoprazol', 'Inhibidor de la bomba de protones (IBP) utilizado para tratar úlceras gástricas y reflujo ácido.');
insert into medicamento(nombre,descripcion) values('Metronidazol', 'Antibiótico y antiprotozoario utilizado para tratar infecciones bacterianas y parasitarias.');
insert into medicamento(nombre,descripcion) values('Lisinopril', 'Inhibidor de la enzima convertidora de angiotensina (IECA) utilizado para tratar la hipertensión y la insuficiencia cardíaca.');
insert into medicamento(nombre,descripcion) values('Tramadol', 'Analgésico opioide utilizado para tratar el dolor moderado a severo.');
insert into medicamento(nombre,descripcion) values('Clopidogrel', 'Antiplaquetario utilizado para prevenir la formación de coágulos sanguíneos.');
insert into medicamento(nombre,descripcion) values('Losartan', 'Antagonista del receptor de angiotensina II utilizado para tratar la hipertensión y la insuficiencia cardíaca.');
insert into medicamento(nombre,descripcion) values('Atenolol', 'Betabloqueante utilizado para tratar la hipertensión, la angina de pecho y las arritmias cardíacas.');
insert into medicamento(nombre,descripcion) values('Amoxicilina/Ácido clavulánico', 'Antibiótico utilizado para tratar infecciones bacterianas.');
insert into medicamento(nombre,descripcion) values('Furosemida', 'Diurético de asa utilizado para tratar la retención de líquidos y la hipertensión.');
insert into medicamento(nombre,descripcion) values('Valsartan', 'Antagonista del receptor de angiotensina II utilizado para tratar la hipertensión y la insuficiencia cardíaca.');
insert into medicamento(nombre,descripcion) values('Diclofenaco', 'Antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor y reducir la inflamación.');
insert into medicamento(nombre,descripcion) values('Amlodipino', 'Bloqueador de los canales de calcio utilizado para tratar la hipertensión y la angina de pecho.');
insert into medicamento(nombre,descripcion) values('Levofloxacino', 'Antibiótico de amplio espectro utilizado para tratar infecciones bacterianas.');
insert into medicamento(nombre,descripcion) values('Escitalopram', 'Antidepresivo utilizado para tratar la depresión y el trastorno de ansiedad generalizada.');
insert into medicamento(nombre,descripcion) values('Clonazepam', 'Benzodiazepina utilizada para tratar trastornos de ansiedad y convulsiones.');
insert into medicamento(nombre,descripcion) values('Diazepam', 'Benzodiazepina utilizada para tratar la ansiedad, los espasmos musculares y las convulsiones.');
insert into medicamento(nombre,descripcion) values('Lorazepam', 'Benzodiazepina utilizada para tratar la ansiedad y los trastornos de pánico.');
insert into medicamento(nombre,descripcion) values('Budesonida', 'Glucocorticoide utilizado para tratar el asma y la enfermedad pulmonar obstructiva crónica (EPOC).');
insert into medicamento(nombre,descripcion) values('Clorfenamina', 'Antihistamínico utilizado para tratar alergias y síntomas de resfriado.');
insert into medicamento(nombre,descripcion) values('Mirtazapina', 'Antidepresivo utilizado para tratar la depresión mayor.');
insert into medicamento(nombre,descripcion) values('Fluoxetina', 'Antidepresivo utilizado para tratar la depresión, el trastorno obsesivo-compulsivo y la bulimia nerviosa.');

-- Generar horarios disponibles para citas
call sp_generar_horarios(i_fecha_inicio := '06/01/2024', i_dias := 7);

-- Citas Medicas
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(1, 1,55,'Dolor de cabeza', '5/25/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 55;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(3, 1,58,'Fiebre persistente', '5/28/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 58;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(7, 2,62,'Tos crónica', '5/30/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 62;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(9, 3,66,'Dolor abdominal', '5/31/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 66;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(10, 4,68,'Fatiga extrema', '6/1/2024', 'INGRESADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 68;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(2, 4,78,'Problemas de visión', '5/27/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 78;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(15, 4,81,'Dolor en el pecho', '5/29/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 81;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(21, 5,86,'Problemas de audición', '5/26/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 86;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(22, 5,89,'Sangrado anormal', '5/28/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 89;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(39, 5,92,'Problemas respiratorios', '6/1/2024', 'INGRESADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 92;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(5, 5,102,'Dolor de espalda', '5/30/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 102;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(41, 15,107,'Síntomas de ansiedad o depresión', '5/31/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 107;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(34, 17,112,'Problemas gastrointestinales', '6/1/2024', 'FINALIZADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 112;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(27, 19,115,'Problemas de la piel (erupciones, picazón, enrojecimiento)', '6/2/2024', 'INGRESADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 115;
insert into cita_medica(id_paciente,id_doctor,id_horario,motivo,fecha_generacion,estado) values(8, 19,119,'Dificultad para dormir o insomnio', '6/3/2024', 'INGRESADA');
update horario_doctor set estado = 'OCUPADO' where id_codigo = 119;

-- Receta Cabecera
insert into receta_cabecera(id_cita,diagnostico) values(1, 'Dolor de cabeza');
insert into receta_cabecera(id_cita,diagnostico) values(2, 'Fiebre persistente');
insert into receta_cabecera(id_cita,diagnostico) values(3, 'Tos crónica');
insert into receta_cabecera(id_cita,diagnostico) values(4, 'Dolor abdominal');
insert into receta_cabecera(id_cita,diagnostico) values(5, 'Fatiga extrema');
insert into receta_cabecera(id_cita,diagnostico) values(6, 'Problemas de visión');
insert into receta_cabecera(id_cita,diagnostico) values(7, 'Dolor en el pecho');
insert into receta_cabecera(id_cita,diagnostico) values(8, 'Problemas de audición');
insert into receta_cabecera(id_cita,diagnostico) values(9, 'Sangrado anormal');
insert into receta_cabecera(id_cita,diagnostico) values(10, 'Problemas respiratorios');
insert into receta_cabecera(id_cita,diagnostico) values(11, 'Dolor de espalda');
insert into receta_cabecera(id_cita,diagnostico) values(12, 'Síntomas de ansiedad o depresión');
insert into receta_cabecera(id_cita,diagnostico) values(13, 'Problemas gastrointestinales');
insert into receta_cabecera(id_cita,diagnostico) values(14, 'Problemas de la piel (erupciones, picazón, enrojecimiento)');
insert into receta_cabecera(id_cita,diagnostico) values(15, 'Dificultad para dormir o insomnio');

-- Receta Detalle
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(1,1,'500 mg','3 veces al día','Alivio del dolor y reducción de la fiebre.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(1,2,'400 mg','2 veces al día','Reducción de la inflamación y alivio del dolor.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(1,3,'20 mg','1 vez al día','Reducción de la acidez estomacal.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(2,4,'500 mg','3 veces al día','Tratamiento de infecciones bacterianas.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(2,3,'10 mg','1 vez al día','Alivio de los síntomas de alergias.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(3,12,'100 mg','1 vez al día','Prevención de coágulos sanguíneos.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(3,14,'500 mg','3 veces al día','Alivio del dolor y reducción de la fiebre.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(4,15,'850 mg','2 veces al día','Control de la glucosa en la diabetes tipo 2.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(4,3,'10 mg','1 vez al día','Tratamiento de la hipertensión y la insuficiencia cardíaca.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(4,25,'20 mg','1 vez al día','Reducción del colesterol LDL.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(6,26,'500 mg','2 veces al día','Tratamiento de infecciones bacterianas.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(6,1,'5 mg','1 vez al día','Tratamiento de la inflamación.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(6,35,'150 mg','2 veces al día','Tratamiento de la úlcera péptica y el reflujo ácido.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(7,1,'40 mg','1 vez al día','Reducción de la acidez estomacal.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(8,1,'250 mg','3 veces al día','Tratamiento de infecciones bacterianas y parasitarias.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(8,21,'40 mg','1 vez al día','Reducción del colesterol LDL.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(8,4,'50 mg','2 veces al día','Alivio del dolor y la inflamación.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(8,7,'325 mg','4 veces al día','Alivio del dolor y reducción de la fiebre.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(9,8,'100 mcg','1 vez al día','Tratamiento del hipotiroidismo.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(9,1,'50 mg','1 vez al día','Tratamiento de la depresión y los trastornos de ansiedad.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(9,37,'10 mg','3 veces al día','Tratamiento de náuseas y vómitos.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(11,1,'40 mg','1 vez al día','Diurético utilizado en la insuficiencia cardíaca.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(12,1,'10 mg','1 vez al día','Alivio de los síntomas de alergias.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(13,17,'500 mg','1 vez al día','Tratamiento de infecciones bacterianas.');
insert into receta_detalle (id_receta_cab,id_medicamento,dosis,dias,indicaciones) values(13,1,'30 mg','2 veces al día','Analgésico opioide utilizado para el alivio del dolor.');
