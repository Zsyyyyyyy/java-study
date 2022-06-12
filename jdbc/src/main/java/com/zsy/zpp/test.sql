create database test;
use test;
CREATE TABLE IF NOT EXISTS `zsy_user`(
    `id` INT UNSIGNED AUTO_INCREMENT,
    `username` VARCHAR(100) NOT NULL,
    `password` VARCHAR(40) NOT NULL,
    PRIMARY KEY ( `id` )
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert zsy_user (id,username,password) value (1,"zsy","1221"),(2,"wwy","1234");
update test.zsy_test set title = "11" where id = 3;