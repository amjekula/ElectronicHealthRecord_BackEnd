//package mjeks.athenkosi.repository.patient.impl;
//
//import mjeks.athenkosi.entity.patient.PatientBMI;
//import mjeks.athenkosi.repository.patient.PatientBMIRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class PatientBMIRepositoryImpl implements PatientBMIRepository {
//
//    private static Set<PatientBMI> patientBMIDB;
//    private static PatientBMIRepository patientBMIRepository = null;
//
//    public PatientBMIRepositoryImpl(){
//        patientBMIDB = new HashSet<>();
//    }
//
//    public PatientBMIRepository getPatientBMIRepository(){
//        if(patientBMIRepository == null){
//            patientBMIRepository = new PatientBMIRepositoryImpl();
//        }
//        return patientBMIRepository;
//    }
//
//    @Override
//    public Set<PatientBMI> getAll() {
//        return patientBMIDB;
//    }
//
//    @Override
//    public PatientBMI create(PatientBMI patientBMI) {
//        this.patientBMIDB.add(patientBMI);
//        return patientBMI;
//    }
//
//    @Override
//    public PatientBMI read(String id) {
//        PatientBMI patientBMI = null;
//
//        for(PatientBMI findPatientBMI: patientBMIDB){
//            if(findPatientBMI.getPatientNo().equalsIgnoreCase(id)){
//                patientBMI = findPatientBMI;
//                break;
//            }
//        }
//        return patientBMI;
//    }
//
//    @Override
//    public PatientBMI update(PatientBMI patientBMI) {
//        PatientBMI oldPatientBMI = read(patientBMI.getPatientNo());
//
//        if(oldPatientBMI != null){
//            patientBMIDB.remove(oldPatientBMI);
//            patientBMIDB.add(patientBMI);
//        }
//        return patientBMI;
//    }
//
//    @Override
//    public void delete(String id) {
//        PatientBMI patientBMI = read(id);
//
//        if(patientBMI != null){
//            patientBMIDB.remove(patientBMI);
//        }
//    }
//}
