/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_task1;

/**
 *
 * @author Admin
 */
public class DangerousDog extends Dog{
    private int reportedIncidents = 0;

    public DangerousDog(String id, String name, String owner, String size, int reportedIncidents) {
        super(size, id, name, owner);
        this.reportedIncidents = reportedIncidents;
    }

    public DangerousDog(String id, String name, String owner, String size) {
        super(size, id, name, owner);
    }

    public void setReportedIncidents(int reportedIncidents) {
        this.reportedIncidents = reportedIncidents;
    }
    
    public String getDetails(){
        return "id"+ ":" +super.getId() + ","+ "name"+":"+ super.getName() +"," + "owner"+":"+ super.getOwner()
                +","+ "size"+ ":" + super.getSize()+","+ "reportedIncidents" + ":" + this.reportedIncidents;
    }

    @Override
    public String toString() {
        return "DangerousDog{" + "reportedIncidents=" + reportedIncidents + '}';
    }

    public int getReportedIncidents() {
        return reportedIncidents;
    }
    
}
