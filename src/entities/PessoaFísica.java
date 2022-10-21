package entities;

public class PessoaFísica extends TaxPayer {

    private Double saude;


    public PessoaFísica(String nome, Double renda, Double saude) {
        super(nome, renda);
        this.saude = saude;
    }

    public Double getSaude() {
        return saude;
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }


    @Override
    public double tax() {
        double basicTax = (getRenda() < 20000.0) ? getRenda() * 0.15 : getRenda() * 0.25;

        basicTax -= getSaude() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }

        return basicTax;

    }
}
