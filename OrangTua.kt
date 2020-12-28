package polymorphism

open class OrangTua {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    open fun perkenalan() {
        println("Halo, nama saya $nama, alamat saya berada di $alamat")
    }
}