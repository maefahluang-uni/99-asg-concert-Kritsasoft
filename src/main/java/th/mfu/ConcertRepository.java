package th.mfu;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import th.mfu.domain.Concert;


public interface ConcertRepository extends CrudRepository<Concert, Long> {
     
}