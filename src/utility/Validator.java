package utility;

public class Validator {
    
    //contructor
    private Validator(){

    }

    //check integer in range [min, max]
    public static boolean checkLimitInteger(int input, int min, int max){
        if(input >= min && input <= max){
            return true;
        }
        System.out.format("Input must be in range [%s,%s]\n", min, max);
        return false;
    }

    //check string at least x character and no space
    public static boolean checkString(String input, int length){
        if(input.length() < length || input.contains(" ")){
            System.out.format("Input at least %s character and no space\n", length);
            return false;
        }
        return true;
    }
}
