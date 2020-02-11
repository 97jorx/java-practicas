import javax.swing.*;


public class Principal {
    public static void main(String[] args) {
       /* try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Marco();
            }
        });
    }
}
