package mjeks.athenkosi.service.patient;

import mjeks.athenkosi.entity.patient.Appointment;
import mjeks.athenkosi.service.IService;

import java.util.Set;

public interface AppointmentService extends IService<Appointment, String> {
    Set<Appointment> getAll();
}
