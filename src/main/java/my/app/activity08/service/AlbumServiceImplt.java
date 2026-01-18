package my.app.activity08.service;

import java.util.List;
import my.app.activity08.entity.Album;
import my.app.activity08.repository.AlbumRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AlbumServiceImplt implements AlbumService{
    private final AlbumRepository albumRepository;

    public AlbumServiceImplt(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
    @Override
    public List<Album> getAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public Album getAlbumById(Integer id) {
        return albumRepository.getReferenceById(id);
    }
    
}
