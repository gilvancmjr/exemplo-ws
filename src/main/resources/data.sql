-- Inserir dados na tabela Endereco
INSERT INTO Endereco (rua, numero) VALUES
    ('Rua A', 123),
    ('Rua B', 456),
    ('Rua C', 789);

-- Inserir dados na tabela Pessoa
INSERT INTO Pessoa (nome, cpf, endereco_id) VALUES
    ('Joao', '12345678901', 1),
    ('Maria', '98765432101', 2),
    ('Pedro', '54321678901', 3);