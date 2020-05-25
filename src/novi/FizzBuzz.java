package novi;

public class FizzBuzz {
    //variables
    int fizz = 3;
    int buzz = 5;
    int loopUntil = 100;
    String output = "";

    //constructor
    public FizzBuzz(){

    }

    //methods
    public void run(){
        for (int i = 1; i <= loopUntil; i++) {
            if(i % fizz == 0){output += "Fizz";}    //Check for Fizz
            if(i % buzz == 0){output += "Buzz";}    //Check for Buzz
            if(output == ""){output += i;}          //If neither, add current number instead

            System.out.println(output);
            output = "";                            //Reset output for next loop
        }
    }
}