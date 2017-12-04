-- liquibase formatted sql

-- changeset doog:1-ds-1
-- comment adding tables
CREATE TABLE app_user (
  id TEXT PRIMARY KEY,
  username TEXT NOT NULL
);

CREATE TABLE user_limit (
  id TEXT PRIMARY KEY,
  user_id TEXT NOT NULL,
  name TEXT NOT NULL,
  value INT NOT NULL
);

CREATE TABLE user_metadata (
  id TEXT PRIMARY KEY,
  user_id TEXT NOT NULL,
  key TEXT NOT NULL,
  value TEXT NOT NULL
);

-- changeset doog:1-ds-2
-- comment adding test data
INSERT INTO app_user (id, username) VALUES ('1', 'JoeyJoeJoeJuniorShabbadoo');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('1', '1', 'charity', 'UNICEF');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('2', '1', 'prize', 'PUPPIES');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('3', '1', 'game', 'BLACKJACK');
INSERT INTO user_limit (id, user_id, name, value) VALUES ('1', '1', 'transaction', 5);
INSERT INTO user_limit (id, user_id, name, value) VALUES ('2', '1', 'withdraw', 10);
INSERT INTO user_limit (id, user_id, name, value) VALUES ('3', '1', 'deposit', 15);
INSERT INTO app_user (id, username) VALUES ('2', 'ScoobyDoo');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('4', '2', 'charity', 'SPOOKY_JANITORS');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('5', '2', 'prize', 'SCOOBY_SNACKS');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('6', '2', 'game', 'ROULETTE');
INSERT INTO user_limit (id, user_id, name, value) VALUES ('4', '2', 'transaction', 1);
INSERT INTO user_limit (id, user_id, name, value) VALUES ('5', '2', 'withdraw', 2);
INSERT INTO user_limit (id, user_id, name, value) VALUES ('6', '2', 'deposit', 3);
INSERT INTO app_user (id, username) VALUES ('3', 'HarryPotter');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('7', '3', 'charity', 'ST_MUNGOS');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('8', '3', 'prize', 'HORCRUX');
INSERT INTO user_metadata (id, user_id, key, value) VALUES ('9', '3', 'game', 'QUIDDITCH');
INSERT INTO user_limit (id, user_id, name, value) VALUES ('7', '3', 'transaction', 100);
INSERT INTO user_limit (id, user_id, name, value) VALUES ('8', '3', 'withdraw', 200);
INSERT INTO user_limit (id, user_id, name, value) VALUES ('9', '3', 'deposit', 300);


-- changeset doog:1-ds-3
CREATE TABLE transaction (
  id TEXT PRIMARY KEY,
  creation_date TIMESTAMP WITH TIME ZONE NOT NULL,
  user_id TEXT NOT NULL,
  currency_code TEXT NOT NULL,
  amount BIGINT NOT NULL,
  type TEXT NOT NULL,
  state TEXT NOT NULL
);
INSERT INTO transaction (id, creation_date, user_id, currency_code, amount, type, state) VALUES ('1', '2017-01-01 10:00', 'ScoobeeDoo', 'EUR', 100, 'DEPOSIT', 'COMPLETE');
INSERT INTO transaction (id, creation_date, user_id, currency_code, amount, type, state) VALUES ('2', '2017-01-01 11:00', 'ScoobeeDoo', 'EUR', 70, 'SPEND', 'COMPLETE');
INSERT INTO transaction (id, creation_date, user_id, currency_code, amount, type, state) VALUES ('3', '2017-01-01 12:00', 'ScoobeeDoo', 'EUR', 30, 'WITHDRAW', 'COMPLETE');
INSERT INTO transaction (id, creation_date, user_id, currency_code, amount, type, state) VALUES ('4', '2017-01-01 13:00', 'JoeyJoeJoeJuniorShabbadoo', 'NOK', 100, 'WINNINGS', 'FAILED');
INSERT INTO transaction (id, creation_date, user_id, currency_code, amount, type, state) VALUES ('5', '2017-01-01 14:01', 'JoeyJoeJoeJuniorShabbadoo', 'NOK', 100, 'WINNINGS', 'COMPLETE');
INSERT INTO transaction (id, creation_date, user_id, currency_code, amount, type, state) VALUES ('6', '2017-01-01 15:00', 'JoeyJoeJoeJuniorShabbadoo', 'NOK', 10, 'SPEND', 'COMPLETE');