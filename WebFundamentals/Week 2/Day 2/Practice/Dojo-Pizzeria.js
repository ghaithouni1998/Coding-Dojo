function thePizzaOven(crustType, sauceType, cheese, toppings) {
    var pizza = {}
    pizza.crustType = crustType;
    pizza.sauceType = sauceType;
    pizza.cheese = cheese;
    pizza.toppings = toppings;
    return pizza
       }

var pizza1 = thePizzaOven("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);
console.log(pizzaA)


var pizza2= thePizzaOven("hand tossed", "marinara", ["mozzarella", "feta"],["mushrooms", "olives", "onions"])
console.log(pizzaB)

var pizza3=thePizzaOven("thick" , "spicy red", "black cheese", "supreme" )
console.log(pizzaC)

var pizza4=thePizzaOven("stuffed","alfredo","cheddar","pepperoni")
console.log(pizzaD)