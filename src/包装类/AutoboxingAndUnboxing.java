package 包装类;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        Integer a = 3;
        //compiler autoboxing
        // ---> Integer a = Interger.valueOf(3);
        // --->Integer a = new Integer(3);


        int b = a ;
        //compiler auto unboxing
        //---> int b = a.intValue();

        //warning: null pointer
        Integer c = null;
        int d = c;
        //this is a null pointer ,if you auto unboxing it will exception
        // so you should add if
        Integer e = null;
        if (e!= null) {
            int f = e;
        }
    }
}
