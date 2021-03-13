// default imports

import java.lang.Thread;
import java.net.*;

package com.multicoinexchange.database;
package com.multicoinexchange.firewall;
package com.multicoinexchange.internet;
package com.multicoinexchange.thread;
package com.multicoinexchange.wallet;


// main vars

public class vars {
    
    public static internetVars(String[] args) {
        
        int bitcoinInternetAddress = "127.0.0.1";
        int bitcoinInternetPort = 0;
        int bitcoinCashInternetAddress = "127.0.0.1";
        int bitcoinCashInternetPort = 0;
        int litecoinInternetAddress = "127.0.0.1";
        int litecoinInternetPort = 0;
        int marscoinInternetAddress = "127.0.0.1";
        int marscoinInternetPort = 0;
        
    };
    
};


// main class

public class main {
    
    public static void internet(String[] args) {
        
        Socket bitcoinInternetSocket = new Socket(InetAddress vars.internetVars.bitcoinInternetAddress, int vars.internetVars.bitcoinInternetPort);
        Socket bitcoinCashInternetSocket = new Socket(InetAddress vars.internetVars.bitcoinCashInternetAddress int vars.internetVars.bitcoinCashInternetPort);
        Socket litecoinInternetSocket = new Socket(InetAddress vars.internetVars.litecoinInternetAddress, int vars.internetVars.litecoinInternetPort);
        Socket marscoinInternetSocket = new Socket(InetAddress vars.internetVars.marscoinInternetAddress, int vars.internetVars.marscoinInternetPort);
        
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
