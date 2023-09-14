CREATE TABLE IF NOT EXISTS "shop_order" (
                              "id" SERIAL PRIMARY KEY,
                              "user_id" integer NOT NULL,
                              "order_date" timestamp,
                              "payment_method_id" integer NOT NULL,
                              "shipping_address_id" integer NOT NULL,
                              "order_total" numeric(8,2) NOT NULL,
                              "order_status" integer
);