package com.cg.repos;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeRepository {
	Trainee addTrainee(Trainee trainee);
	Trainee getTrainee(int id);
	void delete(int id);
	 Trainee findId(int traineeId);
	  void modify(Trainee trainee);
	  public List<Trainee> findAll();
}
