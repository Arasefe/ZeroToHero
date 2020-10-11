package classdesign.encapsulationMusa;

import classdesign.polymorphism1.E;

public class Test {
    public static void main(String[] args) {
        EncapsulationPractice musa=new EncapsulationPractice();
        EncapsulationPractice iso=new EncapsulationPractice();
        EncapsulationPractice banu=new EncapsulationPractice();
        EncapsulationPractice zülfiyye=new EncapsulationPractice();
        musa.setSalary(145980);
        System.out.println(musa.getSalary());       // 145980

        System.out.println(iso.getSalary());        // 100000
        iso.setSalary(76000);
        System.out.println(iso.getSalary());        // new RunTimeException

        System.out.println(banu.getSalary());
        System.out.println(zülfiyye.getSalary());
    }
}
