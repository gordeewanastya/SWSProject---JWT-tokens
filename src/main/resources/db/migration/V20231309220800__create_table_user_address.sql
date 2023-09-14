CREATE TABLE IF NOT EXISTS "user_address" (
                                "user_id" integer NOT NULL,
                                "address_id" integer NOT NULL,
                                "is_default" boolean DEFAULT true
);
