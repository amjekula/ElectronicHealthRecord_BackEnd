package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.StaffLogin;
import mjeks.athenkosi.util.GenericHelper;

public class StaffLoginFactory {

    public static StaffLogin createStaffLogin(String loginDate, String logoutTime){

        StaffLogin staffLogin = new StaffLogin.StaffLoginBuilder()
                .setLoginNumber(GenericHelper.generateId())
                .setLoginDate(loginDate)
                .setLogoutTime(logoutTime)
                .build();

        return staffLogin;
    }
}
