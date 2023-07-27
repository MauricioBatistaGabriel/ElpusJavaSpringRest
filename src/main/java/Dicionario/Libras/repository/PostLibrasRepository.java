package Dicionario.Libras.repository;

import Dicionario.Libras.model.PostLibras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostLibrasRepository extends JpaRepository<PostLibras, Long> {
    public Optional<List<PostLibras>> findBynameObject(String nameObject);
    public Optional<List<PostLibras>> findBycategoria(String categoria);
}
