package br.com.relatorio.xpt;

import br.com.relatorio.xpt.controllers.ReportFileReader;
import br.com.relatorio.xpt.entitites.Faturamento;
import br.com.relatorio.xpt.entitites.Notas;
import br.com.relatorio.xpt.utils.ConsolePrinter;

import java.io.File;

import java.text.ParseException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws ParseException {

       List<Faturamento> faturamentos = ReportFileReader
               .lerArquivoFaturamento(new File("resources/faturamento.txt").getAbsolutePath());

       List<Notas> notas = ReportFileReader.
               lerArquivoNotas(new File("resources/nota.txt").getAbsolutePath());

        LOGGER.log(Level.INFO, "Lendo arquivo de faturamentos");
        faturamentos.forEach(ConsolePrinter::printReportFaturamentoOnConsole);

        LOGGER.log(Level.INFO, "Lendo arquivo de notas");
        notas.forEach(ConsolePrinter::printReportNotasOnConsole);
    }

}