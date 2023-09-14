CREATE TABLE IF NOT EXISTS "variation_option" (
                                    "id" SERIAL PRIMARY KEY,
                                    "variation_id" integer NOT NULL,
                                    "value" numeric(3,1) NOT NULL
);

COMMENT ON COLUMN variation_option.value IS 'This is column with such values as concrete color e.g. red and size like 38.2';
