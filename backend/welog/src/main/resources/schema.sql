-- ssafy_web_db.board definition

CREATE TABLE IF NOT EXISTS `board` (
                         `board_id` bigint NOT NULL AUTO_INCREMENT,
                         `auth_level` varchar(255) DEFAULT NULL,
                         `category` varchar(255) DEFAULT NULL,
                         `content` text NOT NULL,
                         `register_time` datetime(6) DEFAULT NULL,
                         `title` varchar(255) NOT NULL,
                         `version` varchar(255) DEFAULT NULL,
                         PRIMARY KEY (`board_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- ssafy_web_db.recommend_word definition

CREATE TABLE IF NOT EXISTS `recommend_word` (
                                  `recommend_word_id` bigint NOT NULL AUTO_INCREMENT,
                                  `cnt` bigint DEFAULT NULL,
                                  `word` varchar(255) NOT NULL,
                                  PRIMARY KEY (`recommend_word_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- ssafy_web_db.`user` definition

CREATE TABLE IF NOT EXISTS `user` (
                        `user_id` bigint NOT NULL AUTO_INCREMENT,
                        `password` varchar(255) DEFAULT NULL,
                        `user_email` varchar(255) NOT NULL,
                        `user_name` varchar(255) NOT NULL,
                        `user_role` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`user_id`),
                        UNIQUE KEY `UK1m1yqc8twtkik1ufw1wqggmyp` (`user_name`,`user_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ssafy_web_db.comment definition

CREATE TABLE IF NOT EXISTS `comment` (
                           `comment_id` bigint NOT NULL AUTO_INCREMENT,
                           `content` varchar(1000) DEFAULT NULL,
                           `register_time` datetime(6) DEFAULT NULL,
                           `board_id` bigint DEFAULT NULL,
                           `user_id` bigint DEFAULT NULL,
                           PRIMARY KEY (`comment_id`),
                           KEY `FKlij9oor1nav89jeat35s6kbp1` (`board_id`),
                           KEY `FK8kcum44fvpupyw6f5baccx25c` (`user_id`),
                           CONSTRAINT `FK8kcum44fvpupyw6f5baccx25c` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
                           CONSTRAINT `FKlij9oor1nav89jeat35s6kbp1` FOREIGN KEY (`board_id`) REFERENCES `board` (`board_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ssafy_web_db.feel definition

CREATE TABLE IF NOT EXISTS `feel` (
                        `user_comment_id` bigint NOT NULL AUTO_INCREMENT,
                        `feeling` varchar(255) DEFAULT NULL,
                        `comment_id` bigint DEFAULT NULL,
                        `user_id` bigint DEFAULT NULL,
                        PRIMARY KEY (`user_comment_id`),
                        KEY `FKitaubwuomi8cy29an35jaj1es` (`comment_id`),
                        KEY `FKm10rxvily8qkwjomq5ev5ph7p` (`user_id`),
                        CONSTRAINT `FKitaubwuomi8cy29an35jaj1es` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`comment_id`),
                        CONSTRAINT `FKm10rxvily8qkwjomq5ev5ph7p` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- ssafy_web_db.user_board definition

CREATE TABLE IF NOT EXISTS `user_board` (
                              `user_board_id` bigint NOT NULL AUTO_INCREMENT,
                              `board_id` bigint DEFAULT NULL,
                              `user_id` bigint DEFAULT NULL,
                              PRIMARY KEY (`user_board_id`),
                              KEY `FKtmjpuif5sbn7e6e9bl5vo0bd6` (`board_id`),
                              KEY `FKhfgevw9wg1mt43a9qlhpcuxyw` (`user_id`),
                              CONSTRAINT `FKhfgevw9wg1mt43a9qlhpcuxyw` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
                              CONSTRAINT `FKtmjpuif5sbn7e6e9bl5vo0bd6` FOREIGN KEY (`board_id`) REFERENCES `board` (`board_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


