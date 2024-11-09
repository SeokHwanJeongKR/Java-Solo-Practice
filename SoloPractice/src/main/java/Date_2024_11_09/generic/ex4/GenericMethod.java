package Date_2024_11_09.generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("obj print = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("genericMethod print = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T ext){
        System.out.println("numberMethod = " + ext);
        return ext;
    }
}
