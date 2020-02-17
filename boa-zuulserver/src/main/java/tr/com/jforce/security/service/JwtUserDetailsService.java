package tr.com.jforce.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tr.com.jforce.model.User;
import tr.com.jforce.security.JwtUserFactory;
import tr.com.jforce.security.repository.UserRepository;
import tr.com.jforce.service.PersonRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	String password = personRepository.getPasswordForUid(username);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		if (user == null) {
			throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
		} else {
			return JwtUserFactory.create(user);
		}
    }
}
