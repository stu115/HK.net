/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hk.examples.ocl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Project {
    
    String name;
    String id;
    int numberOfEmployees;
    int numberOfClientsEmployees;
    
    boolean confirm;
    List<Employee> is_given = new ArrayList<>();
    List<ClientsEmployee> also_given = new ArrayList<>();       
    
    public boolean add(Employee employee){
                    is_given.add(employee);
                    //is_given --> size <= 12
                    confirm = (is_given.size()<= 12);  
                    return confirm;
}
 
   
    public boolean add(ClientsEmployee c){
                   also_given.add(c); 
                  //also_given --> size <= 12
                  return (also_given.size() <= 12);
    
    }
             
    public int giveProject(){
           int sum = 0;
           for (Employee employee:is_given){
               sum += employee.numberOfProjects;    
           }
               return (sum = 1);
           
    
    }

    
    public int alsoGiveProject(){
           int sum = 0;
           for (ClientsEmployee c:also_given){
               sum += c.numberOfProjects;
            }
               return (sum = 1);      
            }
    
            
}
