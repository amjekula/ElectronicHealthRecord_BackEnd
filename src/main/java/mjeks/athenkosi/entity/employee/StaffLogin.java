package mjeks.athenkosi.entity.employee;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class StaffLogin implements Serializable {

    @Id
    private String loginNumber;
    private String loginDate, logoutTime;

    protected StaffLogin() {
    }

    private StaffLogin(StaffLoginBuilder staffLoginBuilder) {
        this.loginNumber = staffLoginBuilder.loginNumber;
        this.loginDate = staffLoginBuilder.loginDate;
        this.logoutTime = staffLoginBuilder.logoutTime;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public String getLogoutTime() {
        return logoutTime;
    }

    public static class StaffLoginBuilder{
        private String loginNumber, loginDate, logoutTime;

        public StaffLoginBuilder setLoginNumber(String loginNumber) {
            this.loginNumber = loginNumber;
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
            this.loginNumber = staffLogin.loginNumber;
            this.loginDate = staffLogin.loginDate;
            this.logoutTime = staffLogin.logoutTime;
            return this;
        }

        public StaffLogin build(){
            return new StaffLogin(this);
        }
    }
}
