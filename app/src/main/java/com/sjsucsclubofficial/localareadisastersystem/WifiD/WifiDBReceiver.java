package com.sjsucsclubofficial.localareadisastersystem.WifiD;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.widget.Toast;

import com.sjsucsclubofficial.localareadisastersystem.StarterActivity;

public class WifiDBReceiver extends BroadcastReceiver {
    private WifiP2pManager wifiP2pManager;
    private WifiP2pManager.Channel wifiChannel;
    private StarterActivity starterActivity;

    public WifiDBReceiver(WifiP2pManager wifiP2pManager, WifiP2pManager.Channel wifiChannel, StarterActivity starterActivity)
    {
        this.wifiP2pManager = wifiP2pManager;
        this.wifiChannel = wifiChannel;
        this.starterActivity = starterActivity;

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {
            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);
            if(state == WifiP2pManager.WIFI_P2P_STATE_ENABLED){
                Toast.makeText(context,"Wifi is on", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(context,"Wifi is off", Toast.LENGTH_SHORT).show();
            }

        }
        else if(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)){

        }
        else if(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)){

        }
        else if(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)){

        }

    }
}
