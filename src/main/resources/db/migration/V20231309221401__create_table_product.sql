CREATE TABLE IF NOT EXISTS "product" (
                           "id" SERIAL PRIMARY KEY,
                           "product_name" varchar(120) NOT NULL,
                           "qty_in_stock" integer NOT NULL DEFAULT 0,
                           "product_image" bytea,
                           "price" numeric(5,2) NOT NULL
);