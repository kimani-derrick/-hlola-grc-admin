package com.google.firebase.crashlytics;

import H2.U;
import N4.e;
import X4.a;
import a5.C0215a;
import a5.C0217c;
import a5.EnumC0218d;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import e6.d;
import h4.f;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l4.InterfaceC0974b;
import o4.C1069a;
import o4.g;
import q4.c;
import r4.C1119a;
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9172a = 0;

    static {
        EnumC0218d enumC0218d = EnumC0218d.f5191q;
        Map map = C0217c.f5190b;
        if (map.containsKey(enumC0218d)) {
            Log.d("SessionsDependencies", "Dependency " + enumC0218d + " already added.");
            return;
        }
        map.put(enumC0218d, new C0215a(new d(true)));
        Log.d("SessionsDependencies", "Dependency to " + enumC0218d + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        X a7 = C1069a.a(c.class);
        a7.f9776a = "fire-cls";
        a7.b(g.a(f.class));
        a7.b(g.a(e.class));
        a7.b(new g(0, 2, C1119a.class));
        a7.b(new g(0, 2, InterfaceC0974b.class));
        a7.b(new g(0, 2, a.class));
        a7.f = new U(23, this);
        a7.d();
        return Arrays.asList(a7.c(), m3.g.h("fire-cls", "19.0.1"));
    }
}
