ALTER TABLE "user_payment_method" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user_payment_method" ADD FOREIGN KEY ("payment_type_id") REFERENCES "payment_type" ("id");

ALTER TABLE "shop_order" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "shop_order" ADD FOREIGN KEY ("shipping_address_id") REFERENCES "address" ("id");