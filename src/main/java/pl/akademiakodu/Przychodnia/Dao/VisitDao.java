package pl.akademiakodu.Przychodnia.Dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.Przychodnia.Model.Visit;

public interface VisitDao extends CrudRepository <Visit, Integer>
{

}
