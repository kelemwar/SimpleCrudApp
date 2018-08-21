DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;


INSERT INTO users (name, last_name, birthday, gender) VALUES
  ('Ivan', 'Petrov', '1985-05-28 03:28:00' , 'male'),
  ('Olga', 'Velikova', '1993-06-05 22:13:00', 'female'),
  ('Denis', 'Kurpatov', '1969-07-28 05:24:00', 'male'),
  ('Tatyana', 'Kondratova', '1996-08-30 15:43:00', 'female');
