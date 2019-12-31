package guru.springframework.spring5webapp.reposetories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
