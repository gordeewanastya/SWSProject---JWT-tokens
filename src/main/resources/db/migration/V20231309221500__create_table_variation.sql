CREATE TABLE IF NOT EXISTS "variation" (
                             "id" SERIAL PRIMARY KEY,
                             "name" varchar(45) NOT NULL
);

COMMENT ON COLUMN variation.name IS 'This will be stored name of the variation e.g. color, size';