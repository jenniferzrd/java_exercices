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
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class JLivre3 extends JFrame{

	  public JTextField saisieAuteur = new JTextField(25);
	  public JTextField saisieTitre = new JTextField(20);
	  public JTextArea resume;
	  
	  public JLivre3() {
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
    
    JButton btnAjouter = new JButton("Ajouter");
    btnAjouter.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    
    		
    		
//    			Hashtable a = new Hashtable();
//
//                String titre = saisieTitre.getText();
//                String auteur = saisieAuteur.getText();
//                
//                if( auteur != "" && titre != "") {
//                a.put(auteur, titre);
//                }
//            
//    		Enumeration nosLivres = a.keys();
//    		String key;
//            while(nosLivres.hasMoreElements()) {
//                key = (String) nosLivres.nextElement();
//            }
//    if(auteur.equals(key) || titre.equals(nosLivres.get(key))) {
//    	resume.setText("Key:" + key + "Value:" + nosLivres.get(key));
//    }
    	}  	
    });
    panelRecherche.add(btnAjouter);

    // Resum� au centre
    Box boiteResume = Box.createVerticalBox();
    resume = new JTextArea(10, 40);
    resume.setEditable(true);
    // Barre de d�filement pour le r�sum�
    JScrollPane sp = new JScrollPane(resume);
    // Ajoute le r�sum� au centre
    getContentPane().add(sp, BorderLayout.CENTER);
    Box boiteTitre = Box.createVerticalBox();
    sp.setColumnHeaderView(boiteTitre);
    boiteTitre.add(new JLabel("Titre"));
    boiteTitre.add(saisieTitre);
    
    JLabel lblNewLabel = new JLabel("Resume");
    boiteTitre.add(lblNewLabel);
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
    FlowLayout flowLayout = (FlowLayout) panel.getLayout();
    flowLayout.setVgap(0);
    flowLayout.setHgap(0);
    panel.add(quitter);
    getContentPane().add(panel, BorderLayout.SOUTH); 

    this.pack();
    this.setVisible(true);
  }
	    
  public static void main(String[] args) {
    
	  JLivre3 fenetre = new JLivre3();
    
      
  }
  }  
	
