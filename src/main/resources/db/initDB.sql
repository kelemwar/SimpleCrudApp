DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq
  START 100000;

CREATE TABLE users
(
  id            INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name          VARCHAR       NOT NULL,
  last_name     VARCHAR       NOT NULL,
  birthday      TIMESTAMP     NOT NULL,
  gender         VARCHAR       NOT NULL

);

