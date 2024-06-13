package com.youssup.clubrating.repositories;

import com.youssup.clubrating.models.Club;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClubRepository extends MongoRepository<Club, Integer> {
}