import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuPrincipal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal");
        frame.setSize(400, 456);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/icon_martin.png"));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image icon = toolkit.getImage("images/icon_martin.png");
        frame.setIconImage(icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        JButton libreOfficeButton = new JButton("LibreOffice");
        libreOfficeButton.setBounds(100, 30, 200, 30);
        frame.add(libreOfficeButton);

        JButton virtualBoxButton = new JButton("VirtualBox");
        virtualBoxButton.setBounds(100, 80, 200, 30);
        frame.add(virtualBoxButton);

        JButton dropBoxButton = new JButton("DropBox");
        dropBoxButton.setBounds(100, 130, 200, 30);
        frame.add(dropBoxButton);

        JButton HPEBulletinButton = new JButton("HPE Bulletin");
        HPEBulletinButton.setBounds(100, 180, 200, 30);
        frame.add(HPEBulletinButton);

        JButton visualStudioButton = new JButton("VisualStudio");
        visualStudioButton.setBounds(100, 230, 200, 30);
        frame.add(visualStudioButton);

        JButton netBeansButton = new JButton("NetBeans");
        netBeansButton.setBounds(100, 280, 200, 30);
        frame.add(netBeansButton);

        // Cargar la imagen
        ImageIcon fotoMartin = new ImageIcon("images/foto_martin.png");
        // Crear el botón con la imagen
        JButton fotoButton = new JButton(fotoMartin);
        fotoButton.setBounds(175, 330, 54, 64);
        // Añadir el botón al frame
        frame.add(fotoButton);

        // Acción de los botones
        libreOfficeButton.addActionListener(e -> ejecutarPrograma("C:\\Program Files\\LibreOffice\\program\\soffice.exe"));
        virtualBoxButton.addActionListener(e -> ejecutarPrograma("C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe"));
        dropBoxButton.addActionListener(e -> ejecutarPrograma("explorer"));
        HPEBulletinButton.addActionListener(e -> ejecutarPrograma("C:\\Program Files (x86)\\HPE Product Bulletin\\Product Bulletin.exe"));
        visualStudioButton.addActionListener(e -> ejecutarPrograma("C:\\Users\\LENOVO\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe"));
        netBeansButton.addActionListener(e -> ejecutarPrograma("C:\\Program Files\\NetBeans-21\\netbeans\\bin\\netbeans64.exe --console suppress"));
        
        frame.setVisible(true);
    }

    private static void ejecutarPrograma(String ruta) {
        try {
            Runtime.getRuntime().exec(ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
