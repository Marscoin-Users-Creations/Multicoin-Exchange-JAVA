// default imports

import java.io.*;
import java.lang.Thread;
import java.net.*;

package com.multicoinexchange;

import com.multicoinexchange.database;
import com.multicoinexchange.firewall;
import com.multicoinexchange.internet;
import com.multicoinexchange.thread;
import com.multicoinexchange.wallet;


// main vars

public class vars {
    
    public static internetVars(String[] args) {
        
        int bitcoinInternetAddress = "127.0.0.1";
        int bitcoinInternetPort = 0;
        int bitcoinCashInternetAddress = "127.0.0.1";
        int bitcoinCashInternetPort = 0;
        int litecoinInternetAddress = "127.0.0.1";
        int litecoinInternetPort = 0;
        int litecoinCashInternetAddress = "127.0.0.1";
        int litecoinCashInternetPort = 0;
        int marscoinInternetAddress = "127.0.0.1";
        int marscoinInternetPort = 0;
        
    };
    
};


// main class

public class main {
    
    public static void internet(String[] args) {
        
        Socket bitcoinInternetSocket = new socket(InetAddress vars.internetVars.bitcoinInternetAddress, int vars.internetVars.bitcoinInternetPort);
        Socket bitcoinCashInternetSocket = new socket(InetAddress vars.internetVars.bitcoinCashInternetAddress int vars.internetVars.bitcoinCashInternetPort);
        Socket litecoinInternetSocket = new socket(InetAddress vars.internetVars.litecoinInternetAddress, int vars.internetVars.litecoinInternetPort);
        Socket litecoinCashInternetSocket = new socket(InetAddress vars.internetVars.litecoinCashInternetAddress, int vars.internetVars.litecoinCashInternetPort);
        Socket marscoinInternetSocket = new socket(InetAddress vars.internetVars.marscoinInternetAddress, int vars.internetVars.marscoinInternetPort);
        
    };
    public static void Main(String[] args) {
        
        
        
    };
    public static void threading(String[] args) {
        
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();
        Thread thread4 = new Thread();
        
    };
    
};
