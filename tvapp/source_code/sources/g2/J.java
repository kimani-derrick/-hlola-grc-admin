package g2;

import H2.C0002c;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import e2.C0586C;
/* loaded from: classes.dex */
public final class J extends AudioTrack$StreamEventCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0002c f10534a;

    public J(C0002c c0002c) {
        this.f10534a = c0002c;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        K k5;
        Z5.n nVar;
        C0586C c0586c;
        if (audioTrack.equals(((K) this.f10534a.f1019t).f10586v) && (nVar = (k5 = (K) this.f10534a.f1019t).f10582r) != null && k5.f10558V && (c0586c = ((N) nVar.f4918q).f10602g1) != null) {
            c0586c.f9477a.f9544x.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        K k5;
        Z5.n nVar;
        C0586C c0586c;
        if (audioTrack.equals(((K) this.f10534a.f1019t).f10586v) && (nVar = (k5 = (K) this.f10534a.f1019t).f10582r) != null && k5.f10558V && (c0586c = ((N) nVar.f4918q).f10602g1) != null) {
            c0586c.f9477a.f9544x.d(2);
        }
    }
}
