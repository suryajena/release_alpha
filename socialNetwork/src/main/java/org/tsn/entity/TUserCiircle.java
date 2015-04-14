package org.tsn.entity;

// Generated Feb 19, 2015 10:13:35 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TUserCiircle generated by hbm2java
 */
@Entity
@Table(name = "t_user_ciircle")
public class TUserCiircle implements IBaseEntity  {

	private static final long serialVersionUID = -7819083672318462150L;
	
	private int circleId;
	private TProfile TProfileByParentProfileId;
	private TProfile TProfileByProfileId;

	public TUserCiircle() {
	}

	public TUserCiircle(int circleId) {
		this.circleId = circleId;
	}

	public TUserCiircle(int circleId, TProfile TProfileByParentProfileId,
			TProfile TProfileByProfileId) {
		this.circleId = circleId;
		this.TProfileByParentProfileId = TProfileByParentProfileId;
		this.TProfileByProfileId = TProfileByProfileId;
	}

	@Id
	@Column(name = "CIRCLE_ID", unique = true, nullable = false)
	public int getCircleId() {
		return this.circleId;
	}

	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_PROFILE_ID")
	public TProfile getTProfileByParentProfileId() {
		return this.TProfileByParentProfileId;
	}

	public void setTProfileByParentProfileId(TProfile TProfileByParentProfileId) {
		this.TProfileByParentProfileId = TProfileByParentProfileId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROFILE_ID")
	public TProfile getTProfileByProfileId() {
		return this.TProfileByProfileId;
	}

	public void setTProfileByProfileId(TProfile TProfileByProfileId) {
		this.TProfileByProfileId = TProfileByProfileId;
	}

}
