import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    public class Statecity {
        public static void main(String[] args) {
            List<States> list=new ArrayList<>();
            list.add(new States("Vijayawada", "AP"));
            list.add(new States("Guntur", "AP"));
            list.add(new States("Hyderabad", "TS"));
            list.add(new States("Warangal", "TS"));
            HashMap<String,List<States>> map=new HashMap<>();
            for(States s:list){
                String key=s.state;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(s);
            }
            System.out.println(map);
        }
    }
    class States{
        String city;
        String state;
        public States(String city,String state){
            this.city=city;
            this.state=state;
        }
        public String toString(){
            return city;
        }
    }
