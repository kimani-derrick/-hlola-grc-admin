package w6;

import L5.p;
import M5.l;
import M5.n;
import java.io.IOException;
import v6.InterfaceC1343h;
import v6.z;
import z5.C1530l;
/* loaded from: classes.dex */
public final class e extends M5.h implements p {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ l f16112r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f16113s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ n f16114t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1343h f16115u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f16116v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n f16117w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, long j7, n nVar, z zVar, n nVar2, n nVar3) {
        super(2);
        this.f16112r = lVar;
        this.f16113s = j7;
        this.f16114t = nVar;
        this.f16115u = zVar;
        this.f16116v = nVar2;
        this.f16117w = nVar3;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        long j7;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            l lVar = this.f16112r;
            if (!lVar.f2312q) {
                lVar.f2312q = true;
                if (longValue >= this.f16113s) {
                    n nVar = this.f16114t;
                    long j8 = nVar.f2314q;
                    int i7 = (j8 > 4294967295L ? 1 : (j8 == 4294967295L ? 0 : -1));
                    InterfaceC1343h interfaceC1343h = this.f16115u;
                    if (i7 == 0) {
                        j8 = interfaceC1343h.m();
                    }
                    nVar.f2314q = j8;
                    n nVar2 = this.f16116v;
                    long j9 = 0;
                    if (nVar2.f2314q == 4294967295L) {
                        j7 = interfaceC1343h.m();
                    } else {
                        j7 = 0;
                    }
                    nVar2.f2314q = j7;
                    n nVar3 = this.f16117w;
                    if (nVar3.f2314q == 4294967295L) {
                        j9 = interfaceC1343h.m();
                    }
                    nVar3.f2314q = j9;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return C1530l.f16479a;
    }
}
