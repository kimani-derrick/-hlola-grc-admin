package com.google.firebase;

import L4.e;
import L4.h;
import T4.a;
import T4.b;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import f2.d;
import h4.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n4.InterfaceC1036a;
import o4.C1069a;
import o4.g;
import o4.o;
import z5.C1521c;
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        X a7 = C1069a.a(b.class);
        a7.b(new g(2, 0, a.class));
        a7.f = new A4.a(17);
        arrayList.add(a7.c());
        o oVar = new o(InterfaceC1036a.class, Executor.class);
        X x7 = new X(e.class, new Class[]{L4.g.class, h.class});
        x7.b(g.a(Context.class));
        x7.b(g.a(f.class));
        x7.b(new g(2, 0, L4.f.class));
        x7.b(new g(1, 1, b.class));
        x7.b(new g(oVar, 1, 0));
        x7.f = new L4.b(oVar, 0);
        arrayList.add(x7.c());
        arrayList.add(m3.g.h("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(m3.g.h("fire-core", "21.0.0"));
        arrayList.add(m3.g.h("device-name", a(Build.PRODUCT)));
        arrayList.add(m3.g.h("device-model", a(Build.DEVICE)));
        arrayList.add(m3.g.h("device-brand", a(Build.BRAND)));
        arrayList.add(m3.g.n("android-target-sdk", new d(15)));
        arrayList.add(m3.g.n("android-min-sdk", new d(16)));
        arrayList.add(m3.g.n("android-platform", new d(17)));
        arrayList.add(m3.g.n("android-installer", new d(18)));
        try {
            C1521c.f16465r.getClass();
            str = "1.9.22";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(m3.g.h("kotlin", str));
        }
        return arrayList;
    }
}
