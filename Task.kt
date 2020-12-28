package polymorphism

fun main() {

    val budi = Guru()
    budi.nama = "Budi Santosa"
    budi.alamat = "Tulungagung"
    budi.perkenalan()
    budi.gaji = 1000000
    budi.bekerja()
    budi.pelajaran = "Matematika"
    budi.mengajar()

    val elda = Siswa()
    elda.nama = "Elda Qotul Maulya"
    elda.alamat = "Boyolagu"
    elda.perkenalan()
    elda.pelajaran = "Matematika"
    elda.belajar()

    val hartono = Satpam()
    hartono.nama = "Hartono Susilo"
    hartono.alamat = "Beji"
    hartono.perkenalan()
    hartono.gaji = 200000
    hartono.bekerja()
    hartono.pos = "Timur"
    hartono.menjaga()

}