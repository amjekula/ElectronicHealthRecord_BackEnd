package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class PatientLogin implements Serializable {

    @Id
    private String patientNo;
    private String username, password, loginDate, logoutTime;


    protected PatientLogin() {
    }

    private PatientLogin(PatientLoginBuilder patientLoginBuilder) {
        this.patientNo = patientLoginBuilder.patientNo;
        this.username = patientLoginBuilder.username;
        this.password = patientLoginBuilder.password;
        this.loginDate = patientLoginBuilder.loginDate;
        this.logoutTime = patientLoginBuilder.logoutTime;
    }

    public String getPatientNo() {
        return patientNo;
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

    public static class PatientLoginBuilder{
        private String patientNo, username, password, loginDate, logoutTime;

        public PatientLoginBuilder setPatientNo(String patientNo) {
            this.patientNo = patientNo;
            return this;
        }

        public PatientLoginBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public PatientLoginBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public PatientLoginBuilder setLoginDate(String loginDate) {
            this.loginDate = loginDate;
            return this;
        }

        public PatientLoginBuilder setLogoutTime(String logoutTime) {
            this.logoutTime = logoutTime;
            return this;
        }

        public PatientLoginBuilder copy(PatientLogin patientLogin){
            this.patientNo = patientLogin.patientNo;
            this.username = patientLogin.username;
            this.password = patientLogin.password;
            this.loginDate = patientLogin.loginDate;
            this.logoutTime = patientLogin.logoutTime;
            return this;
        }

        public PatientLogin build(){
            return new PatientLogin(this);
        }
    }
}
