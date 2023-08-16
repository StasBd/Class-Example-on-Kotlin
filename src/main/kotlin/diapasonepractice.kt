fun main() {
    val person = Person("John", 25)
    person.sayHello()
}

class Person(val name: String, var age: Int) {
    fun sayHello() {
        println("Hello, my name is $name")
    }
}