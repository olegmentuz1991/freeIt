package maintask;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) throws SecurityException, ReflectiveOperationException {

        inspection(MyService.class);
    }

    public static void inspection(Class cls) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (cls.isAnnotationPresent(Version.class)) {
            MyService service = new MyService("Какаха", 12);
            Method method = cls.getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(service);


        }
    }

}
