package hk.examples.res;

import java.util.Date;

public class InstanceOfProject {
	
	
	Project project;
	
        Employee employee;
        
        ClientsEmployee clientsEmployee;
      
        Date startDate;
		
	public InstanceOfProject(Project project, Employee employee){
		this.project=project;
		this.employee=employee;
                this.clientsEmployee=clientsEmployee;
	}

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the clientsEmployee
     */
    public ClientsEmployee getClientsEmployee() {
        return clientsEmployee;
    }

    /**
     * @param clientsEmployee the clientsEmployee to set
     */
    public void setClientsEmployee(ClientsEmployee clientsEmployee) {
        this.clientsEmployee = clientsEmployee;
    }

   

   

	
	
}
