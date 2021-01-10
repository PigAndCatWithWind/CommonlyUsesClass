package 字符串类;
//StringBuilder thread insecurity but high efficiency
//StringBuffer thread safety but low efficiency
public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcdefg");
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));
        System.out.println(stringBuilder);

        stringBuilder.setCharAt(2,'A');
        System.out.println(Integer.toHexString(stringBuilder.hashCode()));
        System.out.println(stringBuilder);


    }
}
