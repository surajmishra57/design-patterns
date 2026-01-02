package org.example;

/**
 * Template design pattern is behavior design pattern provide a way to
 * put skeleton in parent class and allow child class to override specific part of code
 *
 */
public class Main {
    public static void main(String[] args) {
        ReportGenerator pdf = new ReportPDF();
        pdf.generateReport("c://test/you.pdf", new ReportData());

    }
}