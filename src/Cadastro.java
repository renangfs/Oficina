import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame {
    public Cadastro(){

        setSize(1700,1100);;//testar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1600, 1000));
        setLocationRelativeTo(null);

        JPanel painelChave = new JPanel(new GridBagLayout());
        painelChave.setBackground(Color.white);//muda a cor do painel

        JTextField campoChave = new JTextField();
        campoChave.setPreferredSize(new Dimension(300, 25));

        JButton botaoAplicar = new JButton("Aplicar");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 5;
        gbc.insets = new Insets(0, 5, 15, 5);
        painelChave.add(campoChave, gbc);

        gbc.gridy = 5;
        painelChave.add(botaoAplicar, gbc);

        add(painelChave, BorderLayout.NORTH);

    }

}