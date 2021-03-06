package snake;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
/** 
 *  Die Klasse GUI stellt das Fenster (JFrame) und 
 *  das Spielfeld (JPanel) des Snake-Spiels zur Verf�gung.
 *  
 *  @author A. Scheidegger, M.Frieden
 *  @version 4.0
 */

@SuppressWarnings("serial")
/**
 * @author Adrian Berger
 * @version 1.0.0
 * @since jdk7.8
 */
public class GUI extends JFrame {

  /** Referenz auf das Game-Objekt. */
  private Game game;

  /** Das JPanel, welches als Spielfeld dient. Anonyme innere Klasse. */
  private JPanel spielfeld = new JPanel() {
    /**
     * Wird automatisch aufgerufen, wenn das Fenster neu gezeichnet werden
     * muss. Delegiert das Zeichnen des Spiels an das Game-Objekt.
     * @param g Graphics-Objekt zum Zeichnen
     */
    @Override
    public void paintComponent(Graphics g){
      game.drawElements(g);
    }
  };

  /**
   * Konstruktor. Initialisiert den Frame. Registriert das Game-Objekt
   * als KeyListener.
   */
  public GUI(Game game) {
    this.game= game;
    setSize(600, 400);
    setTitle("Snake V4.0");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setContentPane(spielfeld);
    addKeyListener(game);	
    setVisible(true);
  }

  /**
   * Gibt die Breite des Spielfeldes zur�ck.
   * @return Breite des Spielfeldes.
   */
  public int getBreite() {
    return spielfeld.getWidth();
  }

  /**
   * Gibt die H�he des Spielfeldes zur�ck.
   * @return H�he des Spielfeldes
   */
  public int getHoehe() {
    return spielfeld.getHeight();
  }
}