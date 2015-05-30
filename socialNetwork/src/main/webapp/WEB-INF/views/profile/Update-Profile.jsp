<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <title>NGO</title>
  <meta charset="utf-8">
<link href="<c:url value="/css/style.css" />" type="text/css"	rel="stylesheet" media="all"/>
<link href="<c:url value="/css/reset.css" />" type="text/css"rel="stylesheet" media="all"/>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,300,200,100,500,600,700' rel='stylesheet' type='text/css'>
  
  <!--[if lt IE 7]>
  	<link rel="stylesheet" href="Style/ie/ie6.css" type="text/css" media="all">
  <![endif]-->
  <!--[if lt IE 9]>
  	<script type="text/javascript" src="js/html5.js"></script>
    <script type="text/javascript" src="js/IE9.js"></script>
  <![endif]-->
  
  
</head>
<body>

<!------------ top row start-------------->

<div class="toprow">
	<div class="container">
    	<div class="search">
          <input type="text" value="" class="input1" /><input type="button" value="" class="input2" />
        </div>
        <div class="login_link">
        	<a href="#">LOGIN</a> |
            <a href="#">SIGN UP</a>
        </div>
        <div class="clear"></div>
    </div>	
</div>

<!------------ top row end-------------->

<!------------ header start-------------->

<div class="header">
	<div class="container">
    	<div class="logo">
        	<img src="../images/logo.png" alt="logo" />
        </div>
        
        <div class="nav">
        	
            <ul>
            	<li><a href="#" class="active">HOME</a></li>
                <li><a href="#">Explore</a></li>            
                <li><a href="#">How it works</a></li>               
                <li><a href="#">Start your movement</a></li>
            </ul>
            
        </div>
   
        
    </div>
    <div class="clear"></div>
</div>

<!------------ header End-------------->

<!------------ banner start-------------->

<div class="banner-inner">
	<div class="slide-inner">
    	<h2>Frequently asked questions</h2>
    </div>
    <div class="clear"></div>
</div>

<!------------ banner End-------------->


<!------------ CONTENT START-------------->

<section class="content">
    
    <div class="container">
    <h2>Update Your Profile</h2>
   
    	
        <div class="update_profile">
        <h6>Build your profile and show the world what u care about</h6>
        	
        <div class="rgtCl">
        	<div class="upload_photo">
            	Upload your PhotoGraph
                <img src="../images/avatar.png" alt="avtar" />
            </div>
        </div>
         <div class="leftCl">
         	
            <div class="row">
            	<div class="p_left">Profile Picture</div>
                <div class="p_right"><img src="../images/avatar.png" alt="avtar" /></div>
            </div>
            
            <div class="row">
            	<div class="p_left">Sex</div>
                <div class="p_right">Male</div>
            </div>
            
             <div class="row">
            	<div class="p_left">Date Of Birth</div>
                <div class="p_right">02/02/1999</div>
            </div>
            
            
             <div class="row">
            	<div class="p_left">Highest Education</div>
                <div class="p_right"><select>
                	<option>Select Class</option>
                	<option>10th </option>
                    <option>12th </option>
                    <option>Bachelor degree</option>
                    <option>Master Digree</option>
                </select></div>
            </div>
            
             <div class="row">
            	<div class="p_left">Location</div>
                <div class="p_right">
                	<input type="text" value="Address 1" />
                    <input type="text" value="Address 1" />
                    <select>
                	<option>Select City</option>
                	<option>city name</option>
                   <option>city name</option>
                   <option>city name</option>
                </select>
                 <select>
                	<option>Select State</option>
                	<option>city name</option>
                   <option>city name</option>
                   <option>city name</option>
                </select>
                </div>
            </div>
            
            
            <div class="row">
            	<div class="p_left">About Me</div>
                <div class="p_right">
                	<textarea></textarea>
                </div>
            </div>
            
            <div class="row">
            	<div class="p_left">Present Work</div>
                <div class="p_right">
                	<select>
                	<option>Select </option>
                	<option>-------</option>
                    <option>----- </option>
                    <option>------</option>
                    <option>------</option>
                </select>
                
                <textarea>Description</textarea>
                </div>
            </div>
            
            <div class="row-b">
            	<input type="button" class="button" value="Save and Review Your Profile" />
            </div>
            
            
            
         </div>
         
         
        </div>
        
        
      
    </div>
<div class="clear"></div>
</section>


<!------------ CONTENT END-------------->


<!------------ FOOTER START-------------->

<div class="footer">

	<div class="four_clum">
    	<div class="container">
        	
            <div class="cols-4">
            	<h6>ABOUT US</h6>
                <ul>
                	<li><a href="#">Login</a></li>
                    <li><a href="#">Signup</a></li>
                    <li><a href="#">Donate</a></li>
                   <li><a href="#">Movements</a></li>
                   <li><a href="#">Jobs</a></li>
                </ul>
            </div>
            
            <div class="cols-4">
            	<h6>The Social NGO</h6>
               <ul>
                	<li><a href="#">About</a></li>
                    <li><a href="#">Why</a></li>
                    <li><a href="#">Fees</a></li>
                   <li><a href="#">Team</a></li>
                    <li><a href="#">Media</a></li>
                     
                </ul>
            </div>
            
            <div class="cols-4">
                <h6>Help</h6>
                 <ul>
                    <li><a href="#">Guidelines</a></li>
                    <li><a href="#">FAQ</a></li>
                    <li><a href="#">Contact</a></li>
                   <li><a href="#">Terms of Use</a></li>
                   <li><a href="#">Privacy policy</a></li>
                </ul>
            </div>
            
            <div class="cols-4-last">
            <h6>Join the SocialNGo Movement</h6>
            <div class="newslatter">
            	<div class="lt">
                	<input type="text" value="Email Id" />
                </div>
                <div class="rt">
                	<input type="button" value="Sign Up" class="button" />
                </div>
            </div>
            <div class="socialIcon">
                  <div class="cols-4"><img src="../images/facebook.png" alt="facebook" /></div>
                  <div class="cols-4"><img src="../images/google-plus.png" alt="google plus" /></div>
                  <div class="cols-4"><img src="../images/twitter.png" alt="twitter" /></div>
                  <div class="cols-4-last"><img src="../images/tube.png" alt="youtube" /></div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    
    <div class="copyright">
    	<div class="container">
        	<div class="cols-2">COPYRIGHT &copy; Prayas socialngo foundation</div>
            <div class="cols-2-last algn_rgt">
            	DESIGN AND DEVELOP BY :: I3WEBWORLD.COM
            </div>
        </div>
        <div class="clear"></div>
    </div>
    
    
</div>

<!------------ FOOTER END-------------->
</body>
</html>
