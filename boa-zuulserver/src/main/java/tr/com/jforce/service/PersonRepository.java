package tr.com.jforce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.DistinguishedName;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.AbstractContextMapper;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.Filter;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonRepository {

	@Autowired
	private LdapTemplate ldapTemplate;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String getPasswordForUid(String uid) {
		Filter f = new EqualsFilter("uid", uid);
		List result = ldapTemplate.search(DistinguishedName.EMPTY_PATH, f.toString(), new AbstractContextMapper() {
			protected String doMapFromContext(DirContextOperations ctx) {
				DirContextAdapter context = (DirContextAdapter) ctx;
				String password = context.getStringAttribute("password");
				return password;
			}
		});
		if (result.size() != 1) {
			throw new RuntimeException("User not found or not unique");
		}
		return (String) result.get(0);
	}
}