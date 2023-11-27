from flask_app import app
from flask import render_template, redirect, request, flash, session
from flask_app.models.movie_model import Movie
from flask_app.models.filmmeker_model import Filmmaker
# from flask_bcrypt import Bcrypt

@app.route("/")
def index():
    return render_template("index.html" , allFilmmaker = Filmmaker.getall())

@app.route("/create/filmmaker",methods=['post'])
def create_filmmaker():
    data = {
        "name" : request.form['name'],
    }
    filmmaker = Filmmaker.save(data)
    return redirect('/')
