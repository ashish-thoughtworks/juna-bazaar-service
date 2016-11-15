insert into users(email, password, mobile_no, city_id)
VALUES ('a@b.c', '$2a$10$otfHAYpeSeq3lO0PznGnmuUmtfhOrdSzN213azwJggdzcrdHt.jxK', '9087234220', (select id from cities where lower(NAME) = 'bangalore')),
('x@y.z', '$2a$10$BRfHwGDtAWUIrCNKI4fW4uV93HqYasLY85gHRRySP4p2KrA9DqfiW', '8762234550', (select id from cities where lower(NAME) = 'pune'))