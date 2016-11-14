DROP TABLE IF EXISTS products;

CREATE TABLE products
(
  id bigint NOT NULL,
  title text NOT NULL,
  price numeric NOT NULL,
  creation_date timestamp without time zone NOT NULL,
  user_id bigint  NOT NULL,
  description text  NOT NULL,
  is_sold boolean NOT NULL,
  city_id bigint NOT NULL,
  modification_date timestamp without time zone NOT NULL,
  category_id bigint NOT NULL,
  CONSTRAINT primary_key PRIMARY KEY (id)
);

