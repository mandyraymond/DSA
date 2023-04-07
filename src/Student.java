public class Student {
    int sno;
    String sname;

    @Override public String toString(){
        return print();
    }

     public String print(){
        return "Roll num :" + sno + " Name :" + sname;
    }
}
