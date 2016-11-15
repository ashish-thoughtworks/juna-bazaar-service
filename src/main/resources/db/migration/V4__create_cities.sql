DROP TABLE IF EXISTS cities;

CREATE TABLE cities
(
	id bigserial PRIMARY KEY NOT NULL,
	name text NOT NULL
);