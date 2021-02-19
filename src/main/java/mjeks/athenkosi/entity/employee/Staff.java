package mjeks.athenkosi.entity.employee;

import mjeks.athenkosi.entity.internal_generics.Department;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Staff implements Serializable {

    @Id
    private String staffId;
    private String firstName, lastName, idNumber, password, qualification,
                    /*deptId,*/ accessLevel, addedBy;
    private Date joiningDate;
    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    private Department department;

    @OneToMany(mappedBy="staff", cascade = CascadeType.ALL)
    Set<Doctor> doctors = new HashSet<Doctor>();

   /* @OneToMany(mappedBy="staff", cascade = CascadeType.ALL)
    Set<StaffLogin> staffLoginSet = new HashSet<StaffLogin>();*/

    protected Staff() {
    }

    private Staff(StaffBuilder staffBuilder) {
        this.staffId = staffBuilder.staffId;
        this.firstName = staffBuilder.firstName;
        this.lastName = staffBuilder.lastName;
        this.idNumber = staffBuilder.idNumber;
        this.password = staffBuilder.password;
        this.qualification = staffBuilder.qualification;
        //this.deptId = staffBuilder.deptId;
        this.department = staffBuilder.department;
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

    public String getIdNumber() {
        return idNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getQualification() {
        return qualification;
    }

    /*public String getDeptId() {
        return deptId;
    }*/

    public Department getDepartment() {
        return department;
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
        private String staffId, firstName, lastName, idNumber, password, qualification,
                /*deptId,*/ accessLevel, addedBy;
        private Department department;
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

        public StaffBuilder setIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public StaffBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public StaffBuilder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        /*public StaffBuilder setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }*/

        public StaffBuilder setDepartment(Department department) {
            this.department = department;
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
            this.idNumber = staff.idNumber;
            this.password = staff.password;
            this.qualification = staff.qualification;
            //this.deptId = staff.deptId;
            this.department = staff.department;
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
