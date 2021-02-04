package mjeks.athenkosi.factory.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Department;

public class DepartmentFactory {

    public static Department createDepartment(String depNo, String depName, String addedBy, String addedOn){

        Department department = new Department.DepartmentBuilder()
                .setDepNo(depNo)
                .setDepName(depName)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .build();

        return department;
    }
}
