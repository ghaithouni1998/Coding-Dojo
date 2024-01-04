const express = require("express");
const app = express();
const port = 8000;
const { faker } = require('@faker-js/faker');

app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );

const createUse=()=>{
    const user={
        firstName : faker.person.firstName()
        lastName : faker.person.lastName()
        phoneNumber : faker.phone.number()
        email :  faker.internet.email()
        password : faker.internet.password()
    }
    return user;
}

const createCompany=()=>{
    const company ={
        name : faker.company.name(),
        adress :{
            country : faker.location.country(),
            city : faker.location.city(),
            street : faker.location.street()
        }
    }
}

app.get('/api/user/new',(req,res)=>{
    const users=createUse();

    return res.json({users:users})
})

app.get('/api/companies/new',(req,res)=>{
    const companies=createCompany();

    return res.json({companies:companies})
})


app.listen( (port), () => console.log("Listening on port"+ port ));