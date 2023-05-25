import javax.swing.*;



public class game extends JFrame {
    public game() {
        this.add(new graphics ());
        this.setTitle ( "Tic Tac Toe" );
        this.pack ();
        this.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        this.setResizable ( false);
        this.setVisible ( true );
        this.setLocationRelativeTo ( null );
    }
}
