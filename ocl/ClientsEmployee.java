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
public class ClientsEmployee {
    
    int numberOfProjects;
    boolean assign;
    
    List<Project>also_to = new ArrayList<>();
    
    public boolean add(Project p){
               also_to.add(p);
               // given_to --> size = 1
               assign = (also_to.sum() = 1);  
               return assign;
}
    
}
