CREATE TABLE "user_profile" (
	"id" serial NOT NULL,
	"login" character varying(50) UNIQUE,
	"password" character varying(20),
	"first_name" character varying(20),
	"last_name" character varying(20),
	"email" character varying(50),
	"shop_id" int,
	"role" int,
	CONSTRAINT user_profile_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "shop" (
	"id" serial NOT NULL,
	"name" character varying(50),
	"company_id" int,
	CONSTRAINT shop_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "company" (
	"id" serial NOT NULL,
	"name" character varying,
	CONSTRAINT company_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Untitled" (
	"id" serial NOT NULL,
	"name" character varying,
	"value" character varying,
	CONSTRAINT Untitled_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "instrtype" (
	"id" serial NOT NULL,
	"name" character varying,
	CONSTRAINT instrtype_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "instr" (
	"id" serial NOT NULL,
	"name" character varying,
	"ovner_id" int,
	"instrtype_id" int,
	"location_id" int,
	"date_review" TIMESTAMP,
	"validity" int,
	CONSTRAINT instr_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "user_profile" ADD CONSTRAINT "user_profile_fk0" FOREIGN KEY ("shop_id") REFERENCES "shop"("id");

ALTER TABLE "shop" ADD CONSTRAINT "shop_fk0" FOREIGN KEY ("company_id") REFERENCES "company"("id");




ALTER TABLE "instr" ADD CONSTRAINT "instr_fk0" FOREIGN KEY ("ovner_id") REFERENCES "user_profile"("id");
ALTER TABLE "instr" ADD CONSTRAINT "instr_fk1" FOREIGN KEY ("instrtype_id") REFERENCES "instrtype"("id");
ALTER TABLE "instr" ADD CONSTRAINT "instr_fk2" FOREIGN KEY ("location_id") REFERENCES "shop"("id");

