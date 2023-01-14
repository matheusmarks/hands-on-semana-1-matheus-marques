package br.com.relatorio.xpt.utils;

import br.com.relatorio.xpt.entitites.Faturamento;

public class ConsolePrinter {

    private ConsolePrinter() {}

    public static void printReportOnConsole(Faturamento faturamento) {
        System.out.printf("%s;%s;%s;%s;%s;%s;%s;%s;%s%n",
                faturamento.getCompany(),
                faturamento.getMes(),
                faturamento.getAno(),
                faturamento.getData_parcela_1(),
                faturamento.getParcela1(),
                faturamento.getData_parcela_2(),
                faturamento.getParcela2(),
                faturamento.getData_parcela_3(),
                faturamento.getParcela3());
    }
}
