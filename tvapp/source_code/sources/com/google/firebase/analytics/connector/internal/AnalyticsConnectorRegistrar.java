package com.google.firebase.analytics.connector.internal;

import K4.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import g3.n;
import h4.f;
import java.util.Arrays;
import java.util.List;
import l4.C0975c;
import l4.ExecutorC0976d;
import l4.InterfaceC0974b;
import m4.C0997b;
import o4.C1069a;
import o4.InterfaceC1070b;
import o4.g;
import o4.i;
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC0974b lambda$getComponents$0(InterfaceC1070b interfaceC1070b) {
        f fVar = (f) interfaceC1070b.c(f.class);
        Context context = (Context) interfaceC1070b.c(Context.class);
        b bVar = (b) interfaceC1070b.c(b.class);
        n.g(fVar);
        n.g(context);
        n.g(bVar);
        n.g(context.getApplicationContext());
        if (C0975c.f12265c == null) {
            synchronized (C0975c.class) {
                try {
                    if (C0975c.f12265c == null) {
                        Bundle bundle = new Bundle(1);
                        fVar.a();
                        if ("[DEFAULT]".equals(fVar.f10988b)) {
                            ((i) bVar).a(new ExecutorC0976d(0), new L4.f(28));
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.h());
                        }
                        C0975c.f12265c = new C0975c(C0430h0.b(context, bundle).d);
                    }
                } finally {
                }
            }
        }
        return C0975c.f12265c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1069a> getComponents() {
        X a7 = C1069a.a(InterfaceC0974b.class);
        a7.b(g.a(f.class));
        a7.b(g.a(Context.class));
        a7.b(g.a(b.class));
        a7.f = new C0997b(0);
        a7.d();
        return Arrays.asList(a7.c(), m3.g.h("fire-analytics", "22.0.1"));
    }
}
