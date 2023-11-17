from pet import Pet

class Dog(Pet):
    def __init__(self, name , tricks):
        super().__init__(name, "dog", tricks)

Dog1= Dog("loo" , ["swim","sleep"])

Dog1.noise() 
    