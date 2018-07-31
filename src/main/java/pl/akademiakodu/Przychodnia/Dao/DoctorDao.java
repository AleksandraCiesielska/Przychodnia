package pl.akademiakodu.Przychodnia.Dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.Przychodnia.Model.Doctor;

public interface DoctorDao extends CrudRepository < Doctor, Integer >
{

}
