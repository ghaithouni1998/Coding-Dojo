class Ninja {
    constructor(name) {
        this.name = name;
        this.health = 100;
        this.speed = 3;
        this.strength = 3;
    }
    sayName() {
        console.log(this.name);
        return this;
    }
    showStats() {
        console.log("Name: " + this.name + ", Health: " + this.health + ", Speed: " + this.speed + ", Strength: " + this.strength);
        return this;
    }
    drinkSake() {
        health += 10;
        return this;
    }
}

// Sensei Class
class Sensei extends Ninja {
    constructor(name) {
        super(name);
        this.health = 200;
        this.speed = 10;
        this.strength = 10;
        this.wisdom = 20;
    }


    speakWisdom() {
        super.drinkSake;
        console.log(`${this.wisdom} What one programmer can do in one month, two programmers can do in two months.`);
        return this
    }
}