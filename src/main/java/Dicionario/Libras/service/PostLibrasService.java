package Dicionario.Libras.service;

import Dicionario.Libras.model.PostLibras;
import java.util.List;
import java.util.Optional;

public interface PostLibrasService {
    public List<PostLibras> findAll();
    public Optional<List<PostLibras>> findByNameObject(String nameObject);

    public Optional<List<PostLibras>>findByCategoria(String categoria);
}
