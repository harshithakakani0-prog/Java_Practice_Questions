import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

    public class Productcategories {
        public static void main(String[] args) {
            List<Product> list=new ArrayList<>();
            list.add(new Product("milk","grocery"));
            list.add(new Product("shoes","fashion"));
            list.add(new Product("bread","grocery"));
            HashMap<String,Integer> map=new HashMap<>();
            for(Product p:list){
                map.put(p.categorie,map.getOrDefault(p.categorie,0)+1);
            }
            for (String c: map.keySet()){
                System.out.println(c+" "+map.get(c));
            }
        }
    }
    class Product{
        String name;
        String categorie;
        public Product(String name,String categorie){
            this.name=name;
            this.categorie=categorie;
        }
        public String toString(){
            return name+" "+categorie;
        }
    }
