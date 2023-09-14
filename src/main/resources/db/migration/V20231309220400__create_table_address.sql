CREATE TABLE IF NOT EXISTS "address" (
                           "id" SERIAL PRIMARY KEY,
                           "address_line" varchar(55) NOT NULL,
                           "postal_code" varchar(15) NOT NULL,
                           "city" varchar(30) NOT NULL,
                           "country_id" integer NOT NULL
);