DROP TABLE IF EXISTS users;

CREATE TABLE users
(
	id bigserial PRIMARY KEY NOT NULL,
	email VARCHAR(100) NOT NULL,
	password VARCHAR(200) NOT NULL,
	mobile_no VARCHAR(10) NOT NULL,
	city_id bigint NOT NULL REFERENCES cities(id)
);