package planeacionfinanciera;

import GUI.JFMenu;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class PlaneacionFinanciera {
    public static void main(String[] args) {
        try {
            FlatMacLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        JFMenu menu = new JFMenu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
