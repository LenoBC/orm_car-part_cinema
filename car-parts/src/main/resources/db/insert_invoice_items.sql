INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 3, price, ROUND(3*price, 2), 1, id from parts where id = 1
UNION ALL
select 1, price, ROUND(1*price, 2), 1, id from parts where id = 2
UNION ALL
select 1, price, ROUND(1*price, 2), 1, id from parts where id = 5;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 5, price, ROUND(5*price, 2), 2, id from parts where id = 3
UNION ALL
select 1, price, ROUND(1*price, 2), 2, id from parts where id = 4
UNION ALL
select 1, price, ROUND(1*price, 2), 2, id from parts where id = 6;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 3, id from parts where id = 7
UNION ALL
select 2, price, ROUND(2*price, 2), 3, id from parts where id = 8
UNION ALL
select 3, price, ROUND(3*price, 2), 3, id from parts where id = 9;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 4, id from parts where id = 10;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 5, id from parts where id = 10;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 6, id from parts where id = 10;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 7, id from parts where id = 10;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 8, id from parts where id = 10;

INSERT INTO invoice_items(amount, price, total_value, invoice_id, part_id)
select 1, price, ROUND(1*price, 2), 9, id from parts where id = 10;
