CREATE IF NOT EXISTS TABLE users (
       id SERIAL PRIMARY KEY,
       username VARCHAR(30) NOT NULL,
       password VARCHAR(30) NOT NULL,
       created_at TIMESTAMP DEFAULT now() NOT NULL,
       updated_at TIMESTAMP DEFAULT now() NOT NULL
);


INSERT INTO users VALUES ("aaa", "aaa");
INSERT INTO users VALUES ("aaa", "aaa");