package com.gowatr.cloudgraze.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;
@Entity
public class CloudGraze {
    @Id
    private String door_no;
    private List<List<String>> time;
    private List<Integer> last_month_tot;
    @Column(name = "Current_month_tot")
    private List<Integer> Current_month_tot;
    private List<Integer> last_tot;

    public CloudGraze() {
    }

    public CloudGraze(String door_no, List<List<String>> time, List<Integer> last_month_tot,
                      List<Integer> Current_month_tot, List<Integer> last_tot) {
        this.door_no = door_no;
        this.time = time;
        this.last_month_tot = last_month_tot;
        this.Current_month_tot = Current_month_tot;
        this.last_tot = last_tot;
    }

    public String getDoor_no() {
        return door_no;
    }

    public void setDoor_no(String door_no) {
        this.door_no = door_no;
    }

    public List<List<String>> getTime() {
        return time;
    }

    public void setTime(List<List<String>> time) {
        this.time = time;
    }

    public List<Integer> getLast_month_tot() {
        return last_month_tot;
    }

    public void setLast_month_tot(List<Integer> last_month_tot) {
        this.last_month_tot = last_month_tot;
    }

    public List<Integer> getCurrent_month_tot() {
        return Current_month_tot;
    }

    public void setCurrent_month_tot(List<Integer> current_month_tot) {
        Current_month_tot = current_month_tot;
    }

    public List<Integer> getLast_tot() {
        return last_tot;
    }

    public void setLast_tot(List<Integer> last_tot) {
        this.last_tot = last_tot;
    }
}

