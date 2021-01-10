package 字符串类;

public class TestString {
    public static void main(String[] args) {
        String str1 = "0123456789";
        String str2 = str1.substring(2,5);
        //str2=234--->substring(start,end)--->form str[start+1] to str[end]
        System.out.println(str2);
    }
}
