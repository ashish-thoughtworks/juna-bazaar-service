DROP TABLE IF EXISTS "junabazaar-master".categories;

CREATE TABLE "junabazaar-master".categories
(
	id bigint NOT NULL,
	name text NOT NULL
)WITH (
  OIDS=FALSE
);
ALTER TABLE "junabazaar-master".categories
  OWNER TO "junabazaar-master";