package 包装类;

public class TestWrappedClass{
    public static void main(String[] args) {
        //base class to be wrapped class
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(3);

        //wrapper class to be base class
        int c = b.intValue();
        double d = b.doubleValue();

        //string to be wrapped class
        Integer e = new Integer("3");
        Integer f = Integer.parseInt("3");

        //wrapped class to be string
        String g = f.toString();
    }
}
