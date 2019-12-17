package com.qubevo.sip;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.qubevo.sip.dto.AccountConfigurationDTO;

import java.util.HashMap;
import java.util.Map;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;


public class SipPlugin implements MethodCallHandler {

    Activity context;
    MethodChannel methodChannel;

    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "sip");
        channel.setMethodCallHandler(new SipPlugin());
    }
    @Override
    public void onMethodCall(MethodCall call, Result result) {
        if (call.method.equals("getPlatformVersion")) {
            Log.d("-----", "uraa");
            result.success("Android " + android.os.Build.VERSION.RELEASE);
        } else {
            result.notImplemented();
        }
    }

    public void createAccount() {
        AccountConfigurationDTO acc = new AccountConfigurationDTO();
        acc.name = "POC USER";
        acc.username = "998100601136";
        acc.password = "EW8T1YFvwA18";
        acc.domain = "172.16.171.60";
        acc.transport = "TCP";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("X-Mobile-Version", "v100\r\nX-PushId: com.cirpack.poc2\r\nX-Push-Device: 21232333\r\nX-PushToken: \r\nX-DEVICE-CLASS: 2\r\nX-PushId: com.cirpack.poc2");
        acc.regHeaders = headers;
        Intent intent = PjActions.createAccountCreateIntent(context, acc);
        context.startService(intent);
    }
}