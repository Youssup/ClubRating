package com.youssup.clubrating.controllers;

import com.youssup.clubrating.models.Club;
import com.youssup.clubrating.services.ClubServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {
    @Autowired
    private ClubServices clubService;

    //test server
    @GetMapping("/test")
    public String getTest() {
        return "test";
    }

    // GET request to retrieve all clubs
    @GetMapping
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    // POST request to add a new club
    @PostMapping
    public Club addClub(@RequestBody Club club) {
        return clubService.addClub(club);
    }

    // PUT request to update a club by ID
    @PutMapping("/{id}")
    public Club updateClub(@PathVariable int id, @RequestBody Club club) {
        club.setId(id);
        return clubService.updateClub(club);
    }

    // DELETE request to remove a club by ID
    @DeleteMapping("/{id}")
    public void deleteClub(@PathVariable int id) {
        clubService.deleteClub(id);
    }
}
