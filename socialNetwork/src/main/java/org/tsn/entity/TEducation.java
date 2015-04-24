package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

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
 * TEducation generated by hbm2java
 */
@Entity
@Table(name = "t_education", catalog = "tsn_test")
public class TEducation implements IBaseEntity
{

	private Integer			educationId;
	private String			educationText;
	private Set<TProfile>	TProfiles	= new HashSet<TProfile>(0);

	public TEducation()
	{
	}

	public TEducation(String educationText)
	{
		this.educationText = educationText;
	}

	public TEducation(String educationText, Set<TProfile> TProfiles)
	{
		this.educationText = educationText;
		this.TProfiles = TProfiles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "EDUCATION_ID", unique = true, nullable = false)
	public Integer getEducationId()
	{
		return this.educationId;
	}

	public void setEducationId(Integer educationId)
	{
		this.educationId = educationId;
	}

	@Column(name = "EDUCATION_TEXT", nullable = false, length = 50)
	public String getEducationText()
	{
		return this.educationText;
	}

	public void setEducationText(String educationText)
	{
		this.educationText = educationText;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TEducation")
	public Set<TProfile> getTProfiles()
	{
		return this.TProfiles;
	}

	public void setTProfiles(Set<TProfile> TProfiles)
	{
		this.TProfiles = TProfiles;
	}

}
