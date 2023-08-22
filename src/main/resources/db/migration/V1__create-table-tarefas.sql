CREATE TABLE tarefas (
    id INT PRIMARY KEY,
    titulo VARCHAR(255),
    descricao TEXT,
    dataCriacao DATE,
    dataVencimento DATE,
    prioridade VARCHAR(20),
    status VARCHAR(20),
    responsavel VARCHAR(255),
    dataConclusao DATE
);
