class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.id = id;
        this.name = name;
    }

    public void setname(String empName){
        this.name = empName;
    }

    public void setid(int empId){
        this.id = empId;
    }
    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }
}

public class ConstructorsBasics {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Mahesh", 15478);
        System.out.println("Name : " + (e1.getname()));
        System.out.println("Id : " + (e1.getid()));
    }
}
