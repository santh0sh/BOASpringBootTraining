package lazyinitialized.bean.example;

public class Student {
    private String name;
     
    public Student(){
        System.out.println("Inside Student Constructor");
    }

    
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}