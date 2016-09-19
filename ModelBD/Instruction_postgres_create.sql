CREATE TABLE "user_profile" (
	"id" serial NOT NULL,
	"login" character varying(50) UNIQUE,
	"password" character varying(20),
	"first_name" character varying(20) NOT NULL,
	"last_name" character varying(20) NOT NULL,
	"email" character varying(50) NOT NULL,
	"shop_id" int NOT NULL,
	"role" int NOT NULL,
	CONSTRAINT user_profile_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "shop" (
	"id" serial NOT NULL,
	"name" character varying(50) NOT NULL,
	"company_id" int NOT NULL,
	CONSTRAINT shop_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "company" (
	"id" serial NOT NULL,
	"name" character varying NOT NULL,
	CONSTRAINT company_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Untitled" (
	"id" serial NOT NULL,
	"name" character varying NOT NULL,
	"value" character varying NOT NULL,
	CONSTRAINT Untitled_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "instrtype" (
	"id" serial NOT NULL,
	"name" character varying NOT NULL,
	CONSTRAINT instrtype_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "instr" (
	"id" serial NOT NULL,
	"name" character varying NOT NULL,
	"ovner" int NOT NULL,
	"instrtype" int NOT NULL,
	"location" int NOT NULL,
	"date_review" TIMESTAMP NOT NULL,
	"validity" int NOT NULL,
	CONSTRAINT instr_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "user_profile" ADD CONSTRAINT "user_profile_fk0" FOREIGN KEY ("shop_id") REFERENCES "shop"("id");

ALTER TABLE "shop" ADD CONSTRAINT "shop_fk0" FOREIGN KEY ("company_id") REFERENCES "company"("id");




ALTER TABLE "instr" ADD CONSTRAINT "instr_fk0" FOREIGN KEY ("ovner") REFERENCES "user_profile"("id");
ALTER TABLE "instr" ADD CONSTRAINT "instr_fk1" FOREIGN KEY ("instrtype") REFERENCES "instrtype"("id");
ALTER TABLE "instr" ADD CONSTRAINT "instr_fk2" FOREIGN KEY ("location") REFERENCES "shop"("id");

