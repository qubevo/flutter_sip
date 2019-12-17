import 'dart:async';

import 'package:flutter/services.dart';

class Sip {
  static const MethodChannel _channel =
      const MethodChannel('sip');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
