package net.webius.playlist.login.kakao;

public interface LoginKakaoService {
    final String CLIENT_ID = "c8f930d2b66cf1b4d48d7f40ab61d26d"; // REST API KEY
    final String CLIENT_SECRET = "ibwKxCDcNvPGqBgdP2W9fQHVph2bpYR4"; // SECRET KEY
    final String REDIRECT_URI = "https://playlist.webius.net/login/kakao.callback"; // REDIRECT URI

    public String init(String state);
    public LoginKakaoCodeVO request(String code);
    public String verify();
    public LoginKakaoRefreshTokenVO refresh(String refresh_token);
    public String user();
}
