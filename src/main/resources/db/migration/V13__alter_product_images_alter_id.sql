DROP TABLE IF EXISTS product_images;

CREATE TABLE product_images
(
	id bigserial PRIMARY KEY NOT NULL,
	public_id text,
	image_url text NOT NULL,
	product_id bigint
);