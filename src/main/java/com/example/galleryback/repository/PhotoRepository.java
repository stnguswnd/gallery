package com.example.galleryback.repository;

import com.example.galleryback.entity.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<Photo, Long> {

}
