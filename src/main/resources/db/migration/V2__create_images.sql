DROP TABLE IF EXISTS images;

CREATE TABLE images
(
	id bigint NOT NULL,
	url text NOT NULL,
	product_id bigint NOT NULL
);