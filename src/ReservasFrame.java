import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservasFrame extends JFrame{


    private JPanel reservasPanel;
    private JTextField tfNombre;
    private JTextField tfApellidos;
    private JTextField tfDir;
    private JTextField tfTlf;
    private JTextField tfEmail;
    private JTextField tfDNI;
    private JTextField tfTarjeta;
    private JTextField tfEstandar;
    private JTextField tfBalcon;
    private JCheckBox cbEstandar;
    private JCheckBox cbBalcon;
    private JTextField tfSuite;
    private JCheckBox cbSuite;
    private JComboBox cboxRegimen;
    private JTextField tfPrecio;
    private JButton bCalcular;
    private JButton bCancelar;
    private JButton bLimpiar;
    private JButton bConfirmar;
    private JLabel lbDatos;
    private JLabel lbNombre;
    private JLabel lbApellidos;
    private JLabel lbDir;
    private JLabel lbTlf;
    private JLabel lbEmail;
    private JLabel lbDNI;
    private JLabel lbTarjeta;
    private JLabel lbTipo;
    private JLabel lbPrecio;
    private JLabel lbRegimen;

    public ReservasFrame (){

        setContentPane(reservasPanel);
        setTitle("Reservas");
        setSize(1000,500);
        setLocation(800,300);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);


        bCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);

            }
        });


        bLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tfNombre.setText("");
                tfApellidos.setText("");
                tfDir.setText("");
                tfTlf.setText("");
                tfEmail.setText("");
                tfDNI.setText("");
                tfTarjeta.setText("");
                tfEstandar.setText("");
                tfBalcon.setText("");
                tfSuite.setText("");
                tfPrecio.setText("");
                cbEstandar.setSelected(false);
                cbBalcon.setSelected(false);
                cbSuite.setSelected(false);

            }
        });


        bConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Reserva confirmada",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });


        cbEstandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Has pulsado sobre Estandar",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        cbBalcon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Has pulsado sobre Balcon",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        cbSuite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,
                        "Has pulsado sobre Suite",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        cboxRegimen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (cboxRegimen.getSelectedIndex()) {

                    case 0:
                        JOptionPane.showMessageDialog(null, "Has pulsado sobre Sin desayuno", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 1:
                        JOptionPane.showMessageDialog(null, "Has pulsado sobre Con desayuno", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Has pulsado sobre Media pension", "", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Has pulsado sobre Pension completa", "", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
        });

        bCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int Estandar = 20;
                int Balcon = 25;
                int Suite = 50;
                int sinD = 0;
                int conD = 10;
                int Media = 20;
                int Completa = 25;
                int Total = 0;

                if(cbEstandar.isSelected()){
                    Total += Estandar;
                }

                if(cbBalcon.isSelected()){
                    Total += Balcon;
                }

                if(cbSuite.isSelected()){
                    Total += Suite;
                }

                switch (cboxRegimen.getSelectedIndex()) {

                    case 0:
                        Total += sinD;
                        break;

                    case 1:
                        Total += conD;
                        break;

                    case 2:
                        Total += Media;
                        break;

                    case 3:
                        Total += Completa;
                        break;
                }

                tfPrecio.setText("" + Total);
            }
        });
    }

}
