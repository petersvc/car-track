CREATE TABLE car (
    id                  BIGSERIAL PRIMARY KEY,
    tipo_veiculo        VARCHAR(255),
    valor               VARCHAR(255),
    marca_id            BIGINT,
    modelo_id           BIGINT,
    ano_modelo_id       BIGINT,
    combustivel         VARCHAR(255),
    codigo_fipe         VARCHAR(255),
    mes_referencia      VARCHAR(255),
    sigla_combustivel   VARCHAR(255),

    CONSTRAINT fk_car_marca FOREIGN KEY (marca_id) REFERENCES marca(id),
    CONSTRAINT fk_car_modelo FOREIGN KEY (modelo_id) REFERENCES modelo(id),
    CONSTRAINT fk_car_ano_modelo FOREIGN KEY (ano_modelo_id) REFERENCES ano_modelo(id)
);
