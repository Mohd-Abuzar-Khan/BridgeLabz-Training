package com.functionalinterface.defaultinterface.dataexportfeature;

public interface IDataExporter {
	
    void export();

    default void exportToCSV(String data) {
        System.out.println("Exporting to CSV: " + data);
    }

    default void exportToPDF(String data) {
        System.out.println("Exporting to PDF: " + data);
    }

    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: " + data);
    }
}
