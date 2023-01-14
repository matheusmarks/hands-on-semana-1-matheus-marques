package br.com.relatorio.xpt;

import br.com.relatorio.xpt.controllers.ReportFileReader;
import br.com.relatorio.xpt.entitites.Faturamento;
import br.com.relatorio.xpt.entitites.Notas;
import br.com.relatorio.xpt.utils.ConsolePrinter;

import java.io.File;

import java.text.ParseException;

import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws ParseException {

       List<Faturamento> faturamentos =
               ReportFileReader.lerArquivo(new File("resources/faturamento.txt").getAbsolutePath());

        faturamentos.forEach(faturamento -> ConsolePrinter.printReportOnConsole(faturamento));
    }

}