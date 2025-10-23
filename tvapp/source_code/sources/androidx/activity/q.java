package androidx.activity;

import android.window.OnBackInvokedCallback;
/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5350b;

    public /* synthetic */ q(int i7, Object obj) {
        this.f5349a = i7;
        this.f5350b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f5349a) {
            case 0:
                L5.a aVar = (L5.a) this.f5350b;
                M5.g.f(aVar, "$onBackInvoked");
                aVar.b();
                return;
            default:
                ((Runnable) this.f5350b).run();
                return;
        }
    }
}
