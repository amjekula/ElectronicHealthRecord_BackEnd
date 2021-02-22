package mjeks.athenkosi.entity.employee;

import mjeks.athenkosi.entity.external_generics.Address;
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
                    accessLevel, addedBy;
    private Date joiningDate;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    private Department department;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy="staff", cascade = CascadeType.ALL)
    Set<Doctor> doctors = new HashSet<Doctor>();

    protected Staff() {
    }

    private Staff(StaffBuilder staffBuilder) {
        this.staffId = staffBuilder.staffId;
        this.firstName = staffBuilder.firstName;
        this.lastName = staffBuilder.lastName;
        this.idNumber = staffBuilder.idNumber;
        this.address = staffBuilder.address;
        this.password = staffBuilder.password;
        this.qualification = staffBuilder.qualification;
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

    public Address getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getQualification() {
        return qualification;
    }

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
                accessLevel, addedBy;
        private Department department;
        private Address address;
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

        public StaffBuilder setAddress(Address address) {
            this.address = address;
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
            this.address = staff.address;
            this.qualification = staff.qualification;
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
