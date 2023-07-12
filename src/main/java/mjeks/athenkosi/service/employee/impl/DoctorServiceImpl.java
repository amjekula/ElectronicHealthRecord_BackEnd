package mjeks.athenkosi.service.employee.impl;

import mjeks.athenkosi.entity.employee.Doctor;
import mjeks.athenkosi.repository.employee.DoctorRepository;
import mjeks.athenkosi.service.employee.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Set<Doctor> getAll() {
        return new HashSet<>(this.doctorRepository.findAll());
    }

    @Override
    public Doctor create(Doctor doctor) {
        return this.doctorRepository.save(doctor);
    }

    @Override
    public Doctor read(String doctorId) {
        return this.doctorRepository.findById(doctorId).orElseGet(null);
    }

    @Override
    public Doctor update(Doctor doctor) {
        if(this.doctorRepository.existsById(doctor.getDoctorNo())){
            return this.doctorRepository.save(doctor);
        }else {
            return null;
        }
    }

    @Override
    public void delete(String doctorId) {
        this.doctorRepository.deleteById(doctorId);
    }
}
