package app;

import entities.PessoaFísica;
import entities.PessoaJurídica;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();



        System.out.println("Informe o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.println("Contribuinte #" + i);
            System.out.println("Pessoa física ou jurídica (f/j)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Nome ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Renda anual: ");
            double renda = sc.nextDouble();
            if (ch == 'f') {

                System.out.print("Gastos com saúde: ");
                double saude = sc.nextDouble();
                list.add(new PessoaFísica(nome, renda, saude));
            } else {
                System.out.println("Número de funcionários: ");
                int funcionarios = sc.nextInt();
                list.add(new PessoaJurídica(nome, renda, funcionarios));
            }
        }

        System.out.println();
        System.out.println("VALORES DE CONTRIBUIÇÃO ");
        for (TaxPayer tp : list) {
            System.out.println(tp.getNome() + ": $ " + tp.tax());
        }
    }
}
