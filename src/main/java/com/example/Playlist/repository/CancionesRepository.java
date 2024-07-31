package com.example.Playlist.repository;

import com.example.Playlist.model.Canciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancionesRepository extends JpaRepository<Canciones,Long> {
}
