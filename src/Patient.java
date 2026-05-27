import java.util.HashMap;

public class Patient{
    int id;
    int age;
    String name;
    String location;

    public Patient(int id, int age, String name, String location){
        this.id=id;
        this.age=age;
        this.name=name;
        this.location=location;
    }

     public int getId() {
         return id;
     }
     public static void main(String []args){
         HashMap<Integer, Patient> patientHashMap=new HashMap<>();

         Patient p1=new Patient(1,23,"fils","kigali");
         Patient p2=new Patient(2,35,"kado","kabeza");
         Patient p3=new Patient(3,33,"gaga","kanombe");

         patientHashMap.put(p1.getId(),p1);
         patientHashMap.put(p2.getId(),p2);
         patientHashMap.put(p3.getId(),p3);

         if(patientHashMap.containsKey(3)){
             System.out.println("patient found");
         }

     }
 }