
import com.entidade.Calculadora;
import com.fasterxml.jackson.core.JsonProcessingException;
import javax.swing.JOptionPane;

/**
 *
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) throws JsonProcessingException {

        //Instância a calculadora
        Calculadora calculadora = new Calculadora();

        String opcao = "";
        double valorA = 0;
        double valorB = 0;

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Soma \n3 - Subtração \n4 - Produto \n5 - Divisão \n9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    valorA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A"));
                    valorB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B"));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getAdicao(valorA, valorB));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Subtração: " + calculadora.getSubtracao(valorA, valorB));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto(valorA, valorB));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Divisão: " + calculadora.getDivisao(valorA, valorB));
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}
