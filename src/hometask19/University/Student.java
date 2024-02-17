package hometask19.University;

public class Student {
   private String name;
    private String group;
     int averGrade;


    public Student(String name, String group, int averGrade) {
        this.name = name;
        this.group = group;
        this.averGrade = averGrade;

    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getInfo(){
        double studStip;
        if (averGrade == 5){
            return studStip = 1000;
        }else{
           return studStip = 800;
        }
    }

    public void Itog(){
        System.out.println(getName() + ", группа " + getGroup() + ", cумма стипендии: " + getInfo() + ".");
    }

}
