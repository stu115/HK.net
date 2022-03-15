public ProjectCanter implements (ProjectCanterI,) {

@OVERRIDE

} 

public class readEmailsSystem {

//the no.of employees doing the same project
context: Project
invariant

no.OfEmployees.is_given --> size() <= 12

}

List<KnowledgeSystem>as ArrayList<>

String name

Int employeeID

sum = 0

   for    as

   sum += Attribute

return sum

Integer no.OfEmployees



public KnowledgeSystemHandler implements (KnowledgeSystemHandlerI,) {


@OVERRIDE
public void lookUpEmployee()


@OVERRIDE 
public void selectProjectForEmployee()


@OVERRIDE
public void provideEmailsToRead()

}

public void TestKnowledgeSystemHandler(){

knowledgesystem KnowledgeSystem  = new KnowledgeSystem(                   )

employee Employee = new Employee (      ,         )

project Project = new Project (         ,          )

project.addEmployee()

//Create a new instance of the project:
InstanceOfProject need = newInstanceOfProject(project      )
knowledgesystem.addProject(need);

ProjectInstance nextNeed = newProjectInstance(project        )
knowledgesystem.addProject(nextNeed);

//Test the system
assertEquals(knowledgesystem.getNumberOfProjectsNeeded(),2);

//Line of code that collects the employee by their ID:
project.getEmployeeByID

}

