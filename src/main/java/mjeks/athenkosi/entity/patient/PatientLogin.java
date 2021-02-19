package mjeks.athenkosi.entity.patient;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class PatientLogin implements Serializable {

    @Id
    private String loginNumber;
    private Date loginDate, logoutTime;


    protected PatientLogin() {
    }

    private PatientLogin(PatientLoginBuilder patientLoginBuilder) {
        this.loginNumber = patientLoginBuilder.loginNumber;
        this.loginDate = patientLoginBuilder.loginDate;
        this.logoutTime = patientLoginBuilder.logoutTime;
    }

    public String getLoginNumber() {
        return loginNumber;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public static class PatientLoginBuilder{
        private String loginNumber;
        private Date loginDate, logoutTime;

        public PatientLoginBuilder setLoginNumber(String loginNumber) {
            this.loginNumber = loginNumber;
            return this;
        }

        public PatientLoginBuilder setLoginDate(Date loginDate) {
            this.loginDate = loginDate;
            return this;
        }

        public PatientLoginBuilder setLogoutTime(Date logoutTime) {
            this.logoutTime = logoutTime;
            return this;
        }

        public PatientLoginBuilder copy(PatientLogin patientLogin){
            this.loginNumber = patientLogin.loginNumber;
            this.loginDate = patientLogin.loginDate;
            this.logoutTime = patientLogin.logoutTime;
            return this;
        }

        public PatientLogin build(){
            return new PatientLogin(this);
        }
    }
}
