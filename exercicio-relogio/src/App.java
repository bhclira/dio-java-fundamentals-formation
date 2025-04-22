public class App {
    
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHour(25);
        brlClock.setMinute(0);
        brlClock.setSecond(0);

        System.out.println("BRL Clock: " + brlClock.getTime()); // Expected: 01:00:00
        
        
    }
}
