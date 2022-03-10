package hk.examples.res;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Date;
import java.util.List;

//This is a component
public class Email implements EmailInterface {
    
    private String subject;
    private Date date;
    private Bool inOrder;
    private Project being_for;
            
    private List<Project>information_in;    
    private List<Attachment>attached;
    private List<Archive>stored;
    private List<Index>kept_in;
    
   
    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the inOrder
     */
    public Bool getInOrder() {
        return inOrder;
    }

    /**
     * @param inOrder the inOrder to set
     */
    public void setInOrder(Bool inOrder) {
        this.inOrder = inOrder;
    }

    /**
     * @return the being_for
     */
    public Project getBeing_for() {
        return being_for;
    }

    /**
     * @param being_for the being_for to set
     */
    public void setBeing_for(Project being_for) {
        this.being_for = being_for;
    }

  

    /**
     * @return the attached
     */
    public List<Attachment> getAttached() {
        return attached;
    }

    /**
     * @param attached the attached to set
     */
    public void setAttached(List<Attachment> attached) {
        this.attached = attached;
    }

    /**
     * @return the stored
     */
    public List<Archive> getStored() {
        return stored;
    }

    /**
     * @param stored the stored to set
     */
    public void setStored(List<Archive> stored) {
        this.stored = stored;
    }

    /**
     * @return the information_in
     */
    public List<Project> getInformation_in() {
        return information_in;
    }

    /**
     * @param information_in the information_in to set
     */
    public void setInformation_in(List<Project> information_in) {
        this.information_in = information_in;
    }

    /**
     * @return the kept_in
     */
    public List<Index> getKept_in() {
        return kept_in;
    }

    /**
     * @param kept_in the kept_in to set
     */
    public void setKept_in(List<Index> kept_in) {
        this.kept_in = kept_in;
    }

    @Override
   public void read(){
    
    }
    @Override
   public void putInArchive(){
   
   
   }
   
    @Override
   public void lookFor(){
   
   }
   
    @Override
   public void open(){
   
   
   }
}
