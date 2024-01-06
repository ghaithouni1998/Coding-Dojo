const express  = require('express');
require('dotenv').config()
const cors = require('cors');
const app  = express();

app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );
app.use(cors())
require('./config/mongoose.config')

require('./routes/product_manager.routes')(app)

app.listen(process.env.port,()=>{
    console.log('SERVER IS RUNNING ON PORT ',process.env.port);})