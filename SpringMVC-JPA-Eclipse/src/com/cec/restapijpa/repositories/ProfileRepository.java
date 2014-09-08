/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cec.restapijpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cec.restapijpa.domain.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
	
	public List<Profile> findByEmail(String email);

}
