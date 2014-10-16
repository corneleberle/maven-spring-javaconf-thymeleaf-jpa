CREATE TABLE Company
(
  id BIGINT IDENTITY,
  name VARCHAR(255),
  employees INTEGER
);

INSERT INTO Company (name, employees) values('Namics AG', 424);
INSERT INTO Company (name, employees) values('Swisscom AG', 12050);
