
package ams;

import java.time.LocalDate;
import java.util.Date;


public class Course_Enrollment {
    
    private String c_code;
    private String sid;
    private LocalDate date;
    private String time;
    private String status;

    public Course_Enrollment(String c_code, String sid, LocalDate date, String time, String status) {
        this.c_code = c_code;
        this.sid = sid;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    public String getC_code() {
        return c_code;
    }

    public String getSid() {
        return sid;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
    

    
}
