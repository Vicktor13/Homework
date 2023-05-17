CREATE TABLE IF NOT EXISTS students
(
    id    BIGSERIAL PRIMARY KEY ,
    name  VARCHAR(255) NOT NULL ,
    mark  int
    );

-- INSERT INTO students (id, name, mark)
-- VALUES (generate_series(1, 1000),  substr(gen_random_uuid()::text, 1, 10), floor(random() * 71) + 10;
--        );