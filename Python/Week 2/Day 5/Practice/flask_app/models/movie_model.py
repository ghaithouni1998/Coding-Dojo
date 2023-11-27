from ..config.mysqlconnection import connectToMySQL

class Movie:
    def __init__(self,data):
        self.id = data['id']
        self.title=data['title']
        self.year=data['year']
        self.created_at=data['created_at']
        self.updated_at=data['updated_at']
        self.filmmaker=data['filmmaker']

    @classmethod    
    def getall(cls) :
        query = "select * FROM movies"
        results = connectToMySQL('silmmaker_db')
        movies = []
        for row in results:
            movies.append(cls(row))
        return movies
    @classmethod 
    def save(cls,data):
        query = "INSERT INTO moves (title,year) VALUES (%(title)s , %(year)s , %(silmmeker)s); " 
        return connectToMySQL('silmmaker_db').query_db(query,data)
    
    @classmethod
    def get_by_id(cls,data):
        query = "SELCT * FROM movies WHERE id = %(id)s;"
        result = connectToMySQL('silmmaker_db').query_db(query,data)
        return cls(result[0])
    
    @classmethod
    def edit(cls,data):
        query = "UPDATE movies SET title = %(title)s ,year =%(year)s WHERE id = %(id)s "
        return connectToMySQL('silmmaker_db').query_db(query,data)
    
    
