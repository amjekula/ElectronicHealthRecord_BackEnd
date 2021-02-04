package mjeks.athenkosi.service.patient.impl;

import mjeks.athenkosi.entity.patient.NextOfKin;
import mjeks.athenkosi.repository.patient.NextOfKinRepository;
import mjeks.athenkosi.service.patient.NextOfKinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NextOfKinServiceImpl implements NextOfKinService {

    @Autowired
    private NextOfKinRepository nextOfKinRepository;

    @Override
    public Set<NextOfKin> getAll() {
        return this.nextOfKinRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public NextOfKin create(NextOfKin nextOfKin) {
        return this.nextOfKinRepository.save(nextOfKin);
    }

    @Override
    public NextOfKin read(String nextOfKinId) {
        return this.nextOfKinRepository.findById(nextOfKinId).orElse(null);
    }

    @Override
    public NextOfKin update(NextOfKin nextOfKin) {
        if(this.nextOfKinRepository.existsById(nextOfKin.getNextOfKinNo())){
            return this.nextOfKinRepository.save(nextOfKin);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String nextOfKinId) {
        this.nextOfKinRepository.deleteById(nextOfKinId);
    }
}
