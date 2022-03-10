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
public class Email {
    
    String subject;
    int numberOfYearsOld;
    
    boolean task;
    List<Employee> reads = new ArrayList<>();
    List<ClientsEmployee> also_reads = new ArrayList<>(); 
    
    public boolean add(Employee employee){
                    reads.numberOfYearsOld.add(employee);
                    //reads.numberOfYearsOld --> sum() = 5
                    task = (reads.numberOfYearsOld.sum() = 5);  
                    return task;
    }
    
    public boolean add(ClientsEmployee c){
                    also_reads.numberOfYearsOld.add(employee);
                    //also_reads.numberOfYearsOld --> sum() = 5
                    task = (also_reads.numberOfYearsOld.sum() = 5);  
                    return task;
    }
}

