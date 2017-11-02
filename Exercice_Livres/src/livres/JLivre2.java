package livres;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Window.Type;

public class JLivre2 extends JFrame{

	  public JTextField saisieAuteur = new JTextField(15);
	  public JTextField saisieTitre = new JTextField(20);
	  public JTextArea resume;
	  
	  public JLivre2() {
	super("Afficher les informations sur un livre");

    // Fermer l'application quand on ferme la fenêtre

    // Pour le moment, on utilise un WindowAdapter :
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {

    	  dispose();

      }
    });

    // Positionnement de la fenêtre
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    int hauteurEcran = d.height;
    int largeurEcran = d.width;
    setSize(370, 305);
    setLocation(largeurEcran/4, hauteurEcran/4);

    // Panel pour la recherche des livres
    // (avec un FlowLayout)
    JPanel panelRecherche = new JPanel();
    FlowLayout flowLayout_1 = (FlowLayout) panelRecherche.getLayout();
    flowLayout_1.setHgap(30);
    Box boiteAuteur = Box.createVerticalBox();
    boiteAuteur.add(new JLabel("Auteur"));
    boiteAuteur.add(saisieAuteur);
    panelRecherche.add(boiteAuteur);

    // La même chose pour le titre :

    // *********** A REMPLIR
    Box boiteTitre = Box.createVerticalBox();
    boiteTitre.add(new JLabel("Titre"));
    boiteTitre.add(saisieTitre);
    panelRecherche.add(boiteTitre);

    JButton chercher = new JButton("Chercher");
    chercher.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // on cherche le 1er livre qui correspond
        // au titre et à l'auteur tapé
        // et on affiche titre, auteur et résumé

	// *********** A REMPLIR

      }
    });
    panelRecherche.add(chercher);

    // Ajoute une bordure avec un titre autour du panel
    panelRecherche.setBorder(
      BorderFactory.createTitledBorder("Saisie des informations sur le livre"));
    
    getContentPane().add(panelRecherche, BorderLayout.NORTH);

    
    // Resumé au centre
    Box boiteResume = Box.createVerticalBox();
    resume = new JTextArea(10, 40);
    resume.setEditable(true);
    // Barre de défilement pour le résumé
    JScrollPane sp = new JScrollPane(resume);
    // Ajoute le résumé au centre
    getContentPane().add(sp, BorderLayout.CENTER);
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

    

    // On met le bouton dans un JPanel pour qu'il garde sa taille préférée
    JPanel panel = new JPanel();
    FlowLayout flowLayout = (FlowLayout) panel.getLayout();
    flowLayout.setVgap(0);
    flowLayout.setHgap(0);
    panel.add(quitter);
    getContentPane().add(panel, BorderLayout.SOUTH); 

    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    Livres fenetre = new Livres();
  }
  }  
	
