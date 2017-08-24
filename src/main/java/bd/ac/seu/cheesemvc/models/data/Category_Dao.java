package bd.ac.seu.cheesemvc.models.data;

import bd.ac.seu.cheesemvc.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface Category_Dao extends CrudRepository<Category,Integer> {
}
