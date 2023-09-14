CREATE TABLE IF NOT EXISTS "user_payment_method" (
                                       "id" SERIAL PRIMARY KEY,
                                       "user_id" integer NOT NULL,
                                       "payment_type_id" integer NOT NULL,
                                       "provider" varchar(20) NOT NULL,
                                       "account_number" varchar(25) NOT NULL,
                                       "expiry_date" timestamp NOT NULL,
                                       "is_default" boolean DEFAULT true
);

COMMENT ON COLUMN user_payment_method.provider IS 'This can be stored provider such as Visa or Mastercard';