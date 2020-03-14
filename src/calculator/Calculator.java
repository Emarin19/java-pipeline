package calculator;

public class Calculator{
    public int age;
    public double salary;

    public static double adding(int number, int number2){
        return number + number2;

    }

    public static double substraction(int number, int number2){
        return number - number2;
    }

    public static double multiplication(int number, int number2){
        return number*number2;
    }

    public static double division(int number1, int number2){
        if(number2 != 0){
            return number1/number2;
        }else{
            return -1;
        }
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setAge(int age){
        this.age = age;
    }
}