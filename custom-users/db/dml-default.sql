-- Usuarios base
INSERT INTO users (username, password, enabled) VALUES
                                                    ('admin', '1234', true),
                                                    ('user',  '1234', true);

-- Roles o "authorities"
INSERT INTO authorities (username, authority) VALUES
                                                  ('admin', 'ROLE_ADMIN'),
                                                  ('admin', 'ROLE_USER'),
                                                  ('user',  'ROLE_USER');
