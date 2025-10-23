package c2;

import android.os.SystemClock;
/* renamed from: c2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7254a;

    public final long a() {
        switch (this.f7254a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
