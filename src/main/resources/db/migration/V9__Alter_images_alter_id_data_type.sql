DROP TABLE IF EXISTS images;

CREATE TABLE images
(
	id bigserial PRIMARY KEY NOT NULL,
	url text NOT NULL,
	product_id bigint NOT NULL
);