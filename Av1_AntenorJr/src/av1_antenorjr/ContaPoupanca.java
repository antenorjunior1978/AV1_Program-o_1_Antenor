package av1_antenorjr;

/**
 *
 * @author junior
 */
public class ContaPoupanca {
        private double porcentagemRendimento;
    private int diaRendimento;
// fiz um contrutor 
    public ContaPoupanca(double porcentagemRendimento, int diaRendimento) {
        this.porcentagemRendimento = porcentagemRendimento;
        this.diaRendimento = diaRendimento;
    }
// implementei gets e sets 
    public double getPorcentagemRendimento() {
        return porcentagemRendimento;
    }

    public void setPorcentagemRendimento(double porcentagemRendimento) {
        this.porcentagemRendimento = porcentagemRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    void saca(double quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
