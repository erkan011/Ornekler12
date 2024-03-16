data class Person4(val name: String, val age: Int)

fun main() {
    val person = Person4("Erkan", 22)

    val (name, age) = person
    println("Name: $name, Age: $age")
}