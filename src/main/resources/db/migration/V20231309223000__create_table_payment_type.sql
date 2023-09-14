CREATE TABLE IF NOT EXISTS "payment_type" (
                                "id" SERIAL PRIMARY KEY,
                                "value" varchar(40) NOT NULL
);

COMMENT ON COLUMN payment_type.value IS 'This can be stored payment type as credit card/paypal or other';
