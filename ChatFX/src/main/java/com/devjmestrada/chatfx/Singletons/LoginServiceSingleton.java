package com.devjmestrada.chatfx.Singletons;
import com.devjmestrada.chatfx.Services.Impl.LoginService;
import com.devjmestrada.chatfx.Services.Interfaces.ILoginService;

public class LoginServiceSingleton {
    private static final ILoginService loginServiceInstance = new LoginService();

    public static ILoginService getLoginService() {
        return loginServiceInstance;
    }
}
