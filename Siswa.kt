package polymorphism

class Siswa : OrangTua() {
    var nim: String = ""
    var pelajaran: String = ""

    fun belajar() {
        println("Saya belajar di pelajaran $pelajaran")
    }

    override fun perkenalan() {
        println("Kenalin, aku bernama $nama, berasal dari $alamat")
    }
}