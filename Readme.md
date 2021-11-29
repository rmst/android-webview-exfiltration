
Loads a local version of https://webrtc.github.io/samples/src/content/peerconnection/trickle-ice/ into an Android webview to test whether JS code inside of the webview can trigger network traffic and potentially exfiltrate information that might have been put into the Webview via a Java interface.

### Test Results

#### Android Webview 96.0.4664.45
Loads WebRTC local address as well as public IP (if STUN server is added) despite `WebSettings::setBlockNetworkLoads(true)`. According to https://groups.google.com/a/chromium.org/g/android-webview-dev/c/bk_NMK9evKg/m/N5w3HTwKBwAJ this is considered a bug.