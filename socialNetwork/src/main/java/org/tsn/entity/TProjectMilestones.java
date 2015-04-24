package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TProjectMilestones generated by hbm2java
 */
@Entity
@Table(name = "t_project_milestones", catalog = "tsn_test")
public class TProjectMilestones implements java.io.Serializable
{

	private int						projectMilestoneId;
	private TLogin					TLogin;
	private TProjects				TProjects;
	private Integer					descr;
	private Double					fundsRequired;
	private Double					fundsReceived;
	private Date					iniationDate;
	private Date					targetCompletionDate;
	private Date					actualCompletionDate;
	private Set<TProjectGallery>	TProjectGalleries	= new HashSet<TProjectGallery>(
															0);

	public TProjectMilestones()
	{
	}

	public TProjectMilestones(int projectMilestoneId)
	{
		this.projectMilestoneId = projectMilestoneId;
	}

	public TProjectMilestones(
		int projectMilestoneId,
		TLogin TLogin,
		TProjects TProjects,
		Integer descr,
		Double fundsRequired,
		Double fundsReceived,
		Date iniationDate,
		Date targetCompletionDate,
		Date actualCompletionDate,
		Set<TProjectGallery> TProjectGalleries)
	{
		this.projectMilestoneId = projectMilestoneId;
		this.TLogin = TLogin;
		this.TProjects = TProjects;
		this.descr = descr;
		this.fundsRequired = fundsRequired;
		this.fundsReceived = fundsReceived;
		this.iniationDate = iniationDate;
		this.targetCompletionDate = targetCompletionDate;
		this.actualCompletionDate = actualCompletionDate;
		this.TProjectGalleries = TProjectGalleries;
	}

	@Id
	@Column(name = "PROJECT_MILESTONE_ID", unique = true, nullable = false)
	public int getProjectMilestoneId()
	{
		return this.projectMilestoneId;
	}

	public void setProjectMilestoneId(int projectMilestoneId)
	{
		this.projectMilestoneId = projectMilestoneId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login_id")
	public TLogin getTLogin()
	{
		return this.TLogin;
	}

	public void setTLogin(TLogin TLogin)
	{
		this.TLogin = TLogin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROJECT_ID")
	public TProjects getTProjects()
	{
		return this.TProjects;
	}

	public void setTProjects(TProjects TProjects)
	{
		this.TProjects = TProjects;
	}

	@Column(name = "DESCR")
	public Integer getDescr()
	{
		return this.descr;
	}

	public void setDescr(Integer descr)
	{
		this.descr = descr;
	}

	@Column(name = "FUNDS_REQUIRED", precision = 22, scale = 0)
	public Double getFundsRequired()
	{
		return this.fundsRequired;
	}

	public void setFundsRequired(Double fundsRequired)
	{
		this.fundsRequired = fundsRequired;
	}

	@Column(name = "FUNDS_RECEIVED", precision = 22, scale = 0)
	public Double getFundsReceived()
	{
		return this.fundsReceived;
	}

	public void setFundsReceived(Double fundsReceived)
	{
		this.fundsReceived = fundsReceived;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "INIATION_DATE", length = 10)
	public Date getIniationDate()
	{
		return this.iniationDate;
	}

	public void setIniationDate(Date iniationDate)
	{
		this.iniationDate = iniationDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TARGET_COMPLETION_DATE", length = 10)
	public Date getTargetCompletionDate()
	{
		return this.targetCompletionDate;
	}

	public void setTargetCompletionDate(Date targetCompletionDate)
	{
		this.targetCompletionDate = targetCompletionDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACTUAL_COMPLETION_DATE", length = 10)
	public Date getActualCompletionDate()
	{
		return this.actualCompletionDate;
	}

	public void setActualCompletionDate(Date actualCompletionDate)
	{
		this.actualCompletionDate = actualCompletionDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProjectMilestones")
	public Set<TProjectGallery> getTProjectGalleries()
	{
		return this.TProjectGalleries;
	}

	public void setTProjectGalleries(Set<TProjectGallery> TProjectGalleries)
	{
		this.TProjectGalleries = TProjectGalleries;
	}

}