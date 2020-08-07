package net.webius.playlist.login.naver;

public interface LoginNaverService {
    final String CLIENT_ID = "EKIS9CrtNLul9qNF_rdO"; // REST API KEY
    final String CLIENT_SECRET = "C0C6bpwBq8"; // SECRET KEY
    final String REDIRECT_URI = "https://playlist.webius.net/login/naver.callback"; // REDIRECT URI

    public String init(String state);
    public LoginNaverCodeVO request(String code);
    public String verify();
    public LoginNaverRefreshTokenVO refresh(String refresh_token);
    public String user();
}
