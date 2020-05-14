package av1_antenorjr;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class Av1_AntenorJr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Conta c1 = new Conta() {};
        
    
        
        c1.setNomeTitular("Antenor");
        c1.setAgencia("12345-6");
        c1.setNumero(12345);
        c1.setDataAbertura("26/01/1990");
        c1.setSaldo(50.0);

        c1.deposita(100.0);
        c1.saca(50.0);
        System.out.println("saldo atual conta 1 = " + c1.getSaldo());
	System.out.println(c1.recuperaDadosParaImpressao());
        
        Conta c2 = new Conta() {};
        c2.deposita(100.0);
        c2.saca(50.0);
        System.out.println("saldo atual conta 2 = " + c2.getSaldo());
        c1.transfere(c2, 50.0);
        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println("saldo atual conta 1 = " + c1.getSaldo());
        System.out.println("saldo atual conta 2 = " + c2.getSaldo());

    // fiz duas contas c1 e c2 , coloquei um saldo de 50.0 na c1 e depois depositei 100.0, saquei 50.0 que por sua vez ficou 100.0 na c1
    // depois depositei 100.00 na c2, em seguida saquei 50.00 que ficou com 50.00 
    // depois fiz a transferencian de 50.0 da c1 para c2, que mostrou o saldo atual da c1 = 50.0 e c2 = 100.
    

    Object[] itens = { "Conta Corrente", "Conta Poupança" };
      Object selectedValue = JOptionPane.showInputDialog(null,
          "Escolha uma conta", "CONTA",
              JOptionPane.INFORMATION_MESSAGE, null,
                  itens, itens [0]); //
        System.out.println(Arrays.toString(itens));
        
     Object[] options = { "DEPOSITO", "SAQUE","TRANSFERÊNCIA" };
      JOptionPane.showOptionDialog(null, "Escolha à opção", "Conta",
          JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
              null, options, options[0]);
        System.out.println(Arrays.toString(options));

    }
    
}
