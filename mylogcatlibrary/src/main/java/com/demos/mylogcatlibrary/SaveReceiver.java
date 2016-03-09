package com.demos.mylogcatlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SaveReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//Log.d("alogcat", "received intent for save");

        com.demos.mylogcatlibrary.Intent.handleExtras(context, intent);

		Lock.acquire(context);

		Intent svcIntent = new Intent(context, SaveService.class);
		context.startService(svcIntent);
	}
}
