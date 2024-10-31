-- 建用户表
CREATE TABLE users (
    uid INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role TINYINT(1) NOT NULL CHECK (role IN (0, 1))
);

-- 建课程表

-- 建选课表