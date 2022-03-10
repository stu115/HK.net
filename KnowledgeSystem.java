package hk.examples.res;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeSystem {

    private String knowledgeType;
    private int numberOfProjects;
    
    private int numberOfKnowledgePlaces;

    private List<InstanceOfProject> projects;

    public KnowledgeSystem() {

        projects = new ArrayList<InstanceOfProject>();

    }

    public KnowledgeSystem(String knowledgeType, int numberOfProjects) {
        this.knowledgeType = knowledgeType;
        this.numberOfProjects = numberOfProjects;
        
        projects = new ArrayList<InstanceOfProject>();
    }
 
    /**
     * @return the knowledgeType
     */
    public String getKnowledgeType() {
        return knowledgeType;
    }

    /**
     * @param knowledgeType the knowledgeType to set
     */
    public void setKnowledgeType(String knowledgeType) {
        this.knowledgeType = knowledgeType;
    }

    /**
     * @return the numberOfProjects
     */
    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    /**
     * @param numberOfProjects the numberOfProjects to set
     */
    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    /**
     * @return the projects
     */
    public List<InstanceOfProject> getProjectsNeeded() {
        return projects;
    }

    /**
     * @param projectsNeeded the projects to set
     */
    public void setProjectsNeeded(List<InstanceOfProject> projectsNeeded) {
        this.projects = projectsNeeded;
    }

    public void addProject(InstanceOfProject project){
           projects.add(project);
                   
    }
    
    public int getNumberOfProjectsNeeded(){
    
               return projects.size();
    
    }
    /**
     * @return the numberOfKnowledgePlaces
     */
    public int getNumberOfKnowledgePlaces() {
        return numberOfKnowledgePlaces;
    }

    /**
     * @param numberOfKnowledgePlaces the numberOfKnowledgePlaces to set
     */
    public void setNumberOfKnowledgePlaces(int numberOfKnowledgePlaces) {
        this.numberOfKnowledgePlaces = numberOfKnowledgePlaces;
    }
    
}
