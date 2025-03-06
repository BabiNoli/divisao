import javax.swing.JOptionPane;

public class divisao {

    public static void main(String[] args) {
        var divisao = 0.0;
        var divisor = 0.0;
        var contador = 0;

        do{
            var divisorStr = JOptionPane.showInputDialog(null, "Vamos testar suas habilidades.\nQuantos números você consegue encontar\nque divididos pelo primeiro número sejam zero.\nDigite um número maior que 1 para ser o divisor: ", "Jogo da matemática" ,JOptionPane.QUESTION_MESSAGE);
            divisor = Double.parseDouble(divisorStr);
        }while(divisor <= 1);
        

        do{
            var numeradorStr = JOptionPane.showInputDialog(null, "Digite outro número para dividir: ");
            var numerador = Double.parseDouble(numeradorStr);

            divisao = numerador % divisor;

            if(numerador >= divisor){
                
                if(divisao != 0){
                    JOptionPane.showMessageDialog(null,"O resto dessa divisao nao é igual a zero.", "Ops!", 0);
                } else {
                    contador ++;
                    JOptionPane.showMessageDialog(null, numerador +  " dividido por " + divisor + " é igua a " + numerador/divisor + " e resta " + divisao, "Divisao",1);
                }
            
            }
            
        }while(divisao == 0);

        JOptionPane.showMessageDialog(null, "Você acertou " + contador + " números! ", "Resultado",1);
               
        
    }
}