CREATE TABLE IF NOT EXISTS cities
(
	id bigserial PRIMARY KEY NOT NULL,
	name VARCHAR(100) NOT NULL
);


CREATE TABLE  IF NOT EXISTS users
(
	id bigserial PRIMARY KEY NOT NULL,
	email VARCHAR(100) NOT NULL,
	password VARCHAR(200) NOT NULL,
	mobile_no VARCHAR(10) NOT NULL,
	city_id bigint NOT NULL,
	name VARCHAR(100)
);

CREATE TABLE  IF NOT EXISTS categories
(
	id bigserial PRIMARY KEY NOT NULL,
	name VARCHAR(100) NOT NULL
);

CREATE TABLE  IF NOT EXISTS products
(
  id bigserial PRIMARY KEY NOT NULL,
  title VARCHAR(100)  NOT NULL,
  price decimal NOT NULL,
  creation_date timestamp,
  user_id int  NOT NULL,
  description VARCHAR(100) NOT NULL,
  is_sold boolean NOT NULL,
  city_id int NOT NULL,
  modification_date timestamp,
  category_id int NOT NULL,
  mobile_no VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS product_images
(
	id bigserial PRIMARY KEY NOT NULL,
	public_id varchar(500),
	image_url varchar(500) NOT NULL,
	product_id int
);