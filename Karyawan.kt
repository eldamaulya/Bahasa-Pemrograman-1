package inheritance

open class Karyawan : OrangTua() {
    var nip: String = ""
    var gaji: Int = 0

    fun bekerja() {
        println("Saya bekerja dengan gaji sebesar $gaji")
    }
}