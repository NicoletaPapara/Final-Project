package com.app.bikesharing.dao;

import com.app.bikesharing.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddBikeDAO extends CrudRepository<Bike, Integer>, JpaRepository<Bike, Integer> {

//    User findByEmail(String email);
    List<Bike> findByUserId(int userId);


}
