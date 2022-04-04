create table sucursales(
	sucursal_id	INT IDENTITY(1,1) 	NOT NULL,
	nombre 		VARCHAR(50)	NOT NULL,
	CONSTRAINT sucursal_pk PRIMARY KEY(sucursal_id)
);

create table ordenes(
	orden_id 	INT IDENTITY(1,1)	NOT NULL,
	sucursal_id	INT NOT NULL,
	fecha		DATE 	NOT NULL,
	total 		DECIMAL NOT NULL,
	CONSTRAINT orden_pk PRIMARY KEY(orden_id)
);

create table productos(
	producto_id INT IDENTITY(1,1)			NOT NULL,
	orden_id 	INT			NOT NULL,
	codigo 		VARCHAR(20) 	NOT NULL,
	descripcion	VARCHAR(200) 	NOT NULL,
	precio		DECIMAL			NOT NULL,
	CONSTRAINT producto_pk PRIMARY KEY(producto_id)
);
