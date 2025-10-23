package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import l3.BinderC0971b;
import s3.AbstractC1204v0;
/* renamed from: com.google.android.gms.internal.measurement.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440j0 extends AbstractRunnableC0415e0 {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f8583u = null;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f8584v = null;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f8585w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Bundle f8586x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ C0430h0 f8587y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0440j0(C0430h0 c0430h0, Context context, Bundle bundle) {
        super(c0430h0, true);
        this.f8585w = context;
        this.f8586x = bundle;
        this.f8587y = c0430h0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0415e0
    public final void a() {
        boolean z7;
        String str;
        String str2;
        String str3;
        boolean z8;
        try {
            C0430h0 c0430h0 = this.f8587y;
            String str4 = this.f8583u;
            String str5 = this.f8584v;
            c0430h0.getClass();
            if (str5 != null && str4 != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0430h0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    z7 = true;
                }
            }
            z7 = false;
            V v5 = null;
            if (z7) {
                str3 = this.f8584v;
                str2 = this.f8583u;
                str = this.f8587y.f8566a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            g3.n.g(this.f8585w);
            C0430h0 c0430h02 = this.f8587y;
            Context context = this.f8585w;
            c0430h02.getClass();
            try {
                v5 = U.asInterface(m3.e.c(context, m3.e.f12417b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (m3.b e3) {
                c0430h02.f(e3, true, false);
            }
            c0430h02.f8571h = v5;
            if (this.f8587y.f8571h == null) {
                Log.w(this.f8587y.f8566a, "Failed to connect to measurement client.");
                return;
            }
            int a7 = m3.e.a(this.f8585w, ModuleDescriptor.MODULE_ID);
            int d = m3.e.d(this.f8585w, ModuleDescriptor.MODULE_ID, false);
            int max = Math.max(a7, d);
            if (d < a7) {
                z8 = true;
            } else {
                z8 = false;
            }
            C0405c0 c0405c0 = new C0405c0(95001L, max, z8, str, str2, str3, this.f8586x, AbstractC1204v0.b(this.f8585w));
            V v7 = this.f8587y.f8571h;
            g3.n.g(v7);
            v7.initialize(new BinderC0971b(this.f8585w), c0405c0, this.f8544q);
        } catch (Exception e7) {
            this.f8587y.f(e7, true, false);
        }
    }
}
