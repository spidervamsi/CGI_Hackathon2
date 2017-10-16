package com.stackroute.movieapp1.Getservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.stackroute.movieapp1.model.MovieModel;
import com.stackroute.movieapp1.repository.MovieRdmsRepo;

@Service
public class dbMovieService implements MovieService{



	@Autowired
	MovieRdmsRepo movieRdmsrepo;
	
	   
	    public MovieModel add(MovieModel moviemodel)
	   {
		   movieRdmsrepo.save(moviemodel);
	       return moviemodel;
	   }
	    
	    @Override
	   public String delete(String id)
	   {
		   movieRdmsrepo.delete(id);
		   return null;
	   }
	    
	  



	@Override
	public List<MovieModel> getAllMovie() {
		// TODO Auto-generated method stub
		return (List<MovieModel>) movieRdmsrepo.findAll();
	}
	
	

}




