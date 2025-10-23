package com.google.firebase.analytics;

import N4.d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.android.gms.internal.measurement.C0445k0;
import g3.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k4.C0960a;
import m3.g;
import s3.K0;
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f9167b;

    /* renamed from: a  reason: collision with root package name */
    public final C0430h0 f9168a;

    public FirebaseAnalytics(C0430h0 c0430h0) {
        n.g(c0430h0);
        this.f9168a = c0430h0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f9167b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f9167b == null) {
                        f9167b = new FirebaseAnalytics(C0430h0.b(context, null));
                    }
                } finally {
                }
            }
        }
        return f9167b;
    }

    @Keep
    public static K0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C0430h0 b7 = C0430h0.b(context, bundle);
        if (b7 == null) {
            return null;
        }
        return new C0960a(b7);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) g.b(d.e().d(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        } catch (ExecutionException e7) {
            throw new IllegalStateException(e7.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        C0430h0 c0430h0 = this.f9168a;
        c0430h0.getClass();
        c0430h0.e(new C0445k0(c0430h0, activity, str, str2));
    }
}
