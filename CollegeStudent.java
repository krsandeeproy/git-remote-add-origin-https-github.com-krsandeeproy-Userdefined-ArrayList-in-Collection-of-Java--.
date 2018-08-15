

import java.util.*;

/**
 *
 * @author sandy
 */
public class CollegeStudent {
    
    String name, place;
    int age;
    long contact;
    CollegeStudent()
    {
        
    }
    

    CollegeStudent(String name, String place, int age, long contact)
    {
        this.name=name;
        this.place=place;
        this.age=age;
        this.contact=contact;
    }
    /**
     * @param args the command line arguments
     */
    
    
}
class Get extends CollegeStudent
{
    
 public static void main(String arg[])
 {
     CollegeStudent cg1= new CollegeStudent("Sandeep", "Uttarakhand", 21, 843918870);
     CollegeStudent cg2= new CollegeStudent("Tushar", "Uttar Pradesh", 20, 842534536);
     CollegeStudent cg3= new CollegeStudent("Ashutosh", "himachal Pradesh", 21, 872565545);
     
     ArrayList<CollegeStudent> al= new ArrayList<CollegeStudent>();
     al.add(cg1);
     al.add(cg2);
     al.add(cg3);
     
     Iterator itr= al.iterator();
     for(CollegeStudent cl: al)
     {
         System.out.println(cl.name+" "+cl.place+" "+cl.age+" "+cl.contact);
     }
     
     
     
 }
}
