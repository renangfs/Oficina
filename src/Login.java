import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login extends JFrame{
    JButton botaoLogin;
    JButton botaoCadastrar;

    ImageIcon image = new ImageIcon(getClass().getResource("logo.png"));
    JLabel logo = new JLabel(image);

    public Login() {

        JPanel painelLogo = new JPanel(new GridBagLayout());
        painelLogo.setBackground(Color.white);
        JPanel painelLogin = new JPanel(new GridBagLayout());
        painelLogin.setBackground(Color.white);

        JLabel textoLogin = new JLabel("Login:");
        JLabel textoSenha = new JLabel("Senha:");
        JLabel esqueciSenha = new JLabel("Esqueci minha senha");

        JTextField campoLogin = new JTextField();
        campoLogin.setPreferredSize(new Dimension(300, 25));
        JTextField campoSenha = new JTextField();
        campoSenha.setPreferredSize(new Dimension(300, 25));

        botaoLogin = new JButton("Entrar");
        botaoLogin.setPreferredSize(new Dimension(300, 30));

        botaoCadastrar = new JButton("Cadastre-se  ");
        botaoCadastrar.setPreferredSize(new Dimension(300, 30));

        setSize(1200,800);
        setMinimumSize(new Dimension(1200,800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;
        gbc.gridx = 0;

        // Adicionando o logotipo ao centro superior do painel principal
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 0, 0);
        painelLogo.add(logo, gbc);

        // Configurações para o painel de login
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        painelLogo.add(painelLogin, gbc);

        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 5, 5, 5);
        painelLogin.add(textoLogin, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(65, 5, 20, 5);
        painelLogin.add(campoLogin, gbc);

        gbc.gridy = 2;
        gbc.insets = new Insets(0, 5, 5, 5);
        painelLogin.add(textoSenha, gbc);

        gbc.gridy = 3;
        painelLogin.add(campoSenha, gbc);

        gbc.gridy = 4;
        gbc.insets = new Insets(0, 5, 20, 5);
        gbc.anchor = GridBagConstraints.LAST_LINE_END;
        gbc.fill = GridBagConstraints.VERTICAL;
        painelLogin.add(esqueciSenha, gbc);

        gbc.insets = new Insets(0, 5, 15, 5);
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        painelLogin.add(botaoLogin, gbc);

        gbc.gridy = 6;
        painelLogin.add(botaoCadastrar, gbc);

        add(painelLogo);
        botaoCadastrar.addActionListener(this::Cadastrar);
        botaoLogin.addActionListener(this::Logar);
    }

    public void Cadastrar(ActionEvent e) {
        System.out.println("Clicando cadastrar");
        // Fecha a janela de login
        dispose();
        // Abre a janela de cadastro
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }

    public void Logar(ActionEvent e) {
        System.out.println("Clicando logar");
    }
}
