package com.devjmestrada.chatfx.Singletons;
import com.devjmestrada.chatfx.DAOs.Interfaces.IContactDAO;
import com.devjmestrada.chatfx.DAOs.Impl.ContactDAO;

public class ContactDAOSingleton {
    private static final IContactDAO contactDAOInstance = new ContactDAO();

    public static IContactDAO getContactDAO() {
        return contactDAOInstance;
    }
}