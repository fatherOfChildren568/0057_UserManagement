package main;

import controller.UserController;
import dto.DTO;
import java.util.Scanner;
import constants.Message;
import utility.Validator;

public class Main {
    public static void main(String[] args) {
        // declear
        DTO dto = new DTO();
        UserController userController = new UserController();
        Scanner sc = new Scanner(System.in);
        // loop until exit
        while (true) {
            try {
                // display menu
                userController.menu();
                System.out.print(Message.MSG_CHOICE);
                int choice = Integer.parseInt(sc.nextLine());
                if (!Validator.checkLimitInteger(choice, 1, 3)) {
                    continue;
                }
                switch (choice) {
                    // create account
                    case 1:
                        //input username
                        System.out.print(Message.MSG_USERNAME);
                        String username = sc.nextLine();
                        //check username
                        if(!Validator.checkString(username, 5)){
                            continue;
                        }
                        //check exist username in database
                        if(userController.isExist(username)){
                            System.out.print(Message.MSG_USER_EXIST);
                        }
                        //input password
                        System.out.print(Message.MSG_PASSWORD);
                        String password = sc.nextLine();
                        //check password
                        if(!Validator.checkString(password, 6)){
                            continue;
                        }
                        //dto receive data
                        dto.setUsername(username);
                        dto.setPassword(password);
                        //controller receive data
                        userController.setInput(dto);
                        //
                        break;
                    // login
                    case 2:

                        break;
                    // exit
                    case 3:
                        sc.close();
                        System.exit(0);
                        break;

                }

            } catch (NumberFormatException e) {
                System.out.println("Input must be integer number");
            }
        }

    }
}
