package mjeks.athenkosi.entity.internal_generics;

import mjeks.athenkosi.entity.employee.Staff;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Department implements Serializable {

    @Id
    private String depNo;
    private String depName, addedBy, addedOn;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "department")
    private Staff staff;

    protected Department() {
    }

    private Department(DepartmentBuilder departmentBuilder) {
        this.depNo = departmentBuilder.depNo;
        this.depName = departmentBuilder.depName;
        this.addedBy = departmentBuilder.addedBy;
        this.addedOn = departmentBuilder.addedOn;
    }


    public String getDepNo() {
        return depNo;
    }

    public String getDepName() {
        return depName;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public static class DepartmentBuilder{
        private String depNo, depName, addedBy, addedOn;

        public DepartmentBuilder setDepNo(String depNo) {
            this.depNo = depNo;
            return this;
        }

        public DepartmentBuilder setDepName(String depName) {
            this.depName = depName;
            return this;
        }

        public DepartmentBuilder setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public DepartmentBuilder setAddedOn(String addedOn) {
            this.addedOn = addedOn;
            return this;
        }

        public DepartmentBuilder copy(Department department){
            this.depNo = department.depNo;
            this.depName = department.depName;
            this.addedBy = department.addedBy;
            this.addedOn = department.addedOn;
            return this;
        }

        public Department build(){
            return new Department(this);
        }
    }
}
