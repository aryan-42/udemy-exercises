import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        int num,sum=0;
        long average;
        double count=0.0D;
        while(true){
            boolean isAnInt=scanner .hasNextInt();
            if(isAnInt){
                count++;
                num= scanner.nextInt();
                sum+=num;
            }
            else{
                break;
            }
        }
        average=(count>0) ? Math.round(sum/count) : 0;
        System.out.println("SUM = "+sum +" AVG = "+average);

        scanner.close();
    }

}
