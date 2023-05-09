import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_interfaz extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton btnIniciar;
    private JTextArea resultado;
    private buscador buscar;
public ejercicio_interfaz(String titulo) {
    super(titulo);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(panel1);
    this.pack();
    buscar=new buscador();
    btnIniciar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        resultado.setText(buscar.TiempoBusqueda());
        }
    });
}
}
