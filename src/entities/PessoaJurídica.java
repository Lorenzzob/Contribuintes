package entities;

public class PessoaJurídica extends TaxPayer {

    private Integer funcionarios;


    public PessoaJurídica(String nome, Double renda, Integer funcionarios) {
        super(nome, renda);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double tax() {
        double basicTax = (getFuncionarios() > 10) ? getRenda() * 0.14 : getRenda() * 0.16;
        return basicTax;
    }
}
