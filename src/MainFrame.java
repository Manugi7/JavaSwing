import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField tfUser;
    private JPasswordField pfContraseña;
    private JButton bLimpiar;
    private JButton bEntrar;
    private JLabel lbWelcome;
    private JPanel mainPanel;


    public MainFrame (){

        setContentPane(mainPanel);
        setTitle("Hotel Montealegre **");
        setSize(800,500);
        setLocation(600,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        bEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Usuario = tfUser.getText();
                char[] Contraseña = pfContraseña.getPassword();
                StringBuilder c1 = new StringBuilder();

                for(int i = 0; i< Contraseña.length; i++){

                    char cadena = Contraseña[i];
                    c1.append(cadena);

                }

                if(Usuario.equals("usuario1") && c1.toString().equals("usuario1")){

                    lbWelcome.setText("¡¡Bienvenido de nuevo " + Usuario + "!!");
                    ReservasFrame reservas = new ReservasFrame();

                } else {

                    JOptionPane.showMessageDialog(null, "Error en usuario y/o contraseña", "", JOptionPane.ERROR_MESSAGE);

                }
            }
        });


        bLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tfUser.setText("");
                pfContraseña.setText("");
                lbWelcome.setText("");

            }
        });
    }

    public static void main(String[] args) {

        MainFrame myFrame = new MainFrame();

    }
}
