package com.lfkj.aidldatatranslatedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RemoteService extends Service {

    private String[] names={"王昭君","孙悟空","李白","猪八戒","后裔"};

    public RemoteService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
      return mBinder;
    }

    private final IRemoteService.Stub mBinder=new IRemoteService.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println("basicTypes aDouble: " + aDouble +" anInt: " + anInt+" aBoolean " + aBoolean+" aString " + aString);
        }

        @Override
        public int getPid() throws RemoteException {
            System.out.println("Thread:"+Thread.currentThread().getName());
            System.out.println("RemoteService getPid");
            return  android.os.Process.myPid();
        }

        @Override
        public String getName(int id) throws RemoteException {
            return names[id];
        }
    };

}