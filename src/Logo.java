import javax.swing.*;

public class Logo extends JFrame {
    ImageIcon image = new ImageIcon(getClass().getResource("logo.png"));
    JLabel logo = new JLabel(image);

    public Logo(){
        add(logo);

        setSize(500,400);//Tamanho de abertura
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Quando fechar a janela o programa vai ser encerrado
        setLocationRelativeTo(this);//Centraliza a janela
        setVisible(true);
    }
}
