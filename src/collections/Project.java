package collections;

import java.time.LocalDate;

public class Project {
	
	   private int projectId;
	    private String projectName;
	    private LocalDate startDate;
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public Project(int projectId, String projectName, LocalDate startDate) {
			super();
			this.projectId = projectId;
			this.projectName = projectName;
			this.startDate = startDate;
		}
		public Project() {
			super();
		}
		@Override
		public String toString() {
			return "Project [projectId=" + projectId + ", projectName=" + projectName + ", startDate=" + startDate
					+ "]";
		}
	    
		
	    

}
