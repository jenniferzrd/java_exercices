package livres;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Livres extends JFrame {
  private JTextField saisieAuteur = new JTextField(15);
  private JTextField saisieTitre = new JTextField(20);
  private JTextArea resume;

  public Livres() {
    super("Afficher les informations sur un livre");

    // Fermer l'application quand on ferme la fen�tre

    // Pour le moment, on utilise un WindowAdapter :
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {

    	  dispose();

      }
    });

    // Positionnement de la fen�tre
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    int hauteurEcran = d.height;
    int largeurEcran = d.width;
    setSize(334, 139);
    setLocation(largeurEcran/4, hauteurEcran/4);

    // Panel pour la recherche des livres
    // (avec un FlowLayout)
    JPanel panelRecherche = new JPanel();
    Box boiteAuteur = Box.createVerticalBox();
    boiteAuteur.add(new JLabel("Auteur"));
    boiteAuteur.add(saisieAuteur);
    panelRecherche.add(boiteAuteur);

    // La m�me chose pour le titre :

    // *********** A REMPLIR


    JButton chercher = new JButton("Chercher");
    chercher.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // on cherche le 1er livre qui correspond
        // au titre et � l'auteur tap�
        // et on affiche titre, auteur et r�sum�

	// *********** A REMPLIR

      }
    });
    panelRecherche.add(chercher);

    // Ajoute une bordure avec un titre autour du panel
    panelRecherche.setBorder(
      BorderFactory.createTitledBorder("Saisie des informations sur le livre"));
    
    getContentPane().add(panelRecherche, BorderLayout.NORTH);

    // Resum� au centre
    Box boiteResume = Box.createVerticalBox();
    resume = new JTextArea(10, 40);
    resume.setEditable(false);
    // Barre de d�filement pour le r�sum�
    JScrollPane sp = new JScrollPane(resume);
    // Ajoute le r�sum� au centre

    // *********** A REMPLIR

    // Bouton pour quitter en bas
    JButton quitter = new JButton("Quitter");
    quitter.addActionListener(new ActionListener() {
    	// Le bouton "quitter" permet de quitter l'application
    	public void actionPerformed(ActionEvent e) {
    		dispose();
    	}
    });
    quitter.setActionCommand("quit");

    

    // On met le bouton dans un JPanel pour qu'il garde sa taille pr�f�r�e
    JPanel panel = new JPanel();
    panel.add(quitter);
    getContentPane().add(panel, BorderLayout.SOUTH); 

    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    Livres fenetre = new Livres();
  }
    
} // GUILivre