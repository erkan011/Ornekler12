data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Erkan", 22)
    val (name, age) = person
    println("Name: $name, Age: $age")
}