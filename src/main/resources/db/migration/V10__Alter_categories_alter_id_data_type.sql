DROP TABLE IF EXISTS categories;

CREATE TABLE categories
(
	id bigserial PRIMARY KEY NOT NULL,
	name text NOT NULL
);