import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Login login = new Login();
            login.setVisible(true);
//            Logo logo = new Logo();
//            logo.setVisible(true);
        });
    }
}