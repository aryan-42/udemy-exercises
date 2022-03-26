public class SecondsAndMinutesConverter {
    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0&&(seconds>=0&&seconds<=59)) {

            return minutes / 60 + "h " + minutes % 60 + "m " + seconds+"s";
        }
        else{
            return "Invalid value";
        }
    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
            return seconds/(60*60)+"h "+(seconds%3600)/60+"m "+(seconds%3600)%60+"s";
        }
        else{
            return "Invalid value";
        }
    }
    public static void main(String[] args) {
        System.out.println(getDurationString(9_10_000,50));
        System.out.println(getDurationString(20_096_500));
    }
}
