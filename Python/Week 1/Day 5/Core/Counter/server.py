from flask import Flask, render_template, session, redirect, url_for, request

app = Flask(__name__)
app.secret_key = 'supersecretkey'

@app.route('/')

def index():
    session['counter'] = session.get('counter', 0)
    session['counter'] += 1
    return render_template('index.html', counter=session['counter'], visits=session['counter'])



@app.route('/reset')
def destroy_session():
    session.pop('counter', None)  
    return redirect(url_for('index'))


@app.route('/clik', methods=['POST'])
def increment():
    return redirect(url_for('index'))


if __name__ == '__main__':
    app.run(debug=True)
