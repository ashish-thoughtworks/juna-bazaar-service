DROP TABLE IF EXISTS "junabazaar-master".images;

CREATE TABLE "junabazaar-master".images
(
	id bigint NOT NULL,
	url text NOT NULL,
	product_id bigint NOT NULL
)WITH (
  OIDS=FALSE
);
ALTER TABLE "junabazaar-master".images
  OWNER TO "junabazaar-master";