
from flask_app import app

#! ALWAYS REMEMBER TO DECLARE YOUR ROUTES
from flask_app.controllers import users
from flask_app.controllers import messages


if (
    __name__ == "__main__"
): 
    app.run(debug=True)  # Run the app in debug mode.