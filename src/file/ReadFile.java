package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import constants.Message;

public class ReadFile {
    //read data from file user.dat
    public Map<String, String> getDataFromFile(){
        //create map to store data in file
        Map<String, String> map = new HashMap<>();
        try {
            //declear
            FileReader fr = new FileReader(Message.FILE_NAME);
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            while (true) {
                //read 1 line in file
                line = br.readLine();
                //
                System.out.println(line);
                //check null
                if(line == null){
                    break;
                }
                String[] data = line.split("\\|");
                String username = data[0];
                String password = data[1];
                //
                System.out.println(username + " " + password);
                //put data into map
                map.put(username, password);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }
}
