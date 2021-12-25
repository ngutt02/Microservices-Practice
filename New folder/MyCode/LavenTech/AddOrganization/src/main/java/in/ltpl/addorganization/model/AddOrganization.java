package in.ltpl.addorganization.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AddOrganization {

	 @NotNull 
	private Integer organisationsid;

	 @NotEmpty 
	private String organisationfullname;

	 @NotEmpty 
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
