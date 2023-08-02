package com.devjmestrada.chatfx.Services.Interfaces;

import com.devjmestrada.chatfx.Entities.Contact;
import com.devjmestrada.chatfx.Entities.Message;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface IChatService {
    int getUnreadMessageCount(int userId) throws SQLException;
    ObservableList<Contact> getUserContacts(int userId) throws SQLException;
    ObservableList<Message> getChatMessages(int userId, int contactId) throws SQLException;
    void updateReadMessages(int contactId, int userId) throws SQLException;
    void addContact(int userId, int contactId) throws SQLException;
    void createChat(int userId, int contactId) throws SQLException;
    void blockUnblockContact(int userId, int contactId, boolean isBlocked) throws SQLException;

    void insertMessage(int userId, String text, int chatId) throws SQLException;

}
