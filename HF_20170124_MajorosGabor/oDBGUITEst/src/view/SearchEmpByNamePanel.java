/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.ActionListeners.SearchByNameSearchButtonListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author MAGA
 */
public class SearchEmpByNamePanel extends JPanel {

  private final JLabel jLabel1;
  private final JTextField jTextField1;
  private final JButton jButton1;

  public static JPanel mpPanelForLaterActions;
  public static JFrame jfTheOriginalFrame;

  private SearchEmpByNamePanel() {
    jLabel1 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();

    setPreferredSize(new java.awt.Dimension(600, 50));

    jLabel1.setText("Name Of Employee");

    jTextField1.setText("Start typing name of Employee here");
    jTextField1.setPreferredSize(new Dimension(300, 25));

    jButton1.setText("Search");
    jButton1.addActionListener(
            new SearchByNameSearchButtonListener(mpPanelForLaterActions, jfTheOriginalFrame));

    setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
    add(jLabel1);
    add(jTextField1);
    add(jButton1);

  }

  public static SearchEmpByNamePanel produceASearchEmpByNamePanel(JPanel mp, JFrame jf) {

    System.out.println("just about to constract a searchpanel"
            + "with refernces to :\n"
            + "mainPanel as :" + mp + "\n"
            + "original Frame as: " + jf);

    mpPanelForLaterActions = mp;
    jfTheOriginalFrame = jf;

    return new SearchEmpByNamePanel();
  }
}
