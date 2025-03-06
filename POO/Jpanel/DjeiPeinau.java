import javax.swing.JOptionPane;;

public class DjeiPeinau {


    public static void main(String[] args) {

        JOptionPane jop = new JOptionPane();

        String nome = jop.showInputDialog(null, "Insira o cu", "tumasuacu", 1);

        int val = jop.showConfirmDialog(null, "Deseja mudar: " + nome + "?", "programa",
                jop.YES_NO_CANCEL_OPTION);

        if (val == 1) {
            jop.showMessageDialog(null, "deu bom", "sucesso");
        }
    }
}
