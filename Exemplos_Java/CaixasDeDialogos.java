import javax.swing.JOptionPane;

public class CaixasDeDialogos{
    public static void main(String[] args){
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "Seu Nome? " + nome);
        if(resposta==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Nome Correto!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome Incorreto!");
        }
    }
}