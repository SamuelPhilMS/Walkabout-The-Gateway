package org.launchcode.walkabout.data;

import org.launchcode.walkabout.models.User;
import org.launchcode.walkabout.models.dto.UserJournal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends CrudRepository<UserJournal, Integer> {

}

