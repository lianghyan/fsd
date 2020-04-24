package net.fsd.training.service;

import java.util.List;

import net.fsd.entity.Training;
import net.fsd.model.TrainingDtls;

public interface ITrainingService {

	List<TrainingDtls> listTraining();

	void deleteTraining(long id);

	void updateTraining(Training tr);

	Training addTraining(Training tr);
	
	public TrainingDtls findById(long id);

}
