DROP TABLE IF EXISTS users;

CREATE TABLE users
(
	id bigint NOT NULL,
	email VARCHAR(100) NOT NULL,
	password VARCHAR(30) NOT NULL,
	password VARCHAR(10) NOT NULL,
	city_id bigint NOT NULL REFERENCES cities(id)
);