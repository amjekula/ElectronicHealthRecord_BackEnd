package mjeks.athenkosi.factory.employee;

import mjeks.athenkosi.entity.employee.StaffLogin;

public class StaffLoginFactory {

    public static StaffLogin createStaffLogin(String staffNo, String username, String password,
                                              String loginDate, String logoutTime){

        StaffLogin staffLogin = new StaffLogin.StaffLoginBuilder()
                .setStaffNo(staffNo)
                .setUsername(username)
                .setPassword(password)
                .setLoginDate(loginDate)
                .setLogoutTime(logoutTime)
                .build();

        return staffLogin;
    }
}
