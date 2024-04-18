import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    public Login() {
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBackground(Color.white);

        JLabel textoLogin = new JLabel("Login:");
        JLabel textoSenha = new JLabel("Senha:");
        JLabel esqueciSenha = new JLabel("                                               Esqueci minha senha");//gambiarra
        esqueciSenha.setPreferredSize(new Dimension(300, 25));

        JTextField campoLogin = new JTextField();
        campoLogin.setPreferredSize(new Dimension(300, 25));
        JTextField campoSenha = new JTextField();
        campoSenha.setPreferredSize(new Dimension(300, 25));

        JButton botaoLogin = new JButton("Entrar");
        botaoLogin.setPreferredSize(new Dimension(300, 30));
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setPreferredSize(new Dimension(300, 30));


        setMinimumSize(new Dimension(1000, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(0, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        buttonPanel.add(textoLogin, gbc);

        gbc.insets = new Insets(0, 5, 20, 5);
        gbc.gridy = 1;
        buttonPanel.add(campoLogin, gbc);

        gbc.insets = new Insets(0, 5, 5, 5);
        gbc.gridy = 2;
        buttonPanel.add(textoSenha, gbc);

        gbc.gridy = 3;
        buttonPanel.add(campoSenha, gbc);

        gbc.insets = new Insets(0, 5, 20, 5);
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LAST_LINE_END;
        //gbc.insets = new Insets(0, 182, 20, 10);
        buttonPanel.add(esqueciSenha, gbc);

        gbc.gridy = 5;
        gbc.insets = new Insets(0, 5, 15, 5);
        buttonPanel.add(botaoLogin, gbc);

        gbc.gridy = 6;
        buttonPanel.add(botaoCadastrar, gbc);

        add(buttonPanel, BorderLayout.CENTER);
    }
}
