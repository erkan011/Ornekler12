data class Person10(val name: String, val age: Int)

fun main() {
    val person = Person10("Erkan", 22)
    println("person: $person")
    val person2 = person.copy(age = 15)
    println("person2: $person2")
    val person3 = person2.copy(name = "Eymen")
    println("person3: $person3")
}