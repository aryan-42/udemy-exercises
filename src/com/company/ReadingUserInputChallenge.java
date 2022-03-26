import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int num=0,counter=0;
        for(int i=1;counter<10;i++){
            System.out.println("Enter number #"+(counter+1));
            if(scanner.hasNextInt()){
                counter++;
                num= scanner.nextInt();
                sum+=num;
            }

            else{
                System.out.println("Invalid number entered");
                continue;
            }
        }
        scanner.close();
        System.out.println("Sum of numbers = "+sum);
    }
}
