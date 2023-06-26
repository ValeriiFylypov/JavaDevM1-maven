package myname;

import com.google.gson.Gson;

public class App {
    public static void main( String[] args ) {
        User myName = new User();
        myName.setName("Valera");
        myName.setLastName("Filipov");

        System.out.println(new Gson().toJson(myName));
    }
}
