INSERT INTO public.building(
    name, address_id, phone_number, email)
VALUES ('Lucas Alamán 105', (SELECT id from address where street_name='Lucas Alamán'), '5551611238', 'residencial.lalaman105@gmail.com');