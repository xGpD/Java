import java.util.Scanner
public class solutio
{
  public static void main(String[] args){
  
    String question1="What is the element name of Fe?";
    String question2="What are the positive atoms?";
    String question3="What are the negative atoms?";
    
    String answer1="Iron";
    String answer2="Protons";
    String answer3="Electrons";
    
    int points=0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(question1);
    int userInput1 = scanner.next();
    
    if (userInput1.equals(answer1)){
      points++;
      System.out.println("");
    }
    
  }
}
