import frame.binatangViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args) {
        Koneksi.getConnection();
        binatangViewFrame viewFrame = new binatangViewFrame();
        viewFrame.setVisible(true);
    }
}
