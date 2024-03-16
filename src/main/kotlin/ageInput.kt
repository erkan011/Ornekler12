fun main() {
    println("Lütfen yaşınızı giriniz")
    val ageStr = readlnOrNull()
    val age = ageStr?.toIntOrNull()

    if (age != null){
        println("Girdiğiniz Yaş: $age")
    }else{
        println("Geçersiz yaş bilgisi girdiniz.")
    }
}