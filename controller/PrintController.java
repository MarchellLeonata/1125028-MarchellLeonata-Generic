
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Mahasiswa;
import util.PrintUtil;
import view.PrintView;

public class PrintController {

    private PrintView view = new PrintView();

    public void runProgram() {

        List<String> daftarBuah = new ArrayList<>();
        daftarBuah.add("Mangga");
        daftarBuah.add("Apel");
        daftarBuah.add("Jeruk");

        Integer[] angka = {30, 10, 20};

        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa("103", "Kevmet"));
        daftarMahasiswa.add(new Mahasiswa("101", "AndiCobra"));
        daftarMahasiswa.add(new Mahasiswa("102", "Budi"));

        Mahasiswa[] arrayMahasiswa = {
            new Mahasiswa("103", "Kevmet"),
            new Mahasiswa("101", "AndiCobra"),
            new Mahasiswa("102", "Budi")
        };

        view.printTitle("Print List");
        PrintUtil.printList(daftarBuah);

        view.printTitle("Print Array");
        PrintUtil.printList(angka);

        view.printTitle("Print Printable List");
        PrintUtil.printPrintableList(daftarMahasiswa);

        view.printTitle("Print Sorted List");
        PrintUtil.printListSorted(daftarMahasiswa);

        view.printTitle("List Asli Setelah Sorting");
        PrintUtil.printPrintableList(daftarMahasiswa);

        view.printTitle("Print Sorted Array");
        PrintUtil.printListSorted(arrayMahasiswa);

        view.printTitle("Array Asli Setelah Sorting");
        PrintUtil.printPrintableList(Arrays.asList(arrayMahasiswa));
    }
}
