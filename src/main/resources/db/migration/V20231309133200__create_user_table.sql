CREATE TABLE "user"(
                        "id" SERIAL PRIMARY KEY,
                        "email_address" varchar(80) UNIQUE NOT NULL,
                        "phone_number" varchar(15) UNIQUE NOT NULL,
                        "password" varchar(30) NOT NULL,
                        "role" varchar(10) DEFAULT 'REGULAR'
);

