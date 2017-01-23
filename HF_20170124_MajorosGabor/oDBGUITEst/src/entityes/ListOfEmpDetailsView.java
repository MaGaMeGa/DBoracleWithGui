/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityes;

import java.util.ArrayList;

/**
 *
 * @author MAGA
 */
public class ListOfEmpDetailsView {

  private static ArrayList<EmpDetailsView> listOfEDV = new ArrayList();

  public ListOfEmpDetailsView() {
  }

  public static ArrayList<EmpDetailsView> getListOfEDV() {
    return listOfEDV;
  }

  public static void setListOfEDV(ArrayList<EmpDetailsView> listOfEDV) {
    ListOfEmpDetailsView.listOfEDV = listOfEDV;
  }

}
