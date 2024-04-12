import javax.swing.*;

public class Login extends JFrame{

    public Login() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);// Define o tamanho da janela como tela cheia
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o comportamento padrão de fechament
        setLocationRelativeTo(null);
        setSize(1280,720);
        setResizable(true);

        setVisible(true);// Torna a janela visível
    }
}
