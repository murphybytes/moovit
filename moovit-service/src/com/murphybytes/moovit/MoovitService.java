package com.murphybytes.moovit;

import java.util.Random;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MoovitService extends Service {
	private final IBinder binder = new MoovitBinder();
	private final Random random = new Random();
	
	public class MoovitBinder extends Binder {
		MoovitService getService() {
			return MoovitService.this;
		}
	
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		return binder;
	}
	
	public int getRandomNumber() {
		return random.nextInt();
	}

}
