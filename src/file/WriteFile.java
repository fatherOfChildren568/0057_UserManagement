package file;

import java.io.BufferedWriter;
import java.io.FileWriter;

import constants.Message;

public class WriteFile {
    //set username and password in file
    public void setDataInFile(String username, String password) {
        try {
            //declear
            FileWriter fw = new FileWriter(Message.FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //set
            bw.write("\n");
            bw.write(username);
            bw.write("|");
            bw.write(password);
            //close file
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
