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
 * @author 21359035
 */
public class KnowledgeSystem {
    
      String knowledgeType;
      int numberOfProjects;
      int numberOfKnowledgePlaces;
      
      boolean find;
      
      List<Employee>accesses = new ArrayList<>();
      List<ClientsEmployee> also_accesses = new ArrayList<>();   
      
      public boolean add(Employee employee){
                    accesses.numberOfKnowledgePlaces.add(employee);
                    // accesses.numberOfKnowledgePlaces --> size = 1
                    find = (accesses.numberOfKnowledgePlaces.size() = 1);  
                    return find;
}
 
     public boolean add(ClientsEmployee c){
                    also_accesses.numberOfKnowledgePlaces.add(c);
                    // accesses.numberOfKnowledgePlaces --> size = 1
                    find = (also_accesses.numberOfKnowledgePlaces.size() = 1);  
                    return find;
}
      
      
      
      
}
