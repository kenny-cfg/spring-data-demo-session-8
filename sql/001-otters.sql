DROP DATABASE IF EXISTS zoo;
CREATE DATABASE zoo;
USE zoo;

CREATE TABLE otter
(
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(50) NOT NULL,
    species VARCHAR(50) NOT NULL,
    age     INT,
    weight  DECIMAL(5, 2)
);