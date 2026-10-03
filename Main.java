import java.util.Scanner;

public class Main {

   public static void main(String []args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("Please enter a weather singular:");
      String weather = scan.nextLine();
      System.out.println("Please enter a plural noun:");
      String somethingOldPlural = scan.nextLine();
      System.out.println("Please enter a sound:");
      String soundOne = scan.nextLine();
      System.out.println("Please enter a another sound:");
      String soundTwo = scan.nextLine();
      System.out.println("Please enter a living thing singular:");
      String somethingOldLivingSingular = scan.nextLine();
      System.out.println("Please enter a noun:");
      String nounOne = scan.nextLine();
      System.out.println("Please enter an adjictive:");
      String adjictiveOne = scan.nextLine();
      System.out.println("Please enter another adjictive:");
      String adjictiveTwo = scan.nextLine();
      System.out.println("Please enter another noun:");
      String nounTwo = scan.nextLine();
      System.out.println("Please enter another another sound:");
      String soundThree = scan.nextLine();
      System.out.println("Please enter a direction:");
      String direction = scan.nextLine();
      System.out.println("Please enter a facial expression:");
      String facialEcpression = scan.nextLine();
      System.out.println("Please enter a another anouther noun:");
      String nounThree = scan.nextLine();
      System.out.println("Please enter a drink:");
      String drink = scan.nextLine();


      System.out.println("A " + weather + " storm roared outside. The wind seaped through \nthe old " + somethingOldPlural + ", and made a " + soundOne + "sound. \nAditinally upstairs there was a loud " + soundTwo + "; \nAn old " + somethingOldLivingSingular + " sat on a " + nounOne + " moving back and forth. \nThe door to the house swung open stepping in was a " + nounTwo + ". \n" + adjictiveOne + ", " + adjictiveTwo + ", they fell to the ground throwing a \nlarge " + soundThree + " into the air. The " + soundTwo + " of the " + nounOne + " stopped, but \n" + soundTwo + " of feet on the old wood floor began. Now stood above the \n" + nounTwo + " was the old " + somethingOldLivingSingular + " pearing " + direction + ". A large " + facialEcpression + " manifested \nacross " + somethingOldLivingSingular + "'s face. They retuned with a " + nounThree + " and a cup of " + drink + " for the " + nounTwo + ".");

      scan.close();
   }
}
