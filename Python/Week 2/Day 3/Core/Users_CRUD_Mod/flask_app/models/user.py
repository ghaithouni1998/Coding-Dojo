from flask_app.config.mysqlconnection import connectToMySQL

# from pprint import pprint

DATABASE = "user"


class User:
    def __init__(self, data):
        self.id = data["id"]
        self.first_name = data["first_name"]
        self.last_name = data["last_name"]
        self.email = data["email"]
        self.created_at = data["created_at"]
        self.updated_at = data["updated_at"]

    #! READ ALL
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM user;"
        results = connectToMySQL(DATABASE).query_db(query)
        users = []
        
        for row in results:
            one_user = cls(row)
            users.append(one_user)
        print(users)
        return users

    #! CREATE
    @classmethod
    def save(cls, data):
        query = """
                    INSERT INTO user(first_name, last_name, email)
                    VALUES (%(first_name)s,%(last_name)s,%(email)s);
                """

        result = connectToMySQL(DATABASE).query_db(query, data)
        # print(result)
        return result

    #! GET ONE BY ID
    @classmethod
    def get_one(cls, data):
        query = "SELECT * FROM user WHERE id = %(id)s;"

        result = connectToMySQL(DATABASE).query_db(query, data)
        user = cls(result[0])

        return user

    #! UPDATE

    @classmethod
    def update(cls, data):
        update_query = """  
                            UPDATE user
                            SET first_name = %(first_name)s, last_name=%(last_name)s, email=%(email)s
                            WHERE id = %(id)s;

                        """
        result = connectToMySQL(DATABASE).query_db(update_query, data)
        print(f"====>Upadte result: ")
        return result

    #! DELETE
    # TODO