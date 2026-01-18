/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package my.app.activity08.service;

import java.util.List;
import my.app.activity08.entity.Album;


public interface AlbumService {
   List<Album> getAlbums();
   Album getAlbumById(Integer id);
}
