import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame {
    public Cadastro(){

        setSize(1700,1100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1600, 1000));
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.white);//muda a cor do painel

        JTextField campoChave = new JTextField();
        campoChave.setPreferredSize(new Dimension(300, 25));

        JButton botaoAplicar = new JButton("Aplicar");
        botaoAplicar.setBounds(50, 50, 100, 30); // (x, y, largura, altura)
        panel.add(botaoAplicar);

        JTextField campoNome = new JTextField();
        campoNome.setPreferredSize(new Dimension(300, 25));

        JTextField campoCPF = new JTextField();
        campoCPF.setPreferredSize(new Dimension(300, 25));

        JTextField campoTelefone = new JTextField();
        campoTelefone.setPreferredSize(new Dimension(300, 25));


        add(panel, BorderLayout.CENTER);
    }
}