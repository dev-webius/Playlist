package net.webius.playlist.login.google;

public interface LoginGoogleService {
    final String CLIENT_ID = "544127557764-5tjp2djdevs1qsg5a1i9jbqui591sd05.apps.googleusercontent.com"; // REST API KEY
    final String CLIENT_SECRET = "zdoTdj2-5yQZxsgtvQ5A5G8Q"; // SECRET KEY
    final String REDIRECT_URI = "https://playlist.webius.net/login/google.callback"; // REDIRECT URI

    public String init(String state);
    public LoginGoogleCodeVO request(String code);
    public String verify();
    public LoginGoogleRefreshTokenVO refresh(String refresh_token);
    public String user();
}
