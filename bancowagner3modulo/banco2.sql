CREATE TABLE Estudantes (
    id INT PRIMARY KEY,
    nome VARCHAR(100)
);

CREATE TABLE Cursos (
    id INT PRIMARY KEY,
    nome VARCHAR(100)
);

CREATE TABLE Estudante_Curso (
    estudante_id INT,
    curso_id INT,
    PRIMARY KEY (estudante_id, curso_id),
    FOREIGN KEY (estudante_id) REFERENCES Estudantes(id),
    FOREIGN KEY (curso_id) REFERENCES Cursos(id)
);

INSERT INTO Estudantes (id, nome) VALUES (1, 'Estudante A');
INSERT INTO Estudantes (id, nome) VALUES (2, 'Estudante B');

INSERT INTO Cursos (id, nome) VALUES (1, 'Curso 1');
INSERT INTO Cursos (id, nome) VALUES (2, 'Curso 2');

INSERT INTO Estudante_Curso (estudante_id, curso_id) VALUES (1, 1);
INSERT INTO Estudante_Curso (estudante_id, curso_id) VALUES (1, 2);
INSERT INTO Estudante_Curso (estudante_id, curso_id) VALUES (2, 1);
