USE tyut;

# 学生
CREATE TABLE student
(
    id               int UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT '自增编号',
    student_d        varchar(10) COMMENT '学号',
    name             varchar(10) COMMENT '姓名',
    sex              varchar(1) COMMENT '性别',
    political_status  varchar(10),
    nation           varchar(10) COMMENT '籍贯',
    identity_num      varchar(18) COMMENT '身份证号',
    instructor_name   varchar(10) COMMENT '辅导员',
    password         varchar(18) COMMENT '登录密码',
    birth            date COMMENT '出生日期',
    ethnic           varchar(10) COMMENT '民族',
    admission_date    date COMMENT '入学日期',
    academy          varchar(30) COMMENT '学院',
    cls              varchar(30) COMMENT '班级',
    dormitory_id      varchar(10) COMMENT '宿舍号',
    personal_phone    varchar(11) COMMENT '个人电话',
    parent_phone      varchar(11) COMMENT '父母电话',
    province         varchar(10) COMMENT '省份',
    city             varchar(10) COMMENT '城市',
    area             varchar(10) COMMENT '县区',
    address_detail    varchar(100) COMMENT '详细地址',
    register_captcha varchar(4)
) DEFAULT CHARACTER SET utf8;

# 老师
CREATE TABLE teacher
(
    id               int AUTO_INCREMENT PRIMARY KEY,
    teacherId        varchar(10),
    name             varchar(10),
    identity_num      varchar(18) COMMENT '身份证号',
    sex              varchar(1),
    academy          varchar(30),
    political_status  varchar(10),
    nation           varchar(10) COMMENT '籍贯',
    password         varchar(18),
    phone            varchar(11),
    ethnic           varchar(10),
    province         varchar(10),
    city             varchar(10),
    county           varchar(10),
    address_detail    varchar(100),
    register_captcha varchar(4)
) DEFAULT CHARACTER SET utf8;

# 学院
CREATE TABLE academy
(
    id           int AUTO_INCREMENT PRIMARY KEY,
    name         varchar(30),
    count        int,
    introduction varchar(100)
) CHARACTER SET utf8;

# 专业
CREATE TABLE profession
(
    id           int AUTO_INCREMENT PRIMARY KEY,
    name         varchar(30),
    count        int,
    academy      varchar(30),
    introduction varchar(100)
) CHARACTER SET utf8;

# 辅导员
CREATE TABLE instructor
(
    id      int AUTO_INCREMENT PRIMARY KEY,
    name    varchar(10),
    sex     varchar(1),
    academy varchar(10)
) CHARACTER SET utf8;

# 班级
CREATE TABLE cls
(
    id           int AUTO_INCREMENT PRIMARY KEY,
    name         varchar(30),
    count        int,
    instructor_id int
) CHARACTER SET utf8;

# 课程
CREATE TABLE course
(
    id         int AUTO_INCREMENT PRIMARY KEY,
    name       varchar(10),
    course_time int,
    academy    varchar(10),
    profession varchar(10),
    teacher    varchar(10)
) CHARACTER SET utf8;

# 成绩
CREATE TABLE score
(
    id          int AUTO_INCREMENT PRIMARY KEY,
    student_id   varchar(10),
    student_name varchar(10),
    course      varchar(30),
    score       double(3, 2)
) CHARACTER SET utf8;

# 管理员登录
CREATE TABLE manager_login
(
    id       int AUTO_INCREMENT PRIMARY KEY,
    name     varchar(10),
    password varchar(18),
    root     varchar(10)
) CHARACTER SET utf8;

# 教师登录
CREATE TABLE teacher_login
(
    id       int AUTO_INCREMENT PRIMARY KEY,
    name     varchar(10),
    password varchar(18)
) CHARACTER SET utf8;

# 学生登录
CREATE TABLE student_login
(
    id       int AUTO_INCREMENT PRIMARY KEY,
    name     varchar(10),
    password varchar(18)
) CHARACTER SET utf8;

# 转入
CREATE TABLE transfer_info
(
    id             int AUTO_INCREMENT PRIMARY KEY,
    student_id      varchar(10),
    student_name    varchar(10),
    pre_academy     varchar(30),
    pre_profession  varchar(30),
    pre_cls         varchar(30),
    post_academy    varchar(30),
    post_profession varchar(30),
    post_cls        varchar(30)
) CHARACTER SET utf8;

# 学分
CREATE TABLE academic_credit
(
    id          int AUTO_INCREMENT PRIMARY KEY,
    student_id   varchar(10),
    student_name varchar(10),
    credit      int
) CHARACTER SET utf8;

# 奖惩信息
CREATE TABLE reward_and_punishment
(
    id          int AUTO_INCREMENT PRIMARY KEY,
    student_id   varchar(10),
    student_name varchar(10),
    score       int,
    reason      varchar(100)
) CHARACTER SET utf8;

# 选修课
CREATE TABLE electives
(
    id           int AUTO_INCREMENT PRIMARY KEY,
    name         varchar(30),
    course_time   int,
    credit       int,
    total_count   int,
    current_count int DEFAULT 0
) CHARACTER SET utf8;

# 学生选秀课程信息
CREATE TABLE student_electives
(
    id          int AUTO_INCREMENT PRIMARY KEY,
    student_id   varchar(10),
    student_name varchar(10),
    elective_id  int
) CHARACTER SET utf8;

# 选修课成绩
CREATE TABLE elective_score
(
    id           int AUTO_INCREMENT PRIMARY KEY,
    student_id    varchar(10),
    student_name  varchar(10),
    elective_id   int,
    elective_name varchar(30),
    score        int
) CHARACTER SET utf8;


