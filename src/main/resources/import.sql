INSERT INTO tb_category(descricao) VALUES ('Palestras e workshops sobre tecnologia e inovação');
INSERT INTO tb_category(descricao) VALUES ('Palestras voltadas para empreendedorismo e gestão');

INSERT INTO tb_participant(nome, email) VALUES ('Ana Silva', 'ana.silva@gmail.com');
INSERT INTO tb_participant(nome, email) VALUES ('Bruno Costa', 'bruno.costa@gmail.com');
INSERT INTO tb_participant(nome, email) VALUES ('Carla Souza', 'carla.souza@gmail.com');
INSERT INTO tb_participant(nome, email) VALUES ('Diego Ferreira', 'diego.ferreira@gmail.com');

INSERT INTO tb_activity(category_id, nome, descricao, preco) VALUES (2, 'Introdução ao Spring Boot', 'Boot	Workshop prático sobre desenvolvimento com Spring Boot', 150.00);
INSERT INTO tb_activity(category_id, nome, descricao, preco) VALUES (1, 'Empreendedorismo Digital', 'Palestra sobre como iniciar um negócio digital do zero', 80.00);

INSERT INTO tb_activity_participant(activity_id, participant_id) VALUES (2, 3);
INSERT INTO tb_activity_participant(activity_id, participant_id) VALUES (1, 4);
INSERT INTO tb_activity_participant(activity_id, participant_id) VALUES (1, 2);
INSERT INTO tb_activity_participant(activity_id, participant_id) VALUES (2, 1);

INSERT INTO tb_time_slot(activity_id, inicio, fim) VALUES (2, TIMESTAMP WITH TIME ZONE '2026-09-10T09:00:00Z', TIMESTAMP WITH TIME ZONE '2026-09-10T11:00:00Z');
INSERT INTO tb_time_slot(activity_id, inicio, fim) VALUES (1, TIMESTAMP WITH TIME ZONE '2026-09-10T14:00:00Z', TIMESTAMP WITH TIME ZONE '2026-09-10T16:00:00Z');
INSERT INTO tb_time_slot(activity_id, inicio, fim) VALUES (2, TIMESTAMP WITH TIME ZONE '2026-09-11T10:00:00Z', TIMESTAMP WITH TIME ZONE '2026-09-11T12:00:00Z');