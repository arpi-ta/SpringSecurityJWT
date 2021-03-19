# SpringSecurityJWT
Enabling spriing security with JWT authentication 

  COMMIT-1 => Make a Spring project from spring starter add web and SpringSecurity as a dependency.
The spring security comes with a login cred with a user and a password, the very first code was to change the userDetails from userDetails class and to add a  NoOpPasswordEncoder
from SpringSecurity5 in Security config file extending WebSecurityConfigurerAdapter. <FIRST COMMIT>

COMMIT 4=> Adding dependencies of jjwt-impl , jjwt-api, jjwt-jackson of latest version with the signature algo in jwUtil as HS512 which only takes username and password.
The JWTUtil class helps us to create and manage token which is then called by the controller to create jwt token for specified post method which will take username and password and authenticate(if true gives a jwt token). 
