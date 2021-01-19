import java.util.regex.*;

public class RegExp {
    public static void main(String[] args) {
        String content = "He eats 2 apples and 3 pears";
        checkApple(content);
        captureGrp(content);
    }

    public static void checkApple(String content) {
        String pattern = ".*apple.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("Dose the String contain apple? " + isMatch);
    }

    public static void captureGrp(String content) {
        /** 分三组 第一组非数组 第二组数组 第三组 之外所有的字符 */
        String pattern = "(\\D*)(\\d*)(.*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);
        String f = "Found value";
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

    }

}
