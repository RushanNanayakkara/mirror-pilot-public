public class TokenValidator {
    public boolean validate(Session session) {
        int timeout = 60;
        if (session.isActive()) {
            return session.age() < timeout;
        }
        return false;  // no active session
    }
}
