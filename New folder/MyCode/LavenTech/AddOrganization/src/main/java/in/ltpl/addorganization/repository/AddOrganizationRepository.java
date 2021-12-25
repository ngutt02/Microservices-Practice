package in.ltpl.addorganization.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ltpl.addorganization.entity.AddOrganization;

@Repository
public interface AddOrganizationRepository extends JpaRepository<AddOrganization, Integer> {
	
	
	  List<in.ltpl.addorganization.entity.AddOrganization> findByOrganisationshortname(String organisationshortname);
	 

}
