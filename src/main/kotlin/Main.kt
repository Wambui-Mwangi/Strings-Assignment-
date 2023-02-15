fun main() {
    val name = "Akirachix"
    println(name[0].toString() + name[2] + name[3])
    println(nameAge("Esther", 24))
    println( length("I love Kotlin"))
    name("Ess")
    name("Christine")

}
fun nameAge(name: String, age:Int) :String{
    val full = "Hi my name is $name and I am $age years old"
    return full
}
fun length(word: String) :Int{
    val len = word.length
    return len

}
fun name(nam: String){
    val e = "Ess"
    if ( nam ==(e)) {
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }
}