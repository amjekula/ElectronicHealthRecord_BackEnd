package mjeks.athenkosi.service.patient.impl;

import mjeks.athenkosi.entity.patient.Appointment;
import mjeks.athenkosi.repository.patient.AppointmentRepository;
import mjeks.athenkosi.service.patient.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Set<Appointment> getAll() {
        return this.appointmentRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Appointment create(Appointment appointment) {
        return this.appointmentRepository.save(appointment);
    }

    @Override
    public Appointment read(String appointmentId) {
        return this.appointmentRepository.findById(appointmentId).orElse(null);
    }

    @Override
    public Appointment update(Appointment appointment) {
        if(this.appointmentRepository.existsById(appointment.getAppId())){
            return this.appointmentRepository.save(appointment);
        }else{
            return null;
        }
    }

    @Override
    public void delete(String appointmentId) {
        this.appointmentRepository.deleteById(appointmentId);
    }
}
