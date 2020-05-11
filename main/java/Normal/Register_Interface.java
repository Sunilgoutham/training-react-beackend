package Normal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Register_Interface extends JpaRepository<Register_values, Integer>{

}
