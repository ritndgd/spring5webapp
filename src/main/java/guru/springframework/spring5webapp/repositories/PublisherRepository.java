package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/28/20
 * Time: 12:05 AM
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
