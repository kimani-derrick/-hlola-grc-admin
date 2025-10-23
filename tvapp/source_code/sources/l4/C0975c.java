package l4;

import J3.e;
import android.os.Bundle;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.android.gms.internal.measurement.C0484s0;
import g3.n;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import k.C0852F;
import m4.AbstractC0996a;
/* renamed from: l4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975c implements InterfaceC0974b {

    /* renamed from: c  reason: collision with root package name */
    public static volatile C0975c f12265c;

    /* renamed from: a  reason: collision with root package name */
    public final C0852F f12266a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f12267b;

    public C0975c(C0852F c0852f) {
        n.g(c0852f);
        this.f12266a = c0852f;
        this.f12267b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!(!AbstractC0996a.f12435c.contains(str)) || !AbstractC0996a.a(str2, bundle) || !AbstractC0996a.b(str, str2, bundle)) {
            return;
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        C0430h0 c0430h0 = (C0430h0) this.f12266a.f11874r;
        c0430h0.getClass();
        c0430h0.e(new C0484s0(c0430h0, str, str2, bundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e b(String str, D d) {
        C0852F c0852f;
        if (!(!AbstractC0996a.f12435c.contains(str))) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f12267b;
        if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean equals = "fiam".equals(str);
        C0852F c0852f2 = this.f12266a;
        if (equals) {
            D d7 = new D(21, false);
            d7.f5884s = d;
            c0852f2.C(new m4.c(0, d7));
            d7.f5883r = new HashSet();
            c0852f = d7;
        } else if ("clx".equals(str)) {
            C0852F c0852f3 = new C0852F(7, false);
            c0852f3.f11874r = d;
            c0852f2.C(new m4.c(1, c0852f3));
            c0852f = c0852f3;
        } else {
            c0852f = null;
        }
        if (c0852f == null) {
            return null;
        }
        concurrentHashMap.put(str, c0852f);
        return new e(28);
    }
}
