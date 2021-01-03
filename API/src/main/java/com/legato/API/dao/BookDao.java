package com.legato.API.dao;

import com.legato.API.models.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Books,Integer>{
}
