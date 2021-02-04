//package mjeks.athenkosi.repository.patient.impl;
//
//import mjeks.athenkosi.entity.patient.PatientLogin;
//import mjeks.athenkosi.repository.patient.PatientLoginRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class PatientLoginImpl implements PatientLoginRepository {
//
//    private static Set<PatientLogin> patientLoginDB;
//    private static PatientLoginRepository patientLoginRepository = null;
//
//    public PatientLoginImpl(){
//        patientLoginDB = new HashSet<>();
//    }
//
//    public PatientLoginRepository getPatientLoginRepository(){
//        if(patientLoginRepository == null){
//            patientLoginRepository = new PatientLoginImpl();
//        }
//        return patientLoginRepository;
//    }
//
//    @Override
//    public Set<PatientLogin> getAll() {
//        return patientLoginDB;
//    }
//
//    @Override
//    public PatientLogin create(PatientLogin patientLogin) {
//        patientLoginDB.add(patientLogin);
//        return patientLogin;
//    }
//
//    @Override
//    public PatientLogin read(String id) {
//        PatientLogin patientLogin = null;
//
//        for(PatientLogin findPatientLogin: patientLoginDB){
//            if(findPatientLogin.getPatientNo().equalsIgnoreCase(id)){
//                patientLogin = findPatientLogin;
//                break;
//            }
//        }
//        return patientLogin;
//    }
//
//    @Override
//    public PatientLogin update(PatientLogin patientLogin) {
//        PatientLogin oldPatientLogin = read(patientLogin.getPatientNo());
//
//        if(oldPatientLogin != null){
//            patientLoginDB.remove(oldPatientLogin);
//            patientLoginDB.add(patientLogin);
//        }
//        return patientLogin;
//    }
//
//    @Override
//    public void delete(String id) {
//        PatientLogin patientLogin = read(id);
//
//        if(patientLogin != null){
//            patientLoginDB.remove(patientLogin);
//        }
//    }
//}
