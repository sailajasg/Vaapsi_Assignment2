/**
 * created by sailja gade on 29/8/2017
 * This program will create user for the registered sessions
 */

public class User {
    private String userName;
    private int sessionID;
    private boolean isRegistered;

    public String getUserName() {
        return userName;
    }

    public int getSessionID() {
        return sessionID;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}
