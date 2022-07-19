CREATE DATABASE IF NOT EXISTS sampledb;
CREATE TABLE IF NOT EXISTS sampledb.testtable (
  id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  title varchar(50),
  contents varchar(500),
  created_at datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
);