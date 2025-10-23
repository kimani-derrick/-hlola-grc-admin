package androidx.activity;

import android.window.BackEvent;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f5305a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5306b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5307c;
    public final int d;

    public b(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        a aVar = a.f5304a;
        float d = aVar.d(backEvent);
        float e3 = aVar.e(backEvent);
        float b7 = aVar.b(backEvent);
        int c5 = aVar.c(backEvent);
        this.f5305a = d;
        this.f5306b = e3;
        this.f5307c = b7;
        this.d = c5;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f5305a + ", touchY=" + this.f5306b + ", progress=" + this.f5307c + ", swipeEdge=" + this.d + '}';
    }
}
