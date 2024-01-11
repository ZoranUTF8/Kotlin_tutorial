class Dog(val dogName: String) : Animal("Dog") {
    override fun makeSound() {
        println("The animal with type of $name with name $dogName is wow wow")
    }


}