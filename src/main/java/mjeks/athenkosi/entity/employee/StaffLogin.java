package mjeks.athenkosi.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class StaffLogin implements Serializable {

    @Id
    private String staffNo;
    private String username, password, loginDate, logoutTime;

    protected StaffLogin() {
    }

    private StaffLogin(StaffLoginBuilder staffLoginBuilder) {
        this.staffNo = staffLoginBuilder.staffNo;
        this.username = staffLoginBuilder.username;
        this.password = staffLoginBuilder.password;
        this.loginDate = staffLoginBuilder.loginDate;
        this.logoutTime = staffLoginBuilder.logoutTime;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public String getLogoutTime() {
        return logoutTime;
    }

    public static class StaffLoginBuilder{
        private String staffNo, username, password, loginDate, logoutTime;

        public StaffLoginBuilder setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            return this;
        }

        public StaffLoginBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public StaffLoginBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public StaffLoginBuilder setLoginDate(String loginDate) {
            this.loginDate = loginDate;
            return this;
        }

        public StaffLoginBuilder setLogoutTime(String logoutTime) {
            this.logoutTime = logoutTime;
            return this;
        }

        public StaffLoginBuilder copy(StaffLogin staffLogin){
            this.staffNo = staffLogin.staffNo;
            this.username = staffLogin.username;
            this.password = staffLogin.password;
            this.loginDate = staffLogin.loginDate;
            this.logoutTime = staffLogin.logoutTime;
            return this;
        }

        public StaffLogin build(){
            return new StaffLogin(this);
        }
    }
}
