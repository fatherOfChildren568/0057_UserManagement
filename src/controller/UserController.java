package controller;

import java.util.HashMap;
import java.util.Map;

import dto.DTO;
import file.ReadFile;
import file.WriteFile;
import view.UserView;

public class UserController {
    // declear
    private DTO input = new DTO();
    private UserView userView = new UserView();
    private ReadFile readFile = new ReadFile();
    private WriteFile writeFile = new WriteFile();
    private Map<String, String> dataUser = new HashMap<>();

    //constructor
    public UserController() {
        this.dataUser = readFile.getDataFromFile();
    }

    // setInput
    public void setInput(DTO input) {
        this.input = input;
    }

    // menu
    public void menu() {
        userView.displayMenu();
    }

    // check username is exist in database?
    public boolean isExist(String username) {
        // loop in dataUser. If map contains username => true (exist)

        for (Map.Entry<String, String> entry : dataUser.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(username)) {
                return true;
            }
        }
        // else return false (not exist)
        return false;
    }

    // create new account and put it in database
    public void createNewAccount() {
        // get username and password
        String username = input.getUsername();
        String password = input.getPassword();

        // set username|password in database
        writeFile.setDataInFile(username, password);
    }

    // login
    public boolean login() {
        String username = input.getUsername();
        String password = input.getPassword();

        System.out.println(username);
        System.out.println(password);

        //loop in dataUser to find
        for (Map.Entry<String, String> entry : dataUser.entrySet()) {
            //if contains => true
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getKey().equals(username) && entry.getValue().equals(password)){
                return true;
            }
        }
        //not found => return fasle
        return false;
    }
}
