from ..config.mysqlconnection import connectToMySQL
from flask_app import DATABASE


class Filmmaker:
    def __init__(self,data):
        self.id =data['id']
        self.name= data['name']
        self.created_at=data['created_at']
        self.updated_at=data['updated_at']

    @classmethod    
    def getall(cls) :
        query = "select * FROM filmmakers_copy1"
        results = connectToMySQL(DATABASE).query_db(query)
        movies = []
        for row in results:
            movies.append(cls(row))
        return movies
    @classmethod 
    def save(cls,data):
        query = "INSERT INTO filmmakers_copy1 (name) VALUES (%(name)s); " 
        return connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod
    def get_by_id(cls,data):
        query = "SELCT * FROM filmmakers_copy1 WHERE id = %(id)s;"
        result = connectToMySQL(DATABASE).query_db(query,data)
        return cls(result[0])
    
    
    
