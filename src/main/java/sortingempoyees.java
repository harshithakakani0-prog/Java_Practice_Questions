import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortingempoyees {
    public static void main(String[] args) {
        List<Employe> list=new ArrayList<>();
        list.add(new Employe(1,"zzzzzz",100000));
        list.add(new Employe(2,"kiran",200000));
        list.add(new Employe(3,"ram",100000));
        Comparator<Employe> bysalary=(s1,s2)->{
            int cmp=Integer.compare(s1.salary,s2.salary);
            if(cmp==0){
                return s1.name.compareToIgnoreCase(s2.name);
            }
            return cmp;
        };
        Collections.sort(list,bysalary);
        for(Employe items:list){
            System.out.println(items);
        }
    }
}
class Employe{
    int id;
    String name;
    int salary;
    public Employe(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return id+" "+name+" "+salary;
    }
}

