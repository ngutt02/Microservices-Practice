package com.sathyatel.frienddetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathyatel.frienddetails.entity.FriendDetails;
@Repository
public interface FriendDetailsRepository extends JpaRepository<FriendDetails,Integer> {

}
