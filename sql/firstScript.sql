-- Animals definition

CREATE TABLE Animals
(
    id           INTEGER not null
        constraint Animals_pk
            primary key autoincrement,
    age          int     default 0 not null,
    eyeColour    text,
    numberOfLegs int     default 0 not null,
    weightInKG   NUMERIC DEFAULT 10 NOT NULL,
    test12       INTEGER
);

CREATE UNIQUE INDEX Animals_id_uindex
    on Animals (id);


-- Beaver definition

CREATE TABLE Beaver
(
    lengthForTeeth INTEGER NOT NULL,
    colourOfFur    TEXT    DEFAULT 'Brown',
    hasADam        NUMERIC DEFAULT 0 NOT NULL,
    id             INTEGER PRIMARY KEY AUTOINCREMENT,
    animalID       INTEGER NOT NULL
);

-- Birds definition

CREATE TABLE Birds
(
    id       INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    name     TEXT    NOT NULL,
    age      int default 0,
    eyeColor text
);

CREATE TABLE Cat
(
    isDomesticated NUMERIC DEFAULT 1 NOT NULL,
    breed          TEXT(15),
    furColour      REAL    DEFAULT 'brown',
    ID             INTEGER PRIMARY KEY AUTOINCREMENT
);

CREATE TABLE Dog
(
    name    TEXT    NOT NULL,
    height  INTEGER DEFAULT 62 NOT NULL,
    canRun  NUMERIC DEFAULT 1,
    id      INTEGER PRIMARY KEY AUTOINCREMENT,
    colour  TEXT    DEFAULT 'brown',
    canBite NUMERIC DEFAULT 0 NOT NULL,
    canSwim NUMERIC NOT NULL
);

INSERT INTO Animals (id, age, eyeColour, numberOfLegs, weightInKG, test12)
VALUES (1, 12, 'blue', 4, 10, NULL),
       (2, 2, 'null', 0, 10, NULL),
       (3, 2, 'null', 0, 10, NULL);

INSERT INTO Beaver (lengthForTeeth, colourOfFur, hasADam, id, animalID)
VALUES (6, 'Brown', 0, 1, 1),
       (4, 'red', 1, 2, 2),
       (4, 'red', 1, 3, 3);

INSERT INTO Birds (id, name, age, eyeColor)
VALUES (1, 'Penguin', 6, 'black'),
       (2, 'Swan', 4, 'red'),
       (3, 'Emu', 6, 'blue'),
       (4, 'Duck', 4, 'brown'),
       (5, 'Duck', 4, 'brown'),
       (7, 'Goose', 2, 'black'),
       (8, 'Goose', 2, 'brown'),
       (9, 'Pigeon', 10, 'black');