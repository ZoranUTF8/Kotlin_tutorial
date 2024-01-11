abstract class Animal(val name: String, val legs: Int = 4) {
    // Model behaviours that we want to have in subclasses
    abstract fun makeSound()
}

