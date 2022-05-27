
import classes.TemperatureHelper;
import classes.User;
import enums.Status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*

        User user = new User(12, "String", Status.OFFLINE);
        user.setStatus(Status.ONLINE);


        System.out.println(user.getStatus().getValue());
        System.out.println(user.getStatus().getName());

        for (Status status : Status.values()) {
            System.out.println(status);
        }
         */

        int[] number = new int[10];
        ArrayList<Integer> numbers2;

        HashMap<Integer, String> collection = new HashMap<>();

        collection.put(1, "Pedro");
        collection.put(2, "Claudia");
        collection.put(3, "Marina");
        collection.put(2, "Miquel");



        for (int i = 1; i <= collection.size(); i++) {
            System.out.println(collection.get(i));

        }
        System.out.println(collection.keySet());
        System.out.println(collection.values());

        for (String name : collection.values()) {
            System.out.println(name);
        }

        System.out.println(collection.entrySet());

        HashMap<String, User> strings = new HashMap<>();
        HashMap<String, HashMap<Integer, User>> usersHashMaps = new HashMap<>();

        concatStrings(true,"Hola", "qué", "tal");
        concatStrings(false, "Hola", "qué tal", "soy", "jaume");

        concatStrings(true, "Hola", "qué tal", "soy", "jaume", "soy", "de", "valencia");

        System.out.println(TemperatureHelper.celsiusToFahrenheit(20.0));


        System.out.println("usersHashMaps = " + collection);
    }

    //varargs
    public static String concatStrings(Boolean bool,  String... args) {

            String result = "";

        for (String string : args) {
            result += string + " ";
        }

        System.out.println(result);
        return result;
    }

}
