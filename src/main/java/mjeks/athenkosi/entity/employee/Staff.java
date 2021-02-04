package mjeks.athenkosi.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Staff implements Serializable {

    @Id
    private String staffId;
    private String firstName, lastName, middleName, qualification,
                    deptId, accessLevel, addedBy;
    private Date joiningDate;

    protected Staff() {
    }

    private Staff(StaffBuilder staffBuilder) {
        this.staffId = staffBuilder.staffId;
        this.firstName = staffBuilder.firstName;
        this.lastName = staffBuilder.lastName;
        this.middleName = staffBuilder.middleName;
        this.qualification = staffBuilder.qualification;
        this.deptId = staffBuilder.deptId;
        this.accessLevel = staffBuilder.accessLevel;
        this.addedBy = staffBuilder.addedBy;
        this.joiningDate = staffBuilder.joiningDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDeptId() {
        return deptId;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public static class StaffBuilder {
        private String staffId, firstName, lastName, middleName, qualification,
                deptId, accessLevel, addedBy;
        private Date joiningDate;

        public StaffBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public StaffBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StaffBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StaffBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public StaffBuilder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public StaffBuilder setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }

        public StaffBuilder setAccessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        public StaffBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public StaffBuilder setJoiningDate(Date joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public StaffBuilder copy(Staff staff){
            this.staffId = staff.staffId;
            this.firstName = staff.firstName;
            this.lastName = staff.lastName;
            this.middleName = staff.middleName;
            this.qualification = staff.qualification;
            this.deptId = staff.deptId;
            this.accessLevel = staff.accessLevel;
            this.addedBy = staff.addedBy;
            this.joiningDate = staff.joiningDate;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }
}
