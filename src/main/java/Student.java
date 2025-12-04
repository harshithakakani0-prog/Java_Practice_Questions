import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    public class Student {
        public static void main(String[] args) {
            List<Students> list=new ArrayList<>();
            list.add(new Students(101, "Harshi", 'A'));
            list.add(new Students(102,"Sai",'B'));
            list.add(new Students(103,"Kiran",'C'));
            list.add(new Students(104,"Ram",'A'));
            HashMap<String,List<Students>> map=new HashMap<>();
            for(Students s:list){
                String key= String.valueOf(s.grade);
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(s);
            }
            System.out.println(map);
        }
    }
    class Students{
        int rollno;
        String name;
        char grade;
        public Students(int rollno,String name,char grade){
            this.rollno=rollno;
            this.name=name;
            this.grade=grade;
        }
        public String toString(){
            return rollno+" "+name+" "+grade;
        }
    }

