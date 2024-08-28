

public class warmup_sleepin {
    public boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;

    }
    public static void main(String[] args) {
    
        warmup_sleepin main = new warmup_sleepin();

        System.out.println(main.sleepIn(false,false));
        System.out.println(main.sleepIn(true,false));
        System.out.println(main.sleepIn(false,true));




    }
}
