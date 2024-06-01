/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group4.petcenter.Controllers;



import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

   
public class RegisterController {

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnReset;

    @FXML
    private PasswordField tfPass;

    @FXML
    private PasswordField tfPass1;

    @FXML
    private TextField tfUser;

    @FXML
    private TextField tfUser1;

    @FXML
    private ToggleGroup tgGender;

    @FXML
    private ToggleGroup tgRole;

    @FXML
    void onRegister(ActionEvent event) {

    }

    @FXML
    void onReset(ActionEvent event) {

    }
    
    public void initialize(URL url, ResourceBundle rb) {
        //test connection
       ConnectDB connect = new ConnectDB();
        connect.getConnect();
        
    }   
     public void executeQuery(String query){
        ConnectDB connect = new ConnectDB();
        Connection con = connect.getConnect();
        
        Statement st;
        try {
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
     public void Addcustomer(){
         // get gia tri tu form
        String name = .getText();
        float price = Float.parseFloat(tfPrice.getText());
        String query = "INSERT INTO Product(name, price) VALUES ('" + name + "'," + price +")";
        executeQuery(query);
        showProducts();
     }
}
