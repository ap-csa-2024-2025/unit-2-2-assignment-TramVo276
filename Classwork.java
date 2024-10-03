import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println("Hello");
    Scanner sc = new Scanner(System.in);
    System.out.println("what type pf item are you buying?");
    String item;
    item = sc.nextLine();
    System.out.println("How many are you buying?");
    int number;
    number = sc.nextInt();
    System.out.println("How much does each one weight?");
    double weight;
    weight = sc.nextDouble();
    double totalWeight = number * weight;
    System.out.println(number + " " + item + " at " + weight + " pounds each will weigh " + totalWeight + " pounds total");
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe frist computer programmer");
    System.out.println("(\\(\\\n( - -)\n(( \' ) ( \' )");
  }
}
     