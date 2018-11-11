package main;

 /*guarantees that that class has only one instance and gives global access to this instance*/
public class SingletonProgram {
    public static void main(String[] args){
        var singleInstance = Singleton.getInstance();

        var singleInstance2 = Singleton.getInstance();

        System.out.println(singleInstance == singleInstance2);
    }
}
