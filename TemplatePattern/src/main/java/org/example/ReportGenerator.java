package org.example;

public abstract class ReportGenerator {
    public void generateReport(String path, ReportData data) {
        openFile(path);
        prepareHeader(data);
        prepareBody(data);
        prepareFooter(data);
        closeFile(path);
    }

    private void openFile(String path) {
        System.out.println("opening file " + path);
    }

    protected abstract void prepareHeader(ReportData data);

    protected abstract void prepareBody(ReportData data);

    protected abstract void prepareFooter(ReportData data);

    private void closeFile(String path) {
        System.out.println("closing file " + path);
    }
}
