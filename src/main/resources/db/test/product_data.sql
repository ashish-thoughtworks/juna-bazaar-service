--delete from product_images;
--delete from products;

INSERT INTO products( id, title, price, creation_date, user_id, description, is_sold, city_id, modification_date, category_id)
VALUES (1, 'Car', 14000, '2003-2-1', 1, 'Macbook', false, 1, '2003-2-1', 1);

insert into product_images values(4, 'iw2xegar0tzy3ln9edc3', 'http://res.cloudinary.com/dnryicujh/image/upload/v1479274189/iw2xegar0tzy3ln9edc3.jpg', 1)

