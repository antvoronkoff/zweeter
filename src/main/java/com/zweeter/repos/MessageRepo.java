package com.zweeter.repos;

import org.springframework.data.repository.CrudRepository;
import com.zweeter.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);

}
