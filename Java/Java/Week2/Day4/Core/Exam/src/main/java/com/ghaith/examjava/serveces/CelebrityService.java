package com.ghaith.examjava.serveces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.examjava.models.Celebrity;
import com.ghaith.examjava.models.User;
import com.ghaith.examjava.repositories.CelebrityRepo;

@Service
public class CelebrityService {
	@Autowired
	private CelebrityRepo celebrityRepo;
	
//	Create 
	public Celebrity createCelebrity(Celebrity celebrity) {
		return celebrityRepo.save(celebrity);
	}
	public List<User> getAssignedCelebritys(Long id){
		Optional<Celebrity> optCelebrity= celebrityRepo.findById(id);
		if(optCelebrity.isPresent()) {
			Celebrity c= optCelebrity.get();
			return c.getUsers();
		}
		else {
		return null;
		}
	}
	
	public List<Celebrity> getUnassignedCelebritys(User user){
		return celebrityRepo.findByUsersNotContains(user);
	}
//  READ ALL
	public Celebrity findCelebrityById(Long id) {
		Optional<Celebrity> optCelebrity= celebrityRepo.findById(id);
		if(optCelebrity.isPresent()) {
			return optCelebrity.get();
		}
		else {
		return null;
		}
	}
//	READ ALL
	public List<Celebrity> allCelebritys(){
		return celebrityRepo.findAll();
	}
	//edit
    public Celebrity updateCelebrity(Celebrity celebrity) {
        return celebrityRepo.save(celebrity);
    }

    //delete
    public void deleteCelebrity(Long id) {
        celebrityRepo.deleteById(id);
    }
}

