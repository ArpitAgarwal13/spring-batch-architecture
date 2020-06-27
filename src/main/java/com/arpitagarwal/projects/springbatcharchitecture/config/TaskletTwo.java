package com.arpitagarwal.projects.springbatcharchitecture.config;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * This class contains the code for reading csv file and sending
 * that data to database
 * @author Arpit Agarwal
 *
 */
public class TaskletTwo implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Reaching Tasklet Two");
		/**
		 * Write Required code inside this function
		 */
		return RepeatStatus.FINISHED;
	}

}
