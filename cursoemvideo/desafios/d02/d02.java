package desafios.d02;

import java.awt.*;

public class d02 {
    static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        System.out.println("A resolução da sua tela é " + width + "x" + height);
    }
}
