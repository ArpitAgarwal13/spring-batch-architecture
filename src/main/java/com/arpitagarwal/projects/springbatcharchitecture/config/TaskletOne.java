package com.arpitagarwal.projects.springbatcharchitecture.config;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TaskletOne implements Tasklet{
	


	/**
	 * Default method of tasklet class
	 */
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("Reaching Tasklet One");
		return RepeatStatus.FINISHED;
	}
}
