// default imports

import java.net.*;


// main function

public class internet {
    
    public static void internetDatas(String[] args) {
        
        int bitcoinInternetSocketAddress = "127.0.0.1";
        int bitcoinInternetSocketPort = 0;
        int bitcoinCashInternetSocketAddress = "127.0.0.1";
        int bitcoinCashInternetSocketPort = 0;
        int litecoinInternetSocketAddress = "127.0.0.1";
        int litecoinInternetSocketPort = 0;
        int marscoinInternetSocketAddress = "127.0.0.1";
        int marscoinInternetSocketPort = 0;
        
    };
    public static void Internet(String[] args) {
        
        Socket bitcoinInternetSocket = new Socket(InetAddress internetDatas.bitcoinInternetSocketAddress, internetDatas.bitcoinInternetSocketPort);
        Socket bitcoinCashInternetSocket = new Socket(InetAddress internetDatas.bitcoinCashInternetSocketAddress, internetDatas.bitcoinCashInternetSocketPort);
        Socket litecoinInternetSocket = new Socket(InetAddress internetDatas.litecoinInternetSocketAddress, internetDatas.litecoinInternetSocketPort);
        Socket marscoinInternetSocket = new Socket(InetAddress internetDatas.marscoinInternetSocketAddress, internetDatas.marscoinInternetSocketPort);
        
    };
    
};
