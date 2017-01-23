/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entityes.EmpDetailsView;
import entityes.EntityManagerTest;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author MAGA
 */
public class EmpListByNamePanel extends JPanel {

  entityes.EntityManagerTest et = new EntityManagerTest();
  public static ArrayList<EmpDetailsView> employees;
  DefaultListModel<EmpDetailsView> dEDV = new DefaultListModel<EmpDetailsView>();

  JList empList;

  public EmpListByNamePanel() {

    JScrollPane jsp;
    empList = new JList(et.runMyTest());
    //setSize(200, 200);

    JLabel jLabel1 = new javax.swing.JLabel();
    jLabel1.setText("mmmiizuu");
    setBackground(Color.WHITE);

    jsp = new JScrollPane(empList);
    jsp.setPreferredSize(new Dimension(200, 300));
    add(jsp);

  }

}
