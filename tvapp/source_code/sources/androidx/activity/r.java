package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f5351a = new Object();

    public final OnBackInvokedCallback a(L5.a aVar) {
        M5.g.f(aVar, "onBackInvoked");
        return new q(0, aVar);
    }

    public final void b(Object obj, int i7, Object obj2) {
        M5.g.f(obj, "dispatcher");
        M5.g.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        M5.g.f(obj, "dispatcher");
        M5.g.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
