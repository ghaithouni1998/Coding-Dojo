SELECT * FROM `dojo-and-ninja`.dojos;
INSERT INTO dojos (name) 
VALUES("Ahmed"),
	("Jane"),
    ("Alaa");
DELETE FROM dojos WHERE id>0 ;

INSERT INTO dojos (name) 
VALUES("jon"),
	("ahmed"),
    ("Ala");
UPDATE dojos SET name ="Africa" WHERE id = 34 ;
UPDATE dojos SET name ="America" WHERE id = 35 ;
UPDATE dojos SET name ="Hend" WHERE id = 36 ; 

