package collections;

import java.util.Set;

public class Employee {
	
	 private int id;
	    private String name;
	    private Set<Project> projects;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Project> getProjects() {
			return projects;
		}
		public void setProjects(Set<Project> projects) {
			this.projects = projects;
		}
		public Employee(int id, String name, Set<Project> projects) {
			super();
			this.id = id;
			this.name = name;
			this.projects = projects;
		}
		public Employee() {
			super();
		}
		
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((projects == null) ? 0 : projects.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (projects == null) {
				if (other.projects != null)
					return false;
			} else if (!projects.equals(other.projects))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", projects=" + projects + "]";
		}
	    
	    
	    
	    

}
