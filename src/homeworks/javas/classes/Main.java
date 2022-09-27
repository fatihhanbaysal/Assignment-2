package javas.classes;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Remove();
        customerManager.CustomerList();

        //value types
        int x = 10;
        int y = 20;

        System.out.println(y);//--> 10

        int[] numbers1 = {1, 2, 3,};
        int[] numbers2 = {4, 5, 6,};
        numbers2 = numbers1;
        numbers1[0] =10;
        System.out.println(numbers2[0]);


    }
}
