package org.tsn.entity;

// Generated Feb 19, 2015 10:13:35 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TOccupation generated by hbm2java
 */
@Entity
@Table(name = "t_occupation" )
public class TOccupation implements IBaseEntity {

	private static final long serialVersionUID = 2953998328178846167L;
	
	private Integer occupationId;
	private String occupationText;
	private Set<TProfile> TProfiles = new HashSet<TProfile>(0);

	public TOccupation() {
	}

	public TOccupation(String occupationText) {
		this.occupationText = occupationText;
	}

	public TOccupation(String occupationText, Set<TProfile> TProfiles) {
		this.occupationText = occupationText;
		this.TProfiles = TProfiles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "OCCUPATION_ID", unique = true, nullable = false)
	public Integer getOccupationId() {
		return this.occupationId;
	}

	public void setOccupationId(Integer occupationId) {
		this.occupationId = occupationId;
	}

	@Column(name = "OCCUPATION_TEXT", nullable = false, length = 50)
	public String getOccupationText() {
		return this.occupationText;
	}

	public void setOccupationText(String occupationText) {
		this.occupationText = occupationText;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TOccupation")
	public Set<TProfile> getTProfiles() {
		return this.TProfiles;
	}

	public void setTProfiles(Set<TProfile> TProfiles) {
		this.TProfiles = TProfiles;
	}

}