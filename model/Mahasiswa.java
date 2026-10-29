package model;

public class Mahasiswa implements Printable, Comparable<Mahasiswa> {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String getPrintDetail() {
        return "NIM: " + nim + ", Nama: " + nama;
    }

    @Override
    public int compareTo(Mahasiswa mahasiswaLain) {
        return this.nama.compareTo(mahasiswaLain.nama);
    }
}
