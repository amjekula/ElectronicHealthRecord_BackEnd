package mjeks.athenkosi.service.employee.impl;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.repository.employee.StaffRepository;
import mjeks.athenkosi.service.employee.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Set<Staff> getAll() {
        return this.staffRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Staff create(Staff staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public Staff read(String staffId) {
        return this.staffRepository.findById(staffId).orElse(null);
    }

    @Override
    public Staff update(Staff staff) {
        if(this.staffRepository.existsById(staff.getStaffId())){
            return this.staffRepository.save(staff);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String staffId) {
        this.staffRepository.deleteById(staffId);
    }
}
