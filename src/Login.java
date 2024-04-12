import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

    public Login() {
        JTextField campoLogin;
        JTextField campoSenha;

        JButton botaoLogin;
        JButton botaoCadastrar;

        //setExtendedState(JFrame.MAXIMIZED_BOTH);// Define o tamanho da janela como tela cheia
        setSize(1280,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);//ajuda a criar os campos e botões


        //definindo compo login
        campoLogin = new JTextField();
        campoLogin.setBounds(1280/3,300,400,30);
        add(campoLogin);
        //definindo compo senha
        campoSenha = new JTextField();
        campoSenha.setBounds(1280/3,350,400,30);
        add(campoSenha);

        botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(1280/3,450,400,30);
        add(botaoLogin);

        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(1280/3,500,400,30);
        add(botaoCadastrar);


        setVisible(true);
    }
}
