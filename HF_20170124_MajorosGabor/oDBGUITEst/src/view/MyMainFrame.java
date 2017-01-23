/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.ActionListeners.SearchEmpByNameMenuListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MAGA
 */
public class MyMainFrame extends JFrame {

  Menu menuEmp = new Menu("Employes");
  Menu menuDep = new Menu("Departments");
  Menu menuLoc = new Menu("Locations");
  Menu menuJobs = new Menu("Jobs");

  MenuItem viewEmp = new MenuItem("View Employes");
  Menu searchEmp = new Menu("Search Employes");

  MenuItem searchEmpByName = new MenuItem("Serach By Name");
  MenuItem searchEmpBySalary = new MenuItem("Serach By Salary");

  JPanel mainPanel = new JPanel();

  public MyMainFrame() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("My DB test window for Oracle's employees DB");
    setSize(new Dimension(600, 400));
    setPreferredSize(new Dimension(600, 400));

    MenuBar mb = new MenuBar();

    mb.add(menuEmp);

    mb.add(menuDep);
    mb.add(menuLoc);
    mb.add(menuJobs);

    setMenuBar(mb);

    mainPanel.setLayout(new BorderLayout());
    add(mainPanel);

    setVisible(true);

    addMenuToMenuEmp();

    addListenersToMenuItems();
    setVisible(true);

  }

  private void addMenuToMenuEmp() {

    menuEmp.add(viewEmp);

    searchEmp.add(searchEmpByName);
    searchEmp.add(searchEmpBySalary);

    menuEmp.add(searchEmp);
  }

  private void addListenersToMenuItems() {

    SearchEmpByNameMenuListener sebnml = new SearchEmpByNameMenuListener();
    sebnml.deliverRefToMainPanel(mainPanel, this);
    searchEmpByName.addActionListener(sebnml);

//    mainPanel = sebnml.getRefResedPanel();
//    mainPanel.repaint();
//    mainPanel.setBackground(Color.pink);
  }

}
