from flask import Flask  # Import Flask to allow us to create our app
app = Flask(__name__)    # Create a new instance of the Flask class called "app"
@app.route('/')          # The "@" decorator associates this route with the function immediately following
def hello_world():
    return 'Hello World!'  # Return the string 'Hello World!' as a response

@app.route('/dojo')          # The "@" decorator associates this route with the function immediately following
def dojo():
    return 'dojo!'


@app.route('/say/<name>')          # The "@" decorator associates this route with the function immediately following
def hi_michael(name):
    return f'Hi {name}!'


@app.route("/repeat/<times>/<name>")
def contact_hello_times(times,name):
    
    return f"<h2> {name} </h2>" * int(times)


if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True) 
# Run the app in debug mode.



