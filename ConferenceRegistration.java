/**
 * created by sailja gade on 29/8/2017
 * This program will register users fot the available sessions
 */

public class ConferenceRegistration {
    public static void main(String[] args) {
        Session s1=new Session(1,"10AM","1PM");
        Session s2=new Session(2,"2PM","5PM");
        Session s3=new Session(3,"6PM","9PM");

        Registration register = new Registration();

        register.registerUser(s1,"Sailaja");
        register.registerUser(s1,"Gade");
        register.registerUser(s1,"Aniketh");
        register.registerUser(s1,"Sasi");
    }
}
