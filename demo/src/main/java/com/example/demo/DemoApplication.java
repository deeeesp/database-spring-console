package com.example.demo;

import com.example.demo.DAO.WorkerDAO;
import com.example.demo.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private WorkerDAO workerDAO;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Worker worker = new Worker();
		worker.setName("vds");
		worker.setTelephone("vdfdvfd");
		workerDAO.save(worker);
	}
}
