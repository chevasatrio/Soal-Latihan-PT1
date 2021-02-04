
package NilaiSiswa;

public class Kelulusan {

    public static void main(String[] args) {
        
//object
Siswa pelajar = new Siswa();

//pengisian Atribut 
pelajar.nama = "Anya";

pelajar.nilai= 70;

//menjalankan method
pelajar.cetaknilai();

//menentukan lulus 
if(pelajar.lulus()){
System.out.println("selamat anda lulus");
}
else if(pelajar.tidaklulus()){
System.out.println("Anda harus belajar lebih giat lagi");
}

    }
    
}
