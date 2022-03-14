package hk.examples.res;

import java.util.List;

public interface KnowledgeHandlerI {
	
	//Constraints:
	//each employee can only do one project at a time;
	//a project must have a maxium of twleve employees working on it ;
	//Employees prefer one place to get and share the knowledge;
	//Emails of past projects must be old as two years;
	
	void lookUpEmployee(KnowledgeSystem knowledgeSystem, Employee employee);
	
	void selectProjectForEmployee(Employee employee);
	
	List<Employee>getEmployeesPerProject(Project project);
	
	public int projectCount(Project p);

}
