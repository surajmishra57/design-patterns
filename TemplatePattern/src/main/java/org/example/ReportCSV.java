package org.example;

public class ReportCSV extends ReportGenerator {
    @Override
    public void prepareHeader(ReportData data) {
        System.out.println("CSV Header data");
    }

    @Override
    public void prepareBody(ReportData data) {
        System.out.println("CSV Body data");
    }

    @Override
    public void prepareFooter(ReportData data) {
        System.out.println("CSV Footer data");
    }
}
