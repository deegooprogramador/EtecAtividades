CREATE TABLE Autores (
    id INT PRIMARY KEY,
    nome VARCHAR(100)
);

CREATE TABLE Livros (
    id INT PRIMARY KEY,
    titulo VARCHAR(100),
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES Autores(id)
);

INSERT INTO Autores (id, nome) VALUES (1, 'Autor A');
INSERT INTO Autores (id, nome) VALUES (2, 'Autor B');

INSERT INTO Livros (id, titulo, autor_id) VALUES (1, 'Livro 1', 1);
INSERT INTO Livros (id, titulo, autor_id) VALUES (2, 'Livro 2', 1);
INSERT INTO Livros (id, titulo, autor_id) VALUES (3, 'Livro 3', 2);

