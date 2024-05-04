import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame {
    public Cadastro(){

        setSize(1700,1100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1600, 1000));
        setLocationRelativeTo(null);

        JLabel textoChave = new JLabel("Chave de :");
        JLabel textoNome = new JLabel("Nome:");
        JLabel textoCpf = new JLabel("CPF:");
        JLabel textoTelefone = new JLabel("Telefone:");
        JLabel textoEmail = new JLabel("Email:");
        JLabel textoSenha = new JLabel("Senha:");

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.white);//muda a cor do painel


        JTextField campoChave = new JTextField();
        campoChave.setPreferredSize(new Dimension(200, 25));

        JButton botaoAplicar = new JButton("Aplicar");
        botaoAplicar.setBounds(50, 50, 100, 30); // (x, y, largura, altura)

        JTextField campoNome = new JTextField();
        campoNome.setPreferredSize(new Dimension(610, 25));


        JTextField campoCPF = new JTextField();
        campoCPF.setPreferredSize(new Dimension(300, 25));

        JTextField campoTelefone = new JTextField();
        campoTelefone.setPreferredSize(new Dimension(300, 25));

        JTextField campoEmail = new JTextField();
        campoEmail.setPreferredSize(new Dimension(300, 25));

        JTextField campoSenha = new JTextField();
        campoSenha.setPreferredSize(new Dimension(300, 25));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 5;

        // y = Baixo  x = Direita
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 5, 5, 5);
        panel.add(textoChave, gbc);


        gbc.insets = new Insets(0, 5, 70, 5);
        gbc.gridy ++;
        panel.add(campoChave, gbc);
        gbc.gridx = 1;//direita
        panel.add(botaoAplicar, gbc);

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridwidth = 2;
        gbc.gridx = 0;//direita
        gbc.insets = new Insets(0, 5, 10, 5);
        gbc.gridy ++;
        panel.add(textoNome, gbc);
        gbc.gridy ++;
        panel.add(campoNome, gbc);

        gbc.gridwidth = 1;

        gbc.gridy ++;
        panel.add(textoNome, gbc);
        gbc.gridy ++;
        panel.add(campoCPF, gbc);
        gbc.gridx ++;
        panel.add(campoTelefone, gbc);
//
//        gbc.gridx ++;
//        panel.add(campoEmail, gbc);
//
//        gbc.gridy = 6;
//        panel.add(campoSenha, gbc);

        add(panel, BorderLayout.CENTER);
    }
}