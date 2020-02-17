package tr.com.jforce.security;



import tr.com.jforce.model.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getUsername(),
                user.getPassword()
        );
    }

}
