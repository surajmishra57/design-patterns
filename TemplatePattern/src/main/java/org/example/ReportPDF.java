package org.example;

public class ReportPDF extends ReportGenerator {
    @Override
    public void prepareHeader(ReportData data) {
        System.out.println("PDF header data");
    }

    @Override
    public void prepareBody(ReportData data) {
        System.out.println("PDF body data ");
    }

    @Override
    public void prepareFooter(ReportData data) {
        System.out.println("PDF footer data");
    }
}
