package in.ltpl.addorganization.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AddOrganization {
	
	@Id
	private Integer organisationsid;
	
	
	private String organisationfullname;
	
	
	private String organisationshortname;

	public AddOrganization() {
		super();
	}

	public Integer getOrganisationsid() {
		return organisationsid;
	}

	public void setOrganisationsid(Integer organisationsid) {
		this.organisationsid = organisationsid;
	}

	public String getOrganisationfullname() {
		return organisationfullname;
	}

	public void setOrganisationfullname(String organisationfullname) {
		this.organisationfullname = organisationfullname;
	}

	public String getOrganisationshortname() {
		return organisationshortname;
	}

	public void setOrganisationshortname(String organisationshortname) {
		this.organisationshortname = organisationshortname;
	}

	@Override
	public String toString() {
		return "AddOrganization [organisationsid=" + organisationsid + ", organisationfullname=" + organisationfullname
				+ ", organisationshortname=" + organisationshortname + "]";
	}

	
	
	

}
