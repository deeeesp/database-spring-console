package com.example.demo;

import com.example.demo.DAO.FlatDAO;
import com.example.demo.DAO.WorkerDAO;
import com.example.demo.entity.Flat;
import com.example.demo.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private WorkerDAO workerDAO;
	@Autowired
	private FlatDAO flatDAO;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		Worker worker = new Worker();
//		worker.setName("vds");
//		worker.setTelephone("vdfdvfd");
//		workerDAO.save(worker);
//		Flat flat = new Flat();
//		flat.setFloor(4);
//		flat.setMeters(87);
//		flat.setRooms(2);
//		flat.setWorker(workerDAO.getById(0));
		Worker worker =workerDAO.getById(1);
		System.out.println(worker.toString());
	}
}
