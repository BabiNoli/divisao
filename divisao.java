import javax.swing.JOptionPane;

public class divisao {

    public static void main(String[] args) {
        var divisorStr = JOptionPane.showInputDialog(null, "Digite um número: ");
        var divisor = Double.parseDouble(divisorStr);
        var divisao = 0.0;

        do{
            var numeradorStr = JOptionPane.showInputDialog(null, "Digite outro número para dividir: ");
            var numerador = Double.parseDouble(numeradorStr);

            divisao = numerador % divisor;

            if(numerador >= divisor){
                
                if(divisao != 0){
                    JOptionPane.showMessageDialog(null,"O resto dessa divisao nao é igual a zero.\nEncerrando o programa...", "Resultado", 0);
                } else {
                    JOptionPane.showMessageDialog(null, numerador +  " dividido por " + divisor + " é igua a " + numerador/divisor + " e resta " + divisao, "Divisao",1);
                }
            
            }
            
        }while(divisao == 0);
        
    }
}