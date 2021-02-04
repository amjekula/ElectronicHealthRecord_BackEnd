//package mjeks.athenkosi.repository.employee.impl;
//
//import mjeks.athenkosi.entity.employee.Staff;
//import mjeks.athenkosi.repository.employee.StaffRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class StaffRepositoryImpl implements StaffRepository {
//
//    private Set<Staff> staffDB;
//    private static StaffRepository staffRepository = null;
//
//    public StaffRepositoryImpl(){
//        this.staffDB = new HashSet<>();
//    }
//
//    public static StaffRepository getStaffRepository(){
//        if(staffRepository == null){
//            staffRepository = new StaffRepositoryImpl();
//        }
//        return staffRepository;
//    }
//
//    @Override
//    public Set<Staff> getAll() {
//        return this.staffDB;
//    }
//
//    @Override
//    public Staff create(Staff staff) {
//        this.staffDB.add(staff);
//        return staff;
//    }
//
//    @Override
//    public Staff read(String staffId) {
//        Staff staff = null;
//
//        for(Staff findStaff: staffDB){
//            if(findStaff.getStaffId().equalsIgnoreCase(staffId)){
//                staff = findStaff;
//                break;
//            }
//        }
//        return staff;
//    }
//
//    @Override
//    public Staff update(Staff staff) {
//        Staff oldStaff = read(staff.getStaffId());
//
//        if(oldStaff != null){
//            staffDB.remove(oldStaff);
//            staffDB.add(staff);
//        }
//        return staff;
//    }
//
//    @Override
//    public void delete(String staffId) {
//        Staff staff = read(staffId);
//
//        if(staff != null){
//            staffDB.remove(staff);
//        }
//    }
//}
