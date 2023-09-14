CREATE TABLE IF NOT EXISTS "shopping_cart_item" (
                                      "id" SERIAL PRIMARY KEY,
                                      "cart_id" integer NOT NULL,
                                      "product_item_id" integer NOT NULL,
                                      "qty" integer NOT NULL
);

COMMENT ON COLUMN shopping_cart_item.cart_id IS 'This is column to store reference to the cart associated with this product';
COMMENT ON COLUMN shopping_cart_item.product_item_id IS 'This is column to store reference to the product itself added to the cart';
COMMENT ON COLUMN shopping_cart_item.qty IS 'This is quantity of product added to the cart'