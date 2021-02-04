package mjeks.athenkosi.repository;

@Deprecated
public interface IRepository<Type, ID> {
    Type create(Type type);
    Type read(ID id);
    Type update(Type type);
    void delete(ID id);
}
