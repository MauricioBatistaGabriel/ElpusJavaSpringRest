package Dicionario.Libras.service;

import Dicionario.Libras.model.PostLibras;
import Dicionario.Libras.repository.PostLibrasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PostLibrasServiceImpl implements PostLibrasService{

    @Autowired
    PostLibrasRepository postLibrasRepository;

    @Override
    public List<PostLibras> findAll() {
        return postLibrasRepository.findAll();
    }

    @Override
    public Optional<List<PostLibras>> findByNameObject(String nameObject) {
        try{
            return postLibrasRepository.findBynameObject(nameObject);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    @Override
    public Optional<List<PostLibras>> findByCategoria(String categoria) {
        try{
            return postLibrasRepository.findBycategoria(categoria);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
