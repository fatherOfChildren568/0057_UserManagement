package controller;

import dto.DTO;
import view.UserView;

public class UserController {
    //declear
    DTO input = new DTO();
    UserView userView = new UserView();

    //setInput
    public void setInput(DTO input) {
        this.input = input;
    }

    //menu
    public void menu() {
        userView.displayMenu();
    }

    public boolean isExist(String username) {
        
    }

    
}
