package org.example;

public class ReportExcel extends ReportGenerator {
    @Override
    public void prepareHeader(ReportData data) {
        System.out.println("Excel Data Header");
    }

    @Override
    public void prepareBody(ReportData data) {
        System.out.println("Excel Data body");
    }

    @Override
    public void prepareFooter(ReportData data) {
        System.out.println("Excel Data Footer");
    }
}
