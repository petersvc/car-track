CREATE TABLE ano (
    id      BIGSERIAL PRIMARY KEY,
    codigo  VARCHAR(50) NOT NULL UNIQUE,
    nome    VARCHAR(50) NOT NULL
);
