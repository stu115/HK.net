package hk.examples.res;

import java.util.List;

public class Project {
	
	private String name;
	private String id;
	
        private List<Employee> is_given;
       
        List<ClientsEmployee> also_to;

public Project(String name, String id){
              this.name = name;
              this.id = id;
}        
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
     public void add(ClientsEmployee clientsEmployee){
    
        } 
}
