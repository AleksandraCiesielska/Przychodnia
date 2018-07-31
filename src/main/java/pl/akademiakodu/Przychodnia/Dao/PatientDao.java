package pl.akademiakodu.Przychodnia.Dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.Przychodnia.Model.Patient;

public interface PatientDao extends CrudRepository <Patient, Integer >
{

}
