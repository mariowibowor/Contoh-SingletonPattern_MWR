public class Main {
    public static void main(String[] args) {
        // Mendapatkan instance tunggal dari Printer Spooler
        PrinterSpooler spooler1 = PrinterSpooler.getInstance();
        spooler1.printDocument("Laporan Tahunan.pdf");

        // Mendapatkan instance yang sama untuk cetakan berikutnya
        PrinterSpooler spooler2 = PrinterSpooler.getInstance();
        spooler2.printDocument("Faktur.pdf");

        // Memastikan bahwa kedua instance adalah sama
        if (spooler1 == spooler2) {
            System.out.println("Printer spooler yang sama digunakan.");
        } else {
            System.out.println("Printer spooler yang berbeda.");
        }
    }
}
