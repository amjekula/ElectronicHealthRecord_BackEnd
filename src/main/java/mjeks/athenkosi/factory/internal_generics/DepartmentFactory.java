package mjeks.athenkosi.factory.internal_generics;

import mjeks.athenkosi.entity.internal_generics.Department;
import mjeks.athenkosi.util.GenericHelper;

public class DepartmentFactory {

    public static Department createDepartment(String depName, String addedBy, String addedOn){

        Department department = new Department.DepartmentBuilder()
                .setDepNo(GenericHelper.generateId())
                .setDepName(depName)
                .setAddedBy(addedBy)
                .setAddedOn(addedOn)
                .build();

        return department;
    }
}
