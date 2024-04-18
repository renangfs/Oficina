import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    public Login() {

        JPanel buttonPanel;

        JLabel textoLogin;
        JLabel textoSenha;

        JTextField campoLogin;
        JTextField campoSenha;

        JButton botaoLogin;
        JButton botaoCadastrar;

        setSize(720,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cria um painel para conter os botões
        buttonPanel = new JPanel(new GridBagLayout());

        textoLogin = new JLabel("Login:");
        textoLogin.setBounds(30,190,90,50);

        textoSenha = new JLabel("Senha:");
        textoSenha.setBounds(30,190,90,50);


        //definindo compo login
        campoLogin = new JTextField();
        campoLogin.setPreferredSize(new Dimension(300, 25));

        //definindo compo senha
        campoSenha = new JTextField();
        campoSenha.setPreferredSize(new Dimension(300, 25));

        botaoLogin = new JButton("Entrar");
        botaoLogin.setPreferredSize(new Dimension(300, 30));

        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setPreferredSize(new Dimension(300, 30));

        // Adiciona o botão "Entrar" ao painel usando GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();

        // Define a posição do botão "Cadastrar" abaixo do botão "Entrar"
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 10, 0);  // Espaçamento de 300 pixels acima do botão
        buttonPanel.add(botaoCadastrar, gbc);

        // Define a posição do botão "Login" abaixo do botão "Entrar"
        gbc.gridy = 4;
        buttonPanel.add(botaoLogin, gbc);


        // Define a posição do campo "Senha" abaixo do botão "Entrar"
        gbc.gridy = 3;
        buttonPanel.add(campoSenha, gbc);

        // Define a posição do texto "Senha" abaixo do botão "Entrar"
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridy = 2;
        buttonPanel.add(textoSenha, gbc);

        // Define a posição do campo "Login" abaixo do botão "Entrar"
        gbc.gridy = 1;
        buttonPanel.add(campoLogin, gbc);

        // Define a posição do texto "Login" abaixo do botão "Entrar"
        gbc.gridy = 0;
        buttonPanel.add(textoLogin, gbc);

        // Adiciona o painel dos botões ao centro da janela
        add(buttonPanel, BorderLayout.CENTER);
    }
}
