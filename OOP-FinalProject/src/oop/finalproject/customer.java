/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.finalproject;

import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Amiga
 */
public class customer {

    public int bill;
    public String Contact_Number;
    public String CNIC_Number;
    public String Name;
    public int ID;
    public String Rented_Car;

    public customer(String Rented_Car,int bill, String Contact_Number, String CNIC_Number, String Name, int ID) {
        this.bill = bill;
        this.Contact_Number=Contact_Number;
        this.CNIC_Number=CNIC_Number;
        this.Name=Name;
        this.ID=ID;
        this.Rented_Car=Rented_Car;
    }

    public int getbill() {
        return bill;
    }

    public void setbill(int bill) {
        bill = bill;
    }
    public String getContact_Number(){
        return Contact_Number;
    }
    public void setContact_Number(String Contact_Number){
        Contact_Number=Contact_Number;
    }
 public String getCNIC_Number(){
        return CNIC_Number;
    }
    public void setCNIC_Number(String CNIC_Number){
        CNIC_Number=CNIC_Number;
    }
     public String getName(){
        return Name;
    }
    public void setName(String Name){
        Name=Name;
    }
     public int getID(){
        return ID;
    }
    public void setID(String ID){
        ID=ID;
    }
    //ARRAYLIST
    public static ArrayList<customer> View(){
           ArrayList<customer> list = new ArrayList<>(0);
        ObjectInputStream inputStream = null;
        return list;
    }
    /// ADD
    public void Add() {
        ArrayList<customer> customer = new ArrayList<>();
//        Array List<customer> customer=customer.view();
        if (customer.isEmpty()) {
            this.ID = 1;
        } else {
            this.ID = customer.get((customer.size() - 1)).ID + 1;
        }
        customer.add(this);
    }
    // Update
    public void update (){
        ArrayList<customer> customer=new ArrayList<>();
         for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).ID == ID) {
                customer.set(i, this);
            }
    }
}
  public void Delete(){
      ArrayList<customer> customer=new ArrayList<>();
        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).ID == ID) {
                customer.remove(i);
            }
        }
  } 
  
  ////Seacrching of the Cutomer 
  public static customer SearchByID(int id){
      ArrayList<customer> customer=new ArrayList<>();
      for(int i =0 ; i<customer.size(); i++){
          if(customer.get(i).ID==id){
              customer.get(i);
          }
      }
      return null;
  }
  public static customer SearchByName(String name){
         ArrayList<customer> customer=new ArrayList<>();
         for(int i=0 ; i<customer.size(); i++){
             if(customer.get(i).Name==name){
                 customer.get(i);
             }
         }
         return null;
}
  
}