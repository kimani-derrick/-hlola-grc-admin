package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import j3.C0837a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0852F;
import s3.AbstractC1204v0;
/* renamed from: com.google.android.gms.internal.measurement.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430h0 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile C0430h0 f8565i;

    /* renamed from: a  reason: collision with root package name */
    public final String f8566a = "FA";

    /* renamed from: b  reason: collision with root package name */
    public final C0837a f8567b = C0837a.f11847a;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f8568c;
    public final C0852F d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8569e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8570g;

    /* renamed from: h  reason: collision with root package name */
    public volatile V f8571h;

    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.measurement.m0, java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C0430h0(Context context, Bundle bundle) {
        ?? obj = new Object();
        obj.f8612a = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8568c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new C0852F(10, this);
        this.f8569e = new ArrayList();
        try {
            String b7 = AbstractC1204v0.b(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(b7)) {
                b7 = AbstractC1204v0.b(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", b7);
            String str = null;
            if (identifier != 0) {
                try {
                    str = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (str != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0430h0.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f8570g = true;
                    Log.w(this.f8566a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        if (!true) {
            Log.w(this.f8566a, "Specified origin or custom app id is null. Both parameters will be ignored.");
        }
        e(new C0440j0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f8566a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0420f0(this));
        }
    }

    public static C0430h0 b(Context context, Bundle bundle) {
        g3.n.g(context);
        if (f8565i == null) {
            synchronized (C0430h0.class) {
                try {
                    if (f8565i == null) {
                        f8565i = new C0430h0(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f8565i;
    }

    public final int a(String str) {
        T t5 = new T();
        e(new C0475q0(this, str, t5));
        Integer num = (Integer) T.A(t5.z(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List c(String str, String str2) {
        T t5 = new T();
        e(new C0445k0(this, str, str2, t5, 1));
        List list = (List) T.A(t5.z(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map d(String str, String str2, boolean z7) {
        T t5 = new T();
        e(new C0479r0(this, str, str2, z7, t5));
        Bundle z8 = t5.z(5000L);
        if (z8 == null || z8.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(z8.size());
        for (String str3 : z8.keySet()) {
            Object obj = z8.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void e(AbstractRunnableC0415e0 abstractRunnableC0415e0) {
        this.f8568c.execute(abstractRunnableC0415e0);
    }

    public final void f(Exception exc, boolean z7, boolean z8) {
        this.f8570g |= z7;
        String str = this.f8566a;
        if (z7) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z8) {
            e(new C0475q0(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }
}
