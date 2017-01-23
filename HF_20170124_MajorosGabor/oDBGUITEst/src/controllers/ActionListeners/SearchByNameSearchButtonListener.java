/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.ActionListeners;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.EmpListByNamePanel;

/**
 *
 * @author MAGA
 */
public class SearchByNameSearchButtonListener implements ActionListener {

  JPanel jlEmp = new EmpListByNamePanel();
  JPanel jpMain;
  JFrame jfOriginal;

  @Override
  public void actionPerformed(ActionEvent e) {

//    System.out.println("The click on search...");
//    System.out.println("...." + jpMain.toString() + jpMain.getName() + jfOriginal.getTitle());
//    jpMain.add(new JLabel("...................."), BorderLayout.CENTER);
    jpMain.add(jlEmp, BorderLayout.CENTER);
    jfOriginal.pack();

  }

  public SearchByNameSearchButtonListener(JPanel jp, JFrame jf) {

    jpMain = jp;
    jfOriginal = jf;
  }

}
