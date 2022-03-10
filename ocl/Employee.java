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
public class Employee {
    
    int numberOfProjects;
    boolean assign;
    
    List<Project>given_to = new ArrayList<>();
    
public boolean add(Project p){
               given_to.add(p);
               // given_to --> size = 1
               assign = (given_to.sum() = 1);  
               return assign;
}
    


}
