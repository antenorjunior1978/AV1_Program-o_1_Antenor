package av1_antenorjr;

/**
 *
 * @author junior
 */
public class Conta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
    
	void saca(double quantidade){
	double	novoSaldo = this.saldo - quantidade;
	this.saldo = novoSaldo;
	}
        
	void deposita(double quantidade) {
	this.saldo += quantidade;
        }

       
    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    void transfere(Conta destino, double valor) {
    this.saldo = this.saldo - valor;
    destino.saldo = destino.saldo + valor;   
    
}
    String recuperaDadosParaImpressao() {
    String dados = "Titular: "	+ this.nomeTitular;
    dados += "\nNúmero:	" + this.numero;
            return dados;

}
}
    

