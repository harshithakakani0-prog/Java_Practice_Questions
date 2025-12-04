import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    public class Employee {
        public static void main(String[] args) {
            List<Employees> list=new ArrayList<>();
            list.add(new Employees(1, "Harshi", "IT"));
            list.add(new Employees(2,"Sai", "HR"));
            list.add(new Employees(3,"kiran","IT"));
            list.add(new Employees(4,"Ram", "FIN"));
            HashMap<String,List<Employees>> map=new HashMap<>();
            for(Employees e:list){
                String key= e.dep;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(e);
            }
            System.out.println(map);
        }
    }
    class Employees{
        int id;
        String name;
        String dep;
        public Employees(int id,String name,String dep){
            this.id=id;
            this.name=name;
            this.dep=dep;
        }
        public String toString(){
            return name;
        }
    }

