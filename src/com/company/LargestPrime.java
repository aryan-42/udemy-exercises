public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));

    }

    public static int getLargestPrime(int num){
        if(num<0){
            return -1;
        }
        int k=-1;
        for(int i=num;i>=2;i--){
            if(num%i==0){
                boolean isPrime=true;
                for(int j=2;j<=(int)Math.sqrt(i);j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    return i;
                }
            }
        }
        return k;
    }

    /*public static boolean isPrime(int num){
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }*/
}
