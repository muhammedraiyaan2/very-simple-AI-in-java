import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("AI In Java");
    //name
    System.out.println("AI: What is your Name?");
    System.out.print("You: ");
    Scanner inpu=new Scanner(System.in);
    String name=inpu.nextLine();
    //place
    System.out.println("AI: Where do you live?");
    System.out.print("You: ");
    Scanner inpu2=new Scanner(System.in);
    String place=inpu2.nextLine();
    //hobby
    System.out.println("AI: What is your hobby?");
    System.out.print("You: ");
    Scanner inpu3=new Scanner(System.in);
    String hobby=inpu3.nextLine();
    System.out.println("Hi "+name);
    System.out.println("Live's in "+place);
    System.out.println("Who like's "+hobby);
  }
}
