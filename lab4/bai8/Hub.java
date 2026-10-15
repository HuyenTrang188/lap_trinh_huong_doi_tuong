package bai8;

import java.util.ArrayList;
import java.util.List;

public class Hub {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void turnOffAll() {
        System.out.println("Turn Off All Devices:");
        for (Device device : devices) {
            device.turnOff();
        }
    }

    public void setupWifi() {
        System.out.println("Setup Wifi:");
        for (Device device : devices) {
            if (device instanceof WifiConnectable) {
                WifiConnectable wifiDevice =
                    (WifiConnectable) device;

                wifiDevice.connectWifi();
            }
        }
    }
}