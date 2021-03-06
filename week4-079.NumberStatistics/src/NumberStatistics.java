import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers = amountOfNumbers +1;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }


    public int sum(){
        int sum = 0;
        if (this.amountOfNumbers == 0){
            return 0;
        } else if (this.amountOfNumbers>0){
            return this.sum;
        } else return 0;
    }


    public double average(){
        int avg = 0;
        if (this.sum == 0 || this.amountOfNumbers == 0){
            return 0;
        }else if (this.amountOfNumbers > 0){
            return (double)this.sum / (double)this.amountOfNumbers;
        } else {return 0;}
    }



}