package inheritance

class Siswa : OrangTua() {
    var nim: String = ""
    var pelajaran: String = ""

    fun belajar() {
        println("Saya belajar pelajran $pelajaran")
    }
}