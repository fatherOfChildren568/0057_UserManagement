package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import constants.Message;

public class ReadFile {
    //read data from file user.dat
    public static Map<String, Integer> readFile(){
        Map<String, Integer> map = new HashMap<>();
        try {
            //declear
            FileReader fr = new FileReader(Message.FILE_NAME);
            BufferedReader sb = new BufferedReader(fr);
            String line = "";


        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }
}
