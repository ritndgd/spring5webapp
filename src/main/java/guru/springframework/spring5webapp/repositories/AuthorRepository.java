package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/27/20
 * Time: 2:24 AM
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
