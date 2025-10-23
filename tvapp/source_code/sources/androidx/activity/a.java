package androidx.activity;

import android.window.BackEvent;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5304a = new Object();

    public final BackEvent a(float f, float f7, float f8, int i7) {
        return new BackEvent(f, f7, f8, i7);
    }

    public final float b(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
