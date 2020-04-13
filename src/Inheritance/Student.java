package Inheritance;


public class Student extends Personal {
    private int studentNo = 0;

    // Default constructor and we use super() : We are adding studentNo which is not in Personal class
    public Student(){
        super();
        studentNo = 0;
    }
    // Super() we are adding fields which we want to inherited from Personal
    public Student(String name,String surname, int age, int studentNo){
        super(name,surname,age);
        setStudentNo(studentNo);
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        if(studentNo<0){
            this.studentNo = 0;
        }else {
            this.studentNo = studentNo;
        }
    }

    @Override
    public String getIdInfo(){
        return super.getIdInfo() + " Student No : " + studentNo;
    }
}
