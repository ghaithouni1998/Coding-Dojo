from flask import Flask, render_template, request, redirect

from users import User

app=Flask(__name__)

@app.route('/')
def index():
    return render_template('Create')


@app.route('/users')
def users():
    return render_template("Read.html",users=User.get_all())


@app.route('/user/new')
def new():
    return render_template("Create.html")

@app.route('/create',methods=['POST'])
def create():
    print(request.form)
    User.save(request.form)
    return redirect('/users')


if __name__=="__main__":
    app.run(debug=True)
