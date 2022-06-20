package com.example;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public interface ContactsCRUD {

    ArrayList<Contact> loadContacts(BufferedInputStream buffIn) throws IOException;
    void createContact(Contact contact) throws IOException;
    int searchContact(Map<String, String> name);
    int editContact(int idToEdit, String[] fieldsToEdit, String[] newValues);
    void deleteContact(int idToDelete);

    //void updateContacts(ArrayList<com.example.Contact> contacts, PrintStream fileOut) throws IOException;

}
