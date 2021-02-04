//package mjeks.athenkosi.repository.patient.impl;
//
//import mjeks.athenkosi.entity.patient.NextOfKin;
//import mjeks.athenkosi.repository.patient.NextOfKinRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class NextOfKinRepositoryImpl implements NextOfKinRepository {
//    private Set<NextOfKin> nextOfKinDB;
//    private static NextOfKinRepository nextOfKinRepository = null;
//
//    public NextOfKinRepositoryImpl(){
//        this.nextOfKinDB = new HashSet<>();
//    }
//
//    public static NextOfKinRepository getNextOfKinRepository(){
//        if (nextOfKinRepository == null){
//            nextOfKinRepository = new NextOfKinRepositoryImpl();
//        }
//        return nextOfKinRepository;
//    }
//
//    @Override
//    public Set<NextOfKin> getAll() {
//        return this.nextOfKinDB;
//    }
//
//    @Override
//    public NextOfKin create(NextOfKin nextOfKin) {
//        this.nextOfKinDB.add(nextOfKin);
//        return nextOfKin;
//    }
//
//    @Override
//    public NextOfKin read(String nextOfKinId) {
//        NextOfKin nextOfKin = null;
//
//        for(NextOfKin findNextOfKin : nextOfKinDB){
//            if(findNextOfKin.getNextOfKinNo().equalsIgnoreCase(nextOfKinId)){
//                nextOfKin = findNextOfKin;
//                break;
//            }
//        }
//        return nextOfKin;
//    }
//
//    @Override
//    public NextOfKin update(NextOfKin nextOfKin) {
//        NextOfKin oldNextOfKin = read(nextOfKin.getNextOfKinNo());
//
//        if(oldNextOfKin != null){
//            this.nextOfKinDB.remove(oldNextOfKin);
//            this.nextOfKinDB.add(nextOfKin);
//        }
//        return nextOfKin;
//    }
//
//    @Override
//    public void delete(String nextOfKinId) {
//        NextOfKin nextOfKin = read(nextOfKinId);
//
//        if (nextOfKin != null){
//            this.nextOfKinDB.remove(nextOfKin);
//        }
//    }
//}
