package org.tsn.entity;

// Generated Feb 19, 2015 10:13:35 PM by Hibernate Tools 4.0.0

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
 * TProfile generated by hbm2java
 */
@Entity
@Table(name = "t_profile")
public class TProfile implements IBaseEntity {

	private static final long serialVersionUID = 3432570526406420267L;
	
	private int profileId;
	private TLogin TLogin;
	private TOccupation TOccupation;
	private TEducation TEducation;
	private String firstName;
	private String lastName;
	private Character gender;
	private Date dob;
	private String emailId;
	private Integer phoneNumber;
	private String profileDescr;
	private byte[] profilePhoto;
	private String facebookId;
	private String tweeterId;
	private String googleId;
	private String educationDescr;
	private String occupationDescr;
	private Character isAdmin;
	private Set<TProjectMilestones> TProjectMilestoneses = new HashSet<TProjectMilestones>(
			0);
	private Set<TUserCiircle> TUserCiirclesForProfileId = new HashSet<TUserCiircle>(
			0);
	private Set<TTeam> TTeams = new HashSet<TTeam>(0);
	private Set<TSecurityAnswers> TSecurityAnswerses = new HashSet<TSecurityAnswers>(
			0);
	private Set<TProjects> TProjectses = new HashSet<TProjects>(0);
	private Set<TUserCiircle> TUserCiirclesForParentProfileId = new HashSet<TUserCiircle>(
			0);

	public TProfile() {
	}

	public TProfile(int profileId) {
		this.profileId = profileId;
	}

	public TProfile(int profileId, TLogin TLogin, TOccupation TOccupation,
			TEducation TEducation, String firstName, String lastName,
			Character gender, Date dob, String emailId, Integer phoneNumber,
			String profileDescr, byte[] profilePhoto, String facebookId,
			String tweeterId, String googleId, String educationDescr,
			String occupationDescr, Character isAdmin,
			Set<TProjectMilestones> TProjectMilestoneses,
			Set<TUserCiircle> TUserCiirclesForProfileId, Set<TTeam> TTeams,
			Set<TSecurityAnswers> TSecurityAnswerses,
			Set<TProjects> TProjectses,
			Set<TUserCiircle> TUserCiirclesForParentProfileId) {
		this.profileId = profileId;
		this.TLogin = TLogin;
		this.TOccupation = TOccupation;
		this.TEducation = TEducation;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.profileDescr = profileDescr;
		this.profilePhoto = profilePhoto;
		this.facebookId = facebookId;
		this.tweeterId = tweeterId;
		this.googleId = googleId;
		this.educationDescr = educationDescr;
		this.occupationDescr = occupationDescr;
		this.isAdmin = isAdmin;
		this.TProjectMilestoneses = TProjectMilestoneses;
		this.TUserCiirclesForProfileId = TUserCiirclesForProfileId;
		this.TTeams = TTeams;
		this.TSecurityAnswerses = TSecurityAnswerses;
		this.TProjectses = TProjectses;
		this.TUserCiirclesForParentProfileId = TUserCiirclesForParentProfileId;
	}

	@Id
	@Column(name = "PROFILE_ID", unique = true, nullable = false)
	public int getProfileId() {
		return this.profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOGIN_ID")
	public TLogin getTLogin() {
		return this.TLogin;
	}

	public void setTLogin(TLogin TLogin) {
		this.TLogin = TLogin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OCCUPATION_ID")
	public TOccupation getTOccupation() {
		return this.TOccupation;
	}

	public void setTOccupation(TOccupation TOccupation) {
		this.TOccupation = TOccupation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EDUCATION_ID")
	public TEducation getTEducation() {
		return this.TEducation;
	}

	public void setTEducation(TEducation TEducation) {
		this.TEducation = TEducation;
	}

	@Column(name = "FIRST_NAME", length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "GENDER", length = 1)
	public Character getGender() {
		return this.gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DOB", length = 10)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "EMAIL_ID", length = 50)
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "PHONE_NUMBER")
	public Integer getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "PROFILE_DESCR", length = 100)
	public String getProfileDescr() {
		return this.profileDescr;
	}

	public void setProfileDescr(String profileDescr) {
		this.profileDescr = profileDescr;
	}

	@Column(name = "PROFILE_PHOTO")
	public byte[] getProfilePhoto() {
		return this.profilePhoto;
	}

	public void setProfilePhoto(byte[] profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Column(name = "FACEBOOK_ID", length = 50)
	public String getFacebookId() {
		return this.facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	@Column(name = "TWEETER_ID", length = 50)
	public String getTweeterId() {
		return this.tweeterId;
	}

	public void setTweeterId(String tweeterId) {
		this.tweeterId = tweeterId;
	}

	@Column(name = "GOOGLE_ID", length = 50)
	public String getGoogleId() {
		return this.googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	@Column(name = "EDUCATION_DESCR", length = 100)
	public String getEducationDescr() {
		return this.educationDescr;
	}

	public void setEducationDescr(String educationDescr) {
		this.educationDescr = educationDescr;
	}

	@Column(name = "OCCUPATION_DESCR", length = 100)
	public String getOccupationDescr() {
		return this.occupationDescr;
	}

	public void setOccupationDescr(String occupationDescr) {
		this.occupationDescr = occupationDescr;
	}

	@Column(name = "IS_ADMIN", length = 1)
	public Character getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Character isAdmin) {
		this.isAdmin = isAdmin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProfile")
	public Set<TProjectMilestones> getTProjectMilestoneses() {
		return this.TProjectMilestoneses;
	}

	public void setTProjectMilestoneses(
			Set<TProjectMilestones> TProjectMilestoneses) {
		this.TProjectMilestoneses = TProjectMilestoneses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProfileByProfileId")
	public Set<TUserCiircle> getTUserCiirclesForProfileId() {
		return this.TUserCiirclesForProfileId;
	}

	public void setTUserCiirclesForProfileId(
			Set<TUserCiircle> TUserCiirclesForProfileId) {
		this.TUserCiirclesForProfileId = TUserCiirclesForProfileId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProfile")
	public Set<TTeam> getTTeams() {
		return this.TTeams;
	}

	public void setTTeams(Set<TTeam> TTeams) {
		this.TTeams = TTeams;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProfile")
	public Set<TSecurityAnswers> getTSecurityAnswerses() {
		return this.TSecurityAnswerses;
	}

	public void setTSecurityAnswerses(Set<TSecurityAnswers> TSecurityAnswerses) {
		this.TSecurityAnswerses = TSecurityAnswerses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProfile")
	public Set<TProjects> getTProjectses() {
		return this.TProjectses;
	}

	public void setTProjectses(Set<TProjects> TProjectses) {
		this.TProjectses = TProjectses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProfileByParentProfileId")
	public Set<TUserCiircle> getTUserCiirclesForParentProfileId() {
		return this.TUserCiirclesForParentProfileId;
	}

	public void setTUserCiirclesForParentProfileId(
			Set<TUserCiircle> TUserCiirclesForParentProfileId) {
		this.TUserCiirclesForParentProfileId = TUserCiirclesForParentProfileId;
	}

}
