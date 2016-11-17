delete from product_images;
delete from products;

INSERT INTO products(title, price, creation_date, user_id, description, is_sold, city_id, modification_date, category_id) VALUES ('Car', 14000, '2003-2-1', (select id from users where email = 'a@b.c'), 'Macbook', false, (select id from cities where name='Pune'), '2003-2-1', (select id from categories where name='Electronics'));

insert into product_images (public_id, image_url, product_id) values('iw2xegar0tzy3ln9edc3', 'http://res.cloudinary.com/dnryicujh/image/upload/v1479274189/iw2xegar0tzy3ln9edc3.jpg', (select id from products where title = 'Car'));

