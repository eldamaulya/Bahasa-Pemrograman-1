fun main() {

    val elda : Human = Human("Elda Qotul Maulya")
    val andi : Human = Human("Andi")

    elda.email = "elda@gmail.com"
    elda.address = "Tulungagung, Jawa Timur"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    elda.talk()
    andi.talk()

    elda.introduce()

    println(elda.verify("elda@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(elda)
}