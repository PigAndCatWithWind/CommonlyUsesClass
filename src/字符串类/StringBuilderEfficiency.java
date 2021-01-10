package 字符串类;

public class StringBuilderEfficiency {
    public static void main(String[] args) {
        String string = "";
        long num1 = Runtime.getRuntime().freeMemory();
        //surplus memory
        long time1 = System.currentTimeMillis();
        //time
        for (int i = 0; i <5000 ; i++) {
            string = string + i;
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String occupy memory : " + (num1 - num2));
        System.out.println("String spend time: "+ (time2-time1));


        StringBuilder stringBuilder = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i <5000 ; i++) {
            stringBuilder.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("String occupy memory : " + (num3-num4));
        System.out.println("String spend time : " +(time4-time3));
    }
}
