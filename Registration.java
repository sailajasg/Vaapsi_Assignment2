/**
 * created by sailja gade on 29/8/2017
 * This program will create register if session is available
 */

public class Registration {

    public void registerUser(Session obj, String userName) {
        User users = new User();
        if (obj.isAvailable()) {
            obj.doRegistration();
            users.setUserName(userName);
            users.setRegistered(true);
            users.setSessionID(obj.getSessionID());

            System.out.println(userName + ", You are Registerd for the session");
        } else {
            System.out.println("Sorry!!Seats are not available. "+userName);
        }
    }
}
