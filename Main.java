import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    int aircraftChoice;

    int characteristicChoice;
    String characteristicChoice1 = "Off", characteristicChoice2 = "Off", characteristicChoice3 = "Off", characteristicChoice4 = "Off", characteristicChoice5 = "Off",characteristicChoice6 = "Off";


    System.out.println("Which aircraft will be simulated?");
    System.out.println("1. Blimp");
    System.out.println("2. Helicopter");
    System.out.println("3. Fighter jet");
    System.out.println("4. Space Shuttle");
    String aircraft = null;
    do {
      aircraftChoice = in.nextInt();
      switch (aircraftChoice) {
      case 1:
        aircraft = "Blimp";
        break;
      case 2:
        aircraft = "Helicopter";
        break;
      case 3:
        aircraft = "Fighter jet";
        break;
      case 4:
        aircraft = "Space Shuttle";
        break;
      default:
        System.out.println("Invalid choice");
        System.out.println("Enter a number again");
      }
    } while (aircraftChoice < 1 || aircraftChoice > 4);
    int adjustedCharacteristicsCount = 0;

    String Choice2 = null;
    do {
      System.out.println("Enter the characteristics of that aircraft you want to change");
      System.out.println("1. Position Trim (Trim)");
      System.out.println("2. Force Breakout (Return-to-Center Force)");
      System.out.println("3. Force Gradient (Spring Force)");
      System.out.println("4. Force Friction");
      System.out.println("5. Damping");
      System.out.println("6. Hard Stop");


      characteristicChoice = in.nextInt();
      in.nextLine();
      if (characteristicChoice<1 || characteristicChoice>6){
        do {
          System.out.println("Invalid Choice");
          System.out.println("Enter a number again");
          characteristicChoice = in.nextInt();
          in.nextLine();
        } while (characteristicChoice<1 || characteristicChoice>6);

      }

      if (characteristicChoice<=6){

        switch (characteristicChoice) {
        case 1:
          if (characteristicChoice1.equals("On")) {
            System.out.println("You have already entered that");
          }
          else {
            System.out.println("Adjusting that characteristic\n");
            adjustedCharacteristicsCount++;
            System.out.println("The position to which a flight control returns when the pilot releases it.");
            characteristicChoice1 = "On";
          }
          break;
        case 2:
          if (characteristicChoice2.equals("On")) {
            System.out.println("You have already entered that");
          }
          else {
            System.out.println("Adjusting that characteristic\n");
            adjustedCharacteristicsCount++;
            System.out.println("A force that returns a control to Trim. This is a constant force applied toward Trim which remains the same despite how far the control is moved (displacement) and how fast a control is moved (velocity).");
            characteristicChoice2 = "On";
          }
          break;
        case 3:
          if (characteristicChoice3.equals("On")) {
            System.out.println("You have already entered that");
          }
          else {
            System.out.println("Adjusting that characteristic\n");
            adjustedCharacteristicsCount++;
            System.out.println("A force that returns a control to Trim, but one that varies with displacement. The farther the control is moved, the stronger the force applied toward Trim.");
            characteristicChoice3 = "On";
          }
          break;
        case 4:
          if (characteristicChoice4.equals("On")) {
            System.out.println("You have already entered that");
          }
          else {
            System.out.println("Adjusting that characteristic\n");
            adjustedCharacteristicsCount++;
            System.out.println("A constant force that is opposite to the direction of movement.");
            characteristicChoice4 = "On";
          }
          break;
        case 5:
          if (characteristicChoice5.equals("On")) {
            System.out.println("You have already entered that");
          }
          else {
            System.out.println("Adjusting that characteristic\n");
            adjustedCharacteristicsCount++;
            System.out.println("A force that is opposite to the direction of movement. Damping varies with velocity. The faster a control is moved, the stronger the force.");
            characteristicChoice5 = "On";
          }
          break;
        case 6:
          if (characteristicChoice6.equals("On")) {
            System.out.println("You have already entered that");
          }
          else {
            System.out.println("Adjusting that characteristic\n");
            adjustedCharacteristicsCount++;
            System.out.println("A force that simulates a mechanical limit of travel. By varying the Hard Stops, the range of travel can be adjusted.");
            characteristicChoice6 = "On";
          }
          break;

        }
        if (characteristicChoice1.equalsIgnoreCase("On") && characteristicChoice2.equalsIgnoreCase("On") && characteristicChoice3.equalsIgnoreCase("On") && characteristicChoice4.equalsIgnoreCase("On") && characteristicChoice5.equalsIgnoreCase("On") && characteristicChoice6.equalsIgnoreCase("On")) {
          System.out.println("You have picked everything");
        }
        else {
          do {
            System.out.println("\nDo you want to choose another option? (yes/no)");
            Choice2 = in.nextLine();
            if (!Choice2.equalsIgnoreCase("Yes") && !Choice2.equalsIgnoreCase("No")) {
              System.out.println("Enter Yes or No");
            }

          } while (!Choice2.equalsIgnoreCase("Yes") && !Choice2.equalsIgnoreCase("No"));
        }
      }

    } while (Choice2.equalsIgnoreCase("Yes"));
    System.out.println("Aircraft simulated: " + aircraft);
    System.out.println("Number of adjusted characteristics: " + adjustedCharacteristicsCount);
  }
}
