package springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Topic topic = (Topic) o;

		if (getId() != null ? !getId().equals(topic.getId()) : topic.getId() != null) return false;
		if (getName() != null ? !getName().equals(topic.getName()) : topic.getName() != null) return false;
		return getDescription() != null ? getDescription().equals(topic.getDescription()) : topic.getDescription() == null;
	}

	@Override
	public int hashCode() {
		int result = getId() != null ? getId().hashCode() : 0;
		result = 31 * result + (getName() != null ? getName().hashCode() : 0);
		result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
		return result;
	}
}
