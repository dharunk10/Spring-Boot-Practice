CREATE database course_reg;
USE course_reg;
show tables;
drop table course_registry_seq;
desc course;
desc course_registry;
select * from course;
select * from course_registry;
ALTER TABLE course_registry MODIFY id INT NOT NULL AUTO_INCREMENT;

insert into course values
("100", "Java", 8, "Kunal"),
("101", "Python", 4, "Mosh"),
("102", "C++", 12, "Jeni");

INSERT INTO course (courseID, courseName, trainer, durtionInWeeks) VALUES
(103, 'JavaScript', 'Brad', 6),
(104, 'C#', 'Scott', 7),
(105, 'Ruby', 'Yukihiro', 5),
(106, 'PHP', 'Rasmus', 6),
(107, 'Swift', 'Chris', 8),
(108, 'Go', 'Rob', 6),
(109, 'Kotlin', 'JetBrains', 7);


insert into course_registry(course_name, email_id, name)
values("Java", "dk10@gmail.com", "Dharun")
;
