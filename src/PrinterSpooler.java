public class PrinterSpooler {

    // Instance tunggal dari PrinterSpooler
    private static PrinterSpooler instance;

    // Private constructor
    private PrinterSpooler() {
        System.out.println("Printer Spooler diinisialisasi.");
    }

    // Method untuk mendapatkan instance tunggal
    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    // Method untuk mencetak dokumen
    public void printDocument(String document) {
        System.out.println("Mencetak: " + document);
    }
}
