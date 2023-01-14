package br.com.relatorio.xpt.controllers;

import br.com.relatorio.xpt.entitites.Faturamento;
import br.com.relatorio.xpt.utils.MoneyConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportFileReader {

    private static final Logger LOGGER = Logger.getLogger(ReportFileReader.class.getName());

    public static List<Faturamento> lerArquivo(String nomeArquivo) throws ParseException {
        List<Faturamento> faturamentos = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(nomeArquivo))) {

            bufferedReader.readLine();
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] vetor = line.split(";");

                var faturamento = new Faturamento();
                faturamento.setCompany(vetor[0]);
                faturamento.setMes(Short.parseShort(vetor[1]));
                faturamento.setAno(Integer.parseInt(vetor[2]));
                faturamento.setData_parcela_1(vetor[3]);
                faturamento.setParcela1(MoneyConverter.moneyConverter(vetor[4]));
                faturamento.setData_parcela_2(vetor[5]);
                faturamento.setParcela2(MoneyConverter.moneyConverter(vetor[6]));
                faturamento.setData_parcela_3(vetor[7]);
                faturamento.setParcela3(MoneyConverter.moneyConverter(vetor[8]));

                line = bufferedReader.readLine();
                faturamentos.add(faturamento);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Não foi possível realizar a leitura do arquivo");
        }
        return faturamentos;
    }
}
