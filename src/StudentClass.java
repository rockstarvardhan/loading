public class StudentClass {
    public String fathername;
    public String name;

    public StudentClass(String fathername,String name){
        this.fathername=fathername;
        this.name=name;
        boolean login(StudentClass details){
            String fathername="suresh";
            String name="ravi";
            if (StudentClass.equals(details.fathername) && name.equals(details.name)){
                return true;
            } else {
                return false;
            }
            }
        }

}