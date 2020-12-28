package inheritance

class Guru : Karyawan() {
    var pelajaran: String = ""

    fun mengajar() {
        println("Saya mengajar pelajaran $pelajaran")
    }
}