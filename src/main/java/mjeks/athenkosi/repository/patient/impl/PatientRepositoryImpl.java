//package mjeks.athenkosi.repository.patient.impl;
//
//import mjeks.athenkosi.entity.patient.Patient;
//import mjeks.athenkosi.repository.patient.PatientRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class PatientRepositoryImpl implements PatientRepository {
//
//    private Set<Patient> patientDB;
//    private static PatientRepository patientRepository = null;
//
//    public PatientRepositoryImpl() {
//        this.patientDB = new HashSet<>();
//    }
//
//    public static PatientRepository getPatientRepository(){
//        if(patientRepository == null){
//            patientRepository = new PatientRepositoryImpl();
//        }
//        return patientRepository;
//    }
//
//    @Override
//    public Set<Patient> getAll() {
//        return this.patientDB;
//    }
//
//    @Override
//    public Patient create(Patient patient) {
//        this.patientDB.add(patient);
//        return patient;
//    }
//
//    @Override
//    public Patient read(String patientId) {
//        Patient patient = null;
//
//        for(Patient findPatient : patientDB){
//            if(findPatient.getPatientNo().equalsIgnoreCase(patientId)){
//                patient = findPatient;
//                break;
//            }
//        }
//        return patient;
//    }
//
//    @Override
//    public Patient update(Patient patient) {
//        Patient oldPatient = read(patient.getPatientNo());
//
//        if(oldPatient != null){
//            this.patientDB.remove(oldPatient);
//            this.patientDB.add(patient);
//        }
//        return patient;
//    }
//
//    @Override
//    public void delete(String patientId) {
//        Patient patient = read(patientId);
//
//        if(patient != null){
//            this.patientDB.remove(patient);
//        }
//    }
//}
