
// Student Management System

class Management{

    String name;
    int age;
    int rollNo;
    String address;


    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setRollNo(int r){
        rollNo = r;
    }

    public int getRollNo(){
        return rollNo; 
    }

    public void setAddress(String addr){
        address = addr;
    }

    public String getAddress(){
        return address;
    }
}

class Student extends Management{
    Student(String n){
        name = n;
        System.out.println(name);
    }

} 

public class studentManagementSys {
    public static void main(String[] args) {
        
        Student st = new Student("Deepak");

        st.setAge(18);
        System.out.println(st.getAge());
        st.setRollNo(12);
        st.getRollNo();
        System.out.println(st.getRollNo());
        st.setAddress("Gulmi");
        System.out.println(st.getAddress());


    }
}