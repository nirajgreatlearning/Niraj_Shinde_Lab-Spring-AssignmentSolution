use college_fest;
INSERT INTO roles VALUES(1, 'ADMIN'); INSERT INTO roles VALUES(2, 'USER');

INSERT INTO users VALUES(1, '$2a$12$2d1hIQpz25UZucmzvYE3Duy0rjnhqZ16fl8VFb09f5tXBoMYLiJxy', 'ADMIN'); 
INSERT INTO users VALUES(2, '$2a$12$2d1hIQpz25UZucmzvYE3Duy0rjnhqZ16fl8VFb09f5tXBoMYLiJxy', 'Student');

INSERT INTO users_roles VALUES(1, 1);
INSERT INTO users_roles VALUES(2, 2);