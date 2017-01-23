/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.ActionListeners;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.SearchEmpByNamePanel;

/**
 *
 * @author MAGA
 */
public class SearchEmpByNameMenuListener implements ActionListener {

  JFrame myJF = new JFrame();
  JPanel mainPanel = new JPanel();
  SearchEmpByNamePanel sebn;

  public void deliverRefToMainPanel(JPanel mp, JFrame jf) {

    myJF = jf;
    mainPanel = mp;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    sebn = SearchEmpByNamePanel.produceASearchEmpByNamePanel(mainPanel, myJF);

    mainPanel.add(sebn, BorderLayout.NORTH);

    myJF.pack();

  }

  public JPanel getRefResedPanel() {
    return mainPanel;
  }

}
