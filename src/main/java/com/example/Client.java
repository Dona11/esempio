package com.example;

import java.io.*;
import java.net.*;

public class Client {
    
    String nomeServer = "localhost";    //indirizzo del server
    int portaServer = 5000;             //porta del server
    Socket mioSocket;
    BufferedReader tastiera;           //buffer per l'input da tastiera
    String stringaUtente;              //stringa inserita da utente
    String stringaRicevutaDalServer;   //stringa ricevuta dal server
    DataOutputStream outVersoServer;   //Stream di output
    BufferedReader inDalServer;        //stream di input



    protected Socket connetti() throws IOException{

        
    }
}
