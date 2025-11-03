interface Exporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Data exported to JSON format.");
    }
}

class ReportExporter implements Exporter {
    public void exportToCSV() { System.out.println("Exported to CSV."); }
    public void exportToPDF() { System.out.println("Exported to PDF."); }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter r = new ReportExporter();
        r.exportToJSON();
    }
}
