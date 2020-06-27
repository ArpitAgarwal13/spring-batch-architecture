package com.arpitagarwal.projects.springbatcharchitecture.config;
 
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 
@Configuration
@EnableBatchProcessing
public class BatchConfig {
     
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
 
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
 
 
    @Bean
    public Job jobOne() {
        return jobBuilderFactory
                .get("jobOne")
                .incrementer(new RunIdIncrementer())
                .start(stepOne())
                .next(stepTwo())
                .build();
    }
    
    @Bean
    public Step stepOne() {
    	return stepBuilderFactory.get("stepOne")
    			.tasklet(new TaskletOne())
    			.build();
    }
 
    @Bean
    public Step stepTwo() {
    	return stepBuilderFactory.get("stepTwo")
    			.tasklet(new TaskletTwo())
    			.build();
    }
}