package hometask19.University;

public class Aspirant extends Student{
   private String work;

    public Aspirant(String name, String group, int averGrade, String work) {
        super(name, group, averGrade);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public double getInfoAspir(){
        double studAspir;
        if (averGrade == 5){
           return studAspir = 2000;
        }else{
            return studAspir = 1800;
        }
    }
    public void ItogAsp(){
        System.out.println(getName() + ", группа " + getGroup() +", тема работы: \'"+ getWork()  + " \', сумма стипендии " + getInfoAspir() + ".");
    }

}
