package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TProfile generated by hbm2java
 */
@Entity
@Table(name = "t_profile", catalog = "tsn_test")
public class TProfile implements java.io.Serializable
{

	private Integer		loginId;
	private TEducation	TEducation;
	private TLogin		TLogin;
	private TOccupation	TOccupation;
	private String		firstName;
	private String		lastName;
	private Character	gender;
	private Date		dob;
	private String		emailId;
	private String		phoneNumber;
	private String		profileDescr;
	private byte[]		profilePhoto;
	private String		facebookId;
	private String		tweeterId;
	private String		googleId;
	private String		educationDescr;
	private String		occupationDescr;
	private Character	isAdmin;

	public TProfile()
	{
	}

	public TProfile(TLogin TLogin)
	{
		this.TLogin = TLogin;
	}

	public TProfile(
		TEducation TEducation,
		TLogin TLogin,
		TOccupation TOccupation,
		String firstName,
		String lastName,
		Character gender,
		Date dob,
		String emailId,
		String phoneNumber,
		String profileDescr,
		byte[] profilePhoto,
		String facebookId,
		String tweeterId,
		String googleId,
		String educationDescr,
		String occupationDescr,
		Character isAdmin)
	{
		this.TEducation = TEducation;
		this.TLogin = TLogin;
		this.TOccupation = TOccupation;
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
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "TLogin"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "LOGIN_ID", unique = true, nullable = false)
	public Integer getLoginId()
	{
		return this.loginId;
	}

	public void setLoginId(Integer loginId)
	{
		this.loginId = loginId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EDUCATION_ID")
	public TEducation getTEducation()
	{
		return this.TEducation;
	}

	public void setTEducation(TEducation TEducation)
	{
		this.TEducation = TEducation;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public TLogin getTLogin()
	{
		return this.TLogin;
	}

	public void setTLogin(TLogin TLogin)
	{
		this.TLogin = TLogin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OCCUPATION_ID")
	public TOccupation getTOccupation()
	{
		return this.TOccupation;
	}

	public void setTOccupation(TOccupation TOccupation)
	{
		this.TOccupation = TOccupation;
	}

	@Column(name = "FIRST_NAME", length = 50)
	public String getFirstName()
	{
		return this.firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", length = 50)
	public String getLastName()
	{
		return this.lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Column(name = "GENDER", length = 1)
	public Character getGender()
	{
		return this.gender;
	}

	public void setGender(Character gender)
	{
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DOB", length = 10)
	public Date getDob()
	{
		return this.dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	@Column(name = "EMAIL_ID", length = 50)
	public String getEmailId()
	{
		return this.emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	@Column(name = "PHONE_NUMBER", length = 15)
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "PROFILE_DESCR", length = 100)
	public String getProfileDescr()
	{
		return this.profileDescr;
	}

	public void setProfileDescr(String profileDescr)
	{
		this.profileDescr = profileDescr;
	}

	@Column(name = "PROFILE_PHOTO")
	public byte[] getProfilePhoto()
	{
		return this.profilePhoto;
	}

	public void setProfilePhoto(byte[] profilePhoto)
	{
		this.profilePhoto = profilePhoto;
	}

	@Column(name = "FACEBOOK_ID", length = 50)
	public String getFacebookId()
	{
		return this.facebookId;
	}

	public void setFacebookId(String facebookId)
	{
		this.facebookId = facebookId;
	}

	@Column(name = "TWEETER_ID", length = 50)
	public String getTweeterId()
	{
		return this.tweeterId;
	}

	public void setTweeterId(String tweeterId)
	{
		this.tweeterId = tweeterId;
	}

	@Column(name = "GOOGLE_ID", length = 50)
	public String getGoogleId()
	{
		return this.googleId;
	}

	public void setGoogleId(String googleId)
	{
		this.googleId = googleId;
	}

	@Column(name = "EDUCATION_DESCR", length = 100)
	public String getEducationDescr()
	{
		return this.educationDescr;
	}

	public void setEducationDescr(String educationDescr)
	{
		this.educationDescr = educationDescr;
	}

	@Column(name = "OCCUPATION_DESCR", length = 100)
	public String getOccupationDescr()
	{
		return this.occupationDescr;
	}

	public void setOccupationDescr(String occupationDescr)
	{
		this.occupationDescr = occupationDescr;
	}

	@Column(name = "IS_ADMIN", length = 1)
	public Character getIsAdmin()
	{
		return this.isAdmin;
	}

	public void setIsAdmin(Character isAdmin)
	{
		this.isAdmin = isAdmin;
	}

}
