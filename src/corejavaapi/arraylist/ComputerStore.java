package corejavaapi.arraylist;

import methodsandencapsulation.constructors.BookStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerStore {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList();           // Object type is Computer
        Computer computer1 = new Computer("MacBook", 2018, 2000);
        Computer computer2 = new Computer("Lenovo", 2017, 1200);
        Computer computer3 = new Computer("Dell", 2019, 1600);
        Computer computer4 = new Computer("HP", 2019, 1400);
        Computer computer5 = new Computer("Asus", 2019, 1400);
        Computer computer6 = new Computer("Macbook", 2014, 1000);
        System.out.println(computer1.year);
        System.out.println(computer2.brand);
        System.out.println(computer3.model);
        System.out.println(computer4.price);
        System.out.println(computer5.hasCamera);
        System.out.println(computer6.screenSize);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        System.out.println("+++++++++++++++++++++++");
        System.out.println(computers.get(0).brand);
        System.out.println(computers.get(3).year);
        System.out.println(computers.get(5).memory);
        System.out.println("=======================");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println(computers.get(i).brand);

        }
        for (Computer computer : computers) {
            System.out.println(computer.price);
        }
        /*
        %10 discount
         */
        computers.get(0).price = computers.get(0).price - 100;
        System.out.println("++++++++++++++++++++++++++");
        for (Computer computer : computers) {
            computer.price = computer.price - 100;

        }
        for (Computer computer : computers) {
            System.out.println(computer.price);
        }
        System.out.println("___________________________");
        for (int i = 0; i < computers.size(); i++) {
            computers.get(i).price = computers.get(i).price - 100;
            System.out.println(computers.get(i).price);

        }
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).price <= 1000) {
                System.out.println(computers.get(i).brand);

            }
        }
        List<BookStore> listOfBooks=new ArrayList();            // imported BookStore from ConstructorPractice
        listOfBooks.add(new BookStore("Java OCA", 120));
        listOfBooks.add(new BookStore("Cucumber Automation",150));
        for (BookStore bookStore:listOfBooks ){
            System.out.println(bookStore.title);
        }

        List<Integer> nums= Arrays.asList(4,5,6,7,8,9);
        for (Integer num:nums){
            if (num==6){
                num=60;
            }
        }
        System.out.println(nums);
        for (int i=0;i<nums.size();i++){
            if(nums.get(i)==6){
                nums.set(i,60);

            }
            System.out.println(nums);
        }

    }
}