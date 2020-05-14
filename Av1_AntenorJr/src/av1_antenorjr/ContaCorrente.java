package av1_antenorjr;

/**
 *
 * @author junior
 */
public class ContaCorrente {
        private double taxaAdministracao;
    private double limite;
// fiz um contrutor 
    public ContaCorrente(double taxaAdministracao, double limite) {
        this.taxaAdministracao = taxaAdministracao;
        this.limite = limite;
    }
// implementei os gets e sets
    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void getValorImposto(){
    }

    public boolean ValorImposto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
