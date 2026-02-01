package com.functionalinterface.defaultinterface.dataexportfeature;

public class DataExport {
	public static void main(String[] args) {

        IDataExporter exporter = () -> System.out.println("Export initiated");

        exporter.export();

        exporter.exportToCSV("Name, Age, City");
        exporter.exportToPDF("Name, Age, City");

        exporter.exportToJSON("{\"Name\":\"John\", \"Age\":30}");
	}
}
