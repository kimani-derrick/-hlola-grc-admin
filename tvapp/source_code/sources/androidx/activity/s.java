package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L5.l f5374a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L5.l f5375b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ L5.a f5376c;
    public final /* synthetic */ L5.a d;

    public s(L5.l lVar, L5.l lVar2, L5.a aVar, L5.a aVar2) {
        this.f5374a = lVar;
        this.f5375b = lVar2;
        this.f5376c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.b();
    }

    public final void onBackInvoked() {
        this.f5376c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        this.f5375b.c(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        M5.g.f(backEvent, "backEvent");
        this.f5374a.c(new b(backEvent));
    }
}
