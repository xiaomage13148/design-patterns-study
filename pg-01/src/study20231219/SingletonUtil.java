package study20231219;

/**
 * 单例模式
 */
public class SingletonUtil {
    public static void main(String[] args) {
        SingletonUtil instance1 = SingletonUtil.getUniqueInstance();
        SingletonUtil instance2 = SingletonUtil.getUniqueInstance();
        System.out.println(instance1 == instance2);
    }

    private volatile static SingletonUtil uniqueInstance;

    private SingletonUtil() {

    }

    public static SingletonUtil getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonUtil.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonUtil();
                }
            }
        }
        return uniqueInstance;
    }
}
