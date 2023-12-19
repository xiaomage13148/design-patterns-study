package study20231219;

import java.util.ArrayList;

/**
 * List测试
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> allList = new ArrayList<>();
        allList.add("a");
        allList.add("b");
        allList.add("c");
        allList.add("d");

        ArrayList<String> childList = new ArrayList<>();
        childList.add("c");
        childList.add("z");
        childList.add("4");

        allList.removeAll(childList);

        System.out.println(allList);
    }
}
