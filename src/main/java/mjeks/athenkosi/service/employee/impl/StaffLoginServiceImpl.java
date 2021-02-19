package mjeks.athenkosi.service.employee.impl;

import mjeks.athenkosi.entity.employee.Staff;
import mjeks.athenkosi.entity.employee.StaffLogin;
import mjeks.athenkosi.repository.employee.StaffLoginRepository;
import mjeks.athenkosi.service.employee.StaffLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StaffLoginServiceImpl implements StaffLoginService {

    @Autowired
    private StaffLoginRepository staffRepository;

    @Override
    public Set<StaffLogin> getAll() {
        return this.staffRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public StaffLogin create(StaffLogin staffLogin) {
        return this.staffRepository.save(staffLogin);
    }

    @Override
    public StaffLogin read(String loginNumber) {
        return this.staffRepository.findById(loginNumber).orElse(null);
    }

    @Override
    public StaffLogin update(StaffLogin staffLogin) {
        if(this.staffRepository.existsById(staffLogin.getLoginNumber())){
            return this.staffRepository.save(staffLogin);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String loginNumber) {
        this.staffRepository.deleteById(loginNumber);
    }
}
