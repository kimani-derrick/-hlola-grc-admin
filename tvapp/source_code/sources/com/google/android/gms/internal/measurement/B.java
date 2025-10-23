package com.google.android.gms.internal.measurement;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8228a;

    /* renamed from: b  reason: collision with root package name */
    public final C4.b f8229b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8230c;

    public /* synthetic */ B(C4.b bVar, String str, int i7) {
        this.f8228a = i7;
        this.f8229b = bVar;
        this.f8230c = str;
    }

    public final C4.b a(InterfaceC0464o interfaceC0464o) {
        switch (this.f8228a) {
            case 0:
                C4.b Z6 = this.f8229b.Z();
                String str = this.f8230c;
                Z6.g0(str, interfaceC0464o);
                ((HashMap) Z6.f424u).put(str, Boolean.TRUE);
                return Z6;
            case 1:
                C4.b Z7 = this.f8229b.Z();
                Z7.g0(this.f8230c, interfaceC0464o);
                return Z7;
            default:
                String str2 = this.f8230c;
                C4.b bVar = this.f8229b;
                bVar.g0(str2, interfaceC0464o);
                return bVar;
        }
    }
}
