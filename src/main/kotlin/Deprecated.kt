class MyClass{
    @Deprecated("Bu fonksiyon artık kullanılmıyor. Yerine yeniFonksiyon kullanın.", ReplaceWith("yeniFonksiyon()"))
    fun eskiFonksiyon(){
        println("Eski Fonksiyon çalıştı")
    }
    fun yeniFonksiyon(){
        println("Yeni fonksiyon çalıştı")
    }
}

fun main() {
    val myClass = MyClass()
    myClass.eskiFonksiyon()
    myClass.yeniFonksiyon()
}