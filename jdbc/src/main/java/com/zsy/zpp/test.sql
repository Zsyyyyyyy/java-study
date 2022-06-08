
CREATE TABLE IF NOT EXISTS `zsy_test`(
                                         `id` INT UNSIGNED AUTO_INCREMENT,
                                         `title` VARCHAR(100) NOT NULL,
    `author` VARCHAR(40) NOT NULL,
    `date_test` DATE,
    PRIMARY KEY ( `id` )
    )ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert zsy_test (id,title,author,date_test) value (1,"2121","1221","2021-12-01");