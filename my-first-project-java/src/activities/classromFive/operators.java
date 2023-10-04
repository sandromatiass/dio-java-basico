package activities.classromFive;

public class operators {
  
  public static void main (String[] args) {
    String fullName = "Sandro " + " Matias";

    System.out.println(fullName);

    //operador unário
    int numberTest = 5;

    numberTest = - numberTest;

    System.out.println(numberTest);

    numberTest = numberTest * -1;

    System.out.println(numberTest);

    //incrementar e decrementar

    int numberTestTwo = 5;

    numberTestTwo++;

    System.out.println(numberTestTwo);

    numberTestTwo--;

    System.out.println(numberTestTwo);

    boolean variable = true;

    System.out.println(!variable);


    //operador ternário

    int a, b;

    a = 5;
    b = 5;

    String result = a==b ? "true" : "false";
     
    System.out.println(result);

    //outros operadores

    String nameOne = "Sandro";
    String nameTwo = new String ("Matias");

    System.out.println(nameOne.equals(nameTwo));

    int numberOne = 1;
    int numberTwo = 2;

    boolean simNao = numberOne == numberTwo;

    if(numberOne < numberTwo){
      System.out.println("Or condition is true");
    }

    System.out.println("numberOne is the same as numberTwo " + simNao);

    simNao = numberOne != numberTwo;

    System.out.println("numberOne is the diffrent from numberTwo " + simNao);

    simNao = numberOne > numberTwo;

    System.out.println("numberOne is greater than numberTwo " + simNao);

    //OPERADORES LÓGICOS

    boolean conditionOne = true;
 
    boolean conditionTwo = false;

    if(conditionOne && conditionTwo){
      System.out.println("Both are true!");
    }

    if(conditionOne || conditionTwo){
      System.out.println("Only one and true!");
    }
    System.out.println("fim");
  }
}
