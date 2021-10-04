DROP TABLE IF EXISTS userMemo;
CREATE TABLE userMemo (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  userName varchar(255),
  memo text,
  PRIMARY KEY (id)
);
