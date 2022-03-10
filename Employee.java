package hk.examples.res;

import java.util.List;

// Component
public class Employee implements EmployeeInterface{
	
	//attributes
	private String id;
	private String name;
	
	
	private List<ClientsEmployee> clientsEmployee;
        
        private List<InstanceOfProject>project;

	
	public Employee (){
		
	}
	
	public Employee(String name, String id ) {
		this.name = name;
		this.id = id;
	}
	
	
	
	private void giveProjectToDo(InstanceOfProject project){
		
	}

    @Override
    public void doProjectTask() {
        
    }

    

   
	
}
