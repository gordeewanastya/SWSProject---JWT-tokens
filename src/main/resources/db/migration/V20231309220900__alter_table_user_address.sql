ALTER TABLE "user_address" ADD FOREIGN KEY ("user_id") REFERENCES "user" ("id");

ALTER TABLE "user_address" ADD FOREIGN KEY ("address_id") REFERENCES "address" ("id");