package controller;

import java.util.HashMap;
import java.util.Map;

import dto.DTO;
import file.ReadFile;
import file.WriteFile;
import view.UserView;

public class UserController {
    //declear
    private DTO input = new DTO();
    private UserView userView = new UserView();
    private ReadFile readFile = new ReadFile();
    private WriteFile writeFile = new WriteFile();
    private Map<String, String> dataUser = new HashMap<>();

    //setInput
    public void setInput(DTO input) {
        this.input = input;
    }

    //setDataUser
    public void setDataUser(){
        this.dataUser = readFile.getDataFromFile();
    }

    //menu
    public void menu() {
        userView.displayMenu();
    }

    //check username is exist in database?
    public boolean isExist(String username) {
        setDataUser();
        
        // loop in dataUser. If map contains username => true (exist)
         

        for (Map.Entry<String, String> entry : dataUser.entrySet()) {
            if(entry.getKey().equalsIgnoreCase(username)){
                return true;
            }
        }
        //else return false (not exist)
        return false;
    }

    //create new account and put it in database
    public void createNewAccount() {
        //get username and password
        String username = input.getUsername();
        String password = input.getPassword();

        //set
        writeFile.setDataInFile(username, password);
    }
}
