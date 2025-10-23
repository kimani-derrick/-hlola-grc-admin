package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class U2 extends C0459n {

    /* renamed from: r  reason: collision with root package name */
    public final C0404c f8435r;

    public U2(C0404c c0404c) {
        this.f8435r = c0404c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C0459n, com.google.android.gms.internal.measurement.InterfaceC0464o
    public final InterfaceC0464o o(String str, C4.b bVar, ArrayList arrayList) {
        char c5;
        U2 u22;
        Object obj;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c5 = 0;
                    u22 = this;
                    break;
                }
                u22 = this;
                c5 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    u22 = this;
                    c5 = 1;
                    break;
                }
                u22 = this;
                c5 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    u22 = this;
                    c5 = 2;
                    break;
                }
                u22 = this;
                c5 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    u22 = this;
                    c5 = 3;
                    break;
                }
                u22 = this;
                c5 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    u22 = this;
                    c5 = 4;
                    break;
                }
                u22 = this;
                c5 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c5 = 5;
                    u22 = this;
                    break;
                }
                u22 = this;
                c5 = 65535;
                break;
            default:
                u22 = this;
                c5 = 65535;
                break;
        }
        C0404c c0404c = u22.f8435r;
        if (c5 != 0) {
            if (c5 != 1) {
                if (c5 != 2) {
                    if (c5 != 3) {
                        if (c5 != 4) {
                            if (c5 != 5) {
                                return super.o(str, bVar, arrayList);
                            }
                            Q.i("setEventName", 1, arrayList);
                            InterfaceC0464o S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                            if (!InterfaceC0464o.f8621e.equals(S6) && !InterfaceC0464o.f.equals(S6)) {
                                c0404c.f8516b.f8532a = S6.g();
                                return new C0474q(S6.g());
                            }
                            throw new IllegalArgumentException("Illegal event name");
                        }
                        Q.i("setParamValue", 2, arrayList);
                        String g7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).g();
                        InterfaceC0464o S7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                        C0409d c0409d = c0404c.f8516b;
                        Object e3 = Q.e(S7);
                        HashMap hashMap = c0409d.f8534c;
                        if (e3 == null) {
                            hashMap.remove(g7);
                        } else {
                            hashMap.put(g7, C0409d.a(hashMap.get(g7), e3, g7));
                        }
                        return S7;
                    }
                    Q.i("getParams", 0, arrayList);
                    HashMap hashMap2 = c0404c.f8516b.f8534c;
                    C0459n c0459n = new C0459n();
                    for (String str2 : hashMap2.keySet()) {
                        c0459n.n(str2, C1.g(hashMap2.get(str2)));
                    }
                    return c0459n;
                }
                Q.i("getParamValue", 1, arrayList);
                String g8 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).g();
                HashMap hashMap3 = c0404c.f8516b.f8534c;
                if (hashMap3.containsKey(g8)) {
                    obj = hashMap3.get(g8);
                } else {
                    obj = null;
                }
                return C1.g(obj);
            }
            Q.i("getTimestamp", 0, arrayList);
            return new C0429h(Double.valueOf(c0404c.f8516b.f8533b));
        }
        Q.i("getEventName", 0, arrayList);
        return new C0474q(c0404c.f8516b.f8532a);
    }
}
