package e.jesus.pushnotifications;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Jesus on 27/12/2017.
 */

public class FirebaseService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("FireBaseService", remoteMessage.getFrom());
        Log.d("FireBaseService", "cuerpo" + remoteMessage.getNotification());
    }
}
