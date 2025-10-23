package androidx.activity;

import android.window.OnBackInvokedCallback;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f5377a = new Object();

    public final OnBackInvokedCallback a(L5.l lVar, L5.l lVar2, L5.a aVar, L5.a aVar2) {
        M5.g.f(lVar, "onBackStarted");
        M5.g.f(lVar2, "onBackProgressed");
        M5.g.f(aVar, "onBackInvoked");
        M5.g.f(aVar2, "onBackCancelled");
        return new s(lVar, lVar2, aVar, aVar2);
    }
}
