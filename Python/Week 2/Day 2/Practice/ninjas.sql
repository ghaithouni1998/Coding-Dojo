SELECT * FROM `dojo-and-ninja`.ninjas;
INSERT INTO ninjas (dojo_id,first_name,last_name,age)
VALUES (34,"ahmed","labidi",25),
       (34,"ghaith","ouni",35),
       (34,"houssem","sol",30);

select * from ninjas where ninjas.dojo_id=34;
DELETE FROM ninjas WHERE id>4;
INSERT INTO ninjas (dojo_id,first_name,last_name,age)
VALUES (34,"jihed","labidi",25),
       (34,"mark","ouni",35),
       (34,"jon","sol",30);
       INSERT INTO ninjas (dojo_id,first_name,last_name,age)
VALUES (35,"gkqjdkjn","labidi",25),
       (35,"zkjdnn","ouni",35),
       (35,";z dkln ","sol",30);
 SELECT * FROM ninjas  WHERE dojo_id =34  ;    
 SELECT * FROM ninjas  WHERE dojo_id =36;
 SELECT * FROM  ninjas ORDER BY  dojo_id DESC LIMIT 1 ;
 select * from ninjas
 left join dojos on dojo_id = dojos.id
 where ninjas.id = 25;
 
  select * from ninjas
 left join dojos on dojo_id = dojos_id ;
 
