package com.youssup.clubrating.services;

import java.util.List;
import com.youssup.clubrating.models.Club;
import com.youssup.clubrating.repositories.ClubRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//club routes
@Service
public class ClubServices {
    @Autowired
    private ClubRepository clubRepository;
    
    // Retrieve all clubs
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    // Add a new club
    public Club addClub(Club club) {
        return clubRepository.save(club);
    }

    // Update an existing club
    public Club updateClub(Club club) {
        return clubRepository.save(club);
    }

    // Delete a club by ID
    public void deleteClub(int id) {
        clubRepository.deleteById(id);
    }

}
