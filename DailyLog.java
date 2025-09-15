/*	
    Course: COMP 170, Fall 1 2025
    System: Visual Studio Code, Mac iOS 14.0
    Author: Josh Kunin
*/
import java.util.Scanner;

public class DailyLog {
    public static void main(String[] args) throws Exception {
        
        // DECLARATIONS
        int attendantId;           // Care attendant ID number
        int dogId;                // Dog ID number
        int minutesSpent;         // Minutes spent with dog
        String dogNote;           // Note about dog's day
        int totalEntries;         // Total number of dog log entries
        int blueCount;            // Count of dogs in BLUE group
        int redCount;             // Count of dogs in RED group
        int greenCount;           // Count of dogs in GREEN group
        int yellowCount;          // Count of dogs in YELLOW group
        int blueTime;             // Total minutes spent with BLUE group
        int redTime;              // Total minutes spent with RED group
        int greenTime;            // Total minutes spent with GREEN group
        int yellowTime;           // Total minutes spent with YELLOW group
        final int SENTINEL = -1;  // Sentinel value to stop entering logs
        final int NOAH_ID = 11;   // Noah Charles ID
        final int SILAS_ID = 22;  // Silas Alexander ID
        final int CHRIS_ID = 33;  // Chris Isaac ID
        final int MYA_ID = 44;    // Mya Lynn ID

        // Initialize counters and time trackers
        totalEntries = 0;
        blueCount = 0;
        redCount = 0;
        greenCount = 0;
        yellowCount = 0;
        blueTime = 0;
        redTime = 0;
        greenTime = 0;
        yellowTime = 0;

        // Instantiate Scanner object
        Scanner scnr = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("Welcome to the MPLS care attendant daily log program.  This program will allow you to enter a care attendant id and produce a log for the dogs under the attendant's care. - DailyLog.java:46");

        // Create Space
        System.out.println("");

        // OUTPUT OF CARE ATTENDANT INFO
        System.out.println("Enter 11 for Noah Charles - DailyLog.java:52");
        System.out.println("Enter 22 for Silas Alexander - DailyLog.java:53");
        System.out.println("Enter 33 for Chris Isaac - DailyLog.java:54");
        System.out.println("Enter 44 for Mya Lynn - DailyLog.java:55");

        // PRIMER: Prompt for first attendant ID
        System.out.print("Enter care attendant id number (or 1 to finish): - DailyLog.java:58");
        attendantId = scnr.nextInt();

        // Looping structure for continuous iteration until sentinel value
        while (attendantId != SENTINEL) {
            // Enforce that only valid attendant IDs (11, 22, 33, 44) are entered
            if (attendantId != NOAH_ID && attendantId != SILAS_ID && attendantId != CHRIS_ID && attendantId != MYA_ID) {
                System.out.println("Invalid attendant ID. Please enter 11, 22, 33, or 44. - DailyLog.java:65");
            } else {
                // Determine which dogs to display based on attendant ID
                System.out.println("Available dogs for this attendant: - DailyLog.java:68");
                if (attendantId == NOAH_ID) {
                    System.out.println("348  Badger (RED) - DailyLog.java:70");
                    System.out.println("301  Hoosier (RED) - DailyLog.java:71");
                    System.out.println("391  Bucky (RED) - DailyLog.java:72");
                    System.out.println("362  Nittany (BLUE) - DailyLog.java:73");
                    System.out.println("311  Wolvey (BLUE) - DailyLog.java:74");
                } else if (attendantId == SILAS_ID) {
                    System.out.println("325  Spartan (GREEN) - DailyLog.java:76");
                    System.out.println("388  Hawk (YELLOW) - DailyLog.java:77");
                    System.out.println("333  Gopher (YELLOW) - DailyLog.java:78");
                } else if (attendantId == CHRIS_ID) {
                    System.out.println("362  Nittany (BLUE) - DailyLog.java:80");
                    System.out.println("311  Wolvey (BLUE) - DailyLog.java:81");
                    System.out.println("388  Hawk (YELLOW) - DailyLog.java:82");
                    System.out.println("333  Gopher (YELLOW) - DailyLog.java:83");
                } else if (attendantId == MYA_ID) {
                    System.out.println("348  Badger (RED) - DailyLog.java:85");
                    System.out.println("301  Hoosier (RED) - DailyLog.java:86");
                    System.out.println("391  Bucky (RED) - DailyLog.java:87");
                    System.out.println("325  Spartan (GREEN) - DailyLog.java:88");
                }

                // Prompt for dog ID
                System.out.print("Enter dog ID: - DailyLog.java:92");
                dogId = scnr.nextInt();
                scnr.nextLine(); // Clear newline for dog note input

                // Enforce valid dog ID based on attendant's assigned color groups
                boolean validDog = false;
                String dogName = "";
                String colorGroup = "";
                if (attendantId == NOAH_ID) {
                    if (dogId == 348 || dogId == 301 || dogId == 391) {
                        validDog = true;
                        colorGroup = "RED";
                        if (dogId == 348) dogName = "Badger";
                        else if (dogId == 301) dogName = "Hoosier";
                        else dogName = "Bucky";
                    } else if (dogId == 362 || dogId == 311) {
                        validDog = true;
                        colorGroup = "BLUE";
                        if (dogId == 362) dogName = "Nittany";
                        else dogName = "Wolvey";
                    }
                } else if (attendantId == SILAS_ID) {
                    if (dogId == 325) {
                        validDog = true;
                        colorGroup = "GREEN";
                        dogName = "Spartan";
                    } else if (dogId == 388 || dogId == 333) {
                        validDog = true;
                        colorGroup = "YELLOW";
                        if (dogId == 388) dogName = "Hawk";
                        else dogName = "Gopher";
                    }
                } else if (attendantId == CHRIS_ID) {
                    if (dogId == 362 || dogId == 311) {
                        validDog = true;
                        colorGroup = "BLUE";
                        if (dogId == 362) dogName = "Nittany";
                        else dogName = "Wolvey";
                    } else if (dogId == 388 || dogId == 333) {
                        validDog = true;
                        colorGroup = "YELLOW";
                        if (dogId == 388) dogName = "Hawk";
                        else dogName = "Gopher";
                    }
                } else if (attendantId == MYA_ID) {
                    if (dogId == 348 || dogId == 301 || dogId == 391) {
                        validDog = true;
                        colorGroup = "RED";
                        if (dogId == 348) dogName = "Badger";
                        else if (dogId == 301) dogName = "Hoosier";
                        else dogName = "Bucky";
                    } else if (dogId == 325) {
                        validDog = true;
                        colorGroup = "GREEN";
                        dogName = "Spartan";
                    }
                }

                // Check if dog ID is valid
                if (!validDog) {
                    System.out.println("Invalid dog ID for this attendant. - DailyLog.java:152");
                } else {
                    // Gather minutes spent and dog note
                    System.out.print("Enter minutes spent with dog: - DailyLog.java:155");
                    minutesSpent = scnr.nextInt();
                    scnr.nextLine(); // Clear newline for dog note
                    System.out.print("Enter note about dog's day: - DailyLog.java:158");
                    dogNote = scnr.nextLine();

                    // Update counts and times based on color group
                    if (colorGroup.equals("BLUE")) {
                        blueCount = blueCount + 1;
                        blueTime = blueTime + minutesSpent;
                    } else if (colorGroup.equals("RED")) {
                        redCount = redCount + 1;
                        redTime = redTime + minutesSpent;
                    } else if (colorGroup.equals("GREEN")) {
                        greenCount = greenCount + 1;
                        greenTime = greenTime + minutesSpent;
                    } else if (colorGroup.equals("YELLOW")) {
                        yellowCount = yellowCount + 1;
                        yellowTime = yellowTime + minutesSpent;
                    }

                    // Increment total entries
                    totalEntries = totalEntries + 1;

                    // OUTPUT OF CARE ATTENDANT INFO
                    System.out.println("\n=== Dog Log Summary === - DailyLog.java:180");
                    System.out.println("Care Attendant ID: - DailyLog.java:181" + attendantId);
                    System.out.println("Dog ID: - DailyLog.java:182" + dogId);
                    System.out.println("Dog Name: - DailyLog.java:183" + dogName);
                    System.out.println("Color Group: - DailyLog.java:184" + colorGroup);
                    System.out.println("Minutes Spent: - DailyLog.java:185" + minutesSpent);
                    System.out.println("Note: - DailyLog.java:186" + dogNote);
                    System.out.println("");
                }
            }

            // Reprompt for another attendant ID
            System.out.print("Enter care attendant id number (or 1 to finish): - DailyLog.java:192");
            attendantId = scnr.nextInt();
        }

        // Output total time and count by color
        System.out.println("\n=== Final Summary === - DailyLog.java:197");
        System.out.println("Total number of dogs entered: - DailyLog.java:198" + totalEntries);
        System.out.println("BLUE group count: - DailyLog.java:199" + blueCount + ", Total time: " + blueTime + " minutes");
        System.out.println("RED group count: - DailyLog.java:200" + redCount + ", Total time: " + redTime + " minutes");
        System.out.println("GREEN group count: - DailyLog.java:201" + greenCount + ", Total time: " + greenTime + " minutes");
        System.out.println("YELLOW group count: - DailyLog.java:202" + yellowCount + ", Total time: " + yellowTime + " minutes");
    }
}