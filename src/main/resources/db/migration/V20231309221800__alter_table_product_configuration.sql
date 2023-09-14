ALTER TABLE "product_configuration" ADD FOREIGN KEY ("product_id") REFERENCES "product" ("id");

ALTER TABLE "product_configuration" ADD FOREIGN KEY ("variation_option_id") REFERENCES "variation_option" ("id");