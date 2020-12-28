package polymorphism

class Guru : Karyawan() {
    var pelajaran: String = ""

    fun mengajar() {
        println("Saya mengajar pelajaran $pelajaran")
    }

    override fun perkenalan() {
        println("Perkenalkan, nama saya $nama, alamat saya berada di $alamat")
    }
}