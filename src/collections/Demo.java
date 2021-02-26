package collections;

import java.time.LocalDate;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project Abacus = new Project(1,"Abacus",LocalDate.of(2020, 12, 18));
		Project Integration  = new Project(2,"Integration",LocalDate.of(2019, 4, 3));
		Set<Project> projects  = new HashSet<>();
		projects.add(Abacus);
		projects.add(Integration);
		Employee mitali  = new Employee(11,"Mitali");
		Employee amey  = new Employee(11,"Amey");
		Employee sarthak = new Employee(11,"Sarthak");
		Employee rishav  = new Employee(11,"Rishav");
		
		
		
		mitali.setProjects(projects);
		amey.setProjects(projects);
		sarthak.setProjects(projects);
		rishav.setProjects(projects);
		
		Iterator<Project> itr = projects.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
