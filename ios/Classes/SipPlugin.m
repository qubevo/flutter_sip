#import "SipPlugin.h"
#import <sip/sip-Swift.h>

@implementation SipPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftSipPlugin registerWithRegistrar:registrar];
}
@end
