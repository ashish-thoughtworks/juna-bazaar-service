DROP TABLE IF EXISTS images;

CREATE TABLE product_images
(
	id bigint PRIMARY KEY NOT NULL,
	public_id text,
	image_url text NOT NULL,
	product_id bigint
);