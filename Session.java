/**
 * created by sailja gade on 29/8/2017
 * This program will create session
 */
public class Session {
   private int sessionID;
   private String startTime;
   private String endTime;
   private final int totalSeats=2;
   private int occupiedSeats;

   public Session(){}

   public Session(int sessionID,String startTime, String endTime){
       this.sessionID=sessionID;
       this.startTime=startTime;
       this.endTime=endTime;
   }

    public int getSessionID() {
        return sessionID;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }

   public boolean isAvailable(){
       if(occupiedSeats<totalSeats){
           return true;
       }
       else{
           return false;
       }
   }

   public void doRegistration(){
       int seating=getOccupiedSeats()+1;
       setOccupiedSeats(seating);
   }

}
