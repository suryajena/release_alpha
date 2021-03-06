package org.tsn.utility;

import org.tsn.entity.TEducation;
import org.tsn.entity.TLogin;
import org.tsn.entity.TOccupation;
import org.tsn.entity.TProfile;
import org.tsn.tos.UserProfile;

public class DatabaseConversionUtility extends BaseUtility {
	public static DatabaseConversionUtility shared = new DatabaseConversionUtility();
	private DatabaseConversionUtility() {
		super();
	}
	public TProfile getUserProfile(UserProfile userProfile) {

		if(null == userProfile)
			return null;
		
		 
		
		TProfile profileEntity = new TProfile();
		
		updateTprofile(userProfile, profileEntity);
		return profileEntity;
	}
	private void updateTprofile(UserProfile userProfile, TProfile profileEntity)
	{
		TLogin login = new TLogin();
		login.setUserName(userProfile.getEmail());
		login.setPassword( userProfile.getPassword());
		
		profileEntity.setFirstName(userProfile.getFirstName());
		profileEntity.setLastName(userProfile.getLastName());
		profileEntity.setGender(userProfile.getGender());
		profileEntity.setDob(userProfile.getDateOfBirth());
		profileEntity.setEmailId(userProfile.getEmail());
		profileEntity.setPhoneNumber( userProfile.getPhoneNumber());
		//profileEntity.setProfileDescr(userProfile);
		//profileEntity.setFacebookId();
		//profileEntity.setTweeterId(tweeterId);
		//profileEntity.setGoogleId(googleId);
		//profileEntity.setIsAdmin(isAdmin);
		
		
		profileEntity.setTLogin(login);
		//profileEntity.setTEducation( new TEducation() );
		//profileEntity.setTOccupation(new TOccupation());
		//profileEntity.setTSecurityAnswerses( new TSecurityAnswer);
	}
	public TProfile getUserProfile(UserProfile userProfile, TProfile profile)
	{
		if(null == profile)
			return null;

		updateTprofile(userProfile, profile);
		
		return profile;
	}
}
