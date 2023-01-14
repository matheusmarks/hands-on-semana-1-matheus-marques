package br.com.relatorio.xpt.utils;

import br.com.relatorio.xpt.entitites.Faturamento;
import br.com.relatorio.xpt.entitites.Notas;

public class ConsolePrinter {

    private ConsolePrinter() {}

    public static void printReportFaturamentoOnConsole(Faturamento faturamento) {
        System.out.printf("%s;%s;%s;%s;%s;%s;%s;%s;%s",
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

    public static void printReportNotasOnConsole(Notas nota) {
        System.out.printf("%s;%s;%s;%s;%s;%s",
                nota.getCompany(),
                nota.getMes(),
                nota.getAno(),
                nota.getValor(),
                nota.getData_emissao(),
                nota.getNota());
    }
}
