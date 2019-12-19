package com.alm.highfi.repository;


import com.alm.highfi.model.Release;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository  extends CrudRepository<Release, Long> {

}
