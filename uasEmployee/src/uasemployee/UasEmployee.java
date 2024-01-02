
package uasemployee;

/**
  * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Employee
 */


class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager is pemimpin");
    }
}

class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer is pembuat coding");
    }
}

class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer is pembuat designing");
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe");
        Developer developer = new Developer("Jane Doe");
        Designer designer = new Designer("John Smith");

        manager.work();
        developer.work();
        designer.work();
    }
}

