package f2;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ NetworkEvent.Builder b() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder f() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder h() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder l(int i7) {
        return new TrackChangeEvent.Builder(i7);
    }
}
