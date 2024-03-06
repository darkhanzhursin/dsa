package fpp.classworks.lesson5.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CompanyReflection {
    public static void main(String[] args) throws Exception {
        Company com = new Company("Veridian Solutions", 24000);
        Class comClass = com.getClass();
        System.out.println("Name of the class with package name: " + comClass.getName());
        System.out.println("Name of the class: " + comClass.getSimpleName());
        Field[] fields = comClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(com, "NexGen Innovations");
            }
        }
        System.out.println("Name of the company: " + com.getName()); //getter

        Method[] comMethods = comClass.getDeclaredMethods();
        for (Method method : comMethods) {
            if (method.getName().equals("setNumOfEmployees")) {
                method.setAccessible(true);
                method.invoke(com, 25000);
            } else if (method.getName().equals("internalRules")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }

        System.out.println("Number of employees: " + com.getNumOfEmployees());
    }
}
