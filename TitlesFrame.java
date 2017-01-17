
import javax.swing.*;

class TitlesFrame
extends JFrame {
    private TitlesFrame() {
        this.initUI();
    }

    private void initUI() /*дефолт настройки*/ {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(new TitlesPanel());
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        /*перегрузка метода*/
        SwingUtilities.invokeLater(() -> {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
        });
    }

}


