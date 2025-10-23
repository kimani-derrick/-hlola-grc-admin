package w6;

import L5.p;
import M5.o;
import java.io.IOException;
import v6.InterfaceC1343h;
import v6.z;
import z5.C1530l;
/* loaded from: classes.dex */
public final class f extends M5.h implements p {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1343h f16118r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ o f16119s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ o f16120t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ o f16121u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, o oVar, o oVar2, o oVar3) {
        super(2);
        this.f16118r = zVar;
        this.f16119s = oVar;
        this.f16120t = oVar2;
        this.f16121u = oVar3;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        InterfaceC1343h interfaceC1343h;
        boolean z7;
        boolean z8;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j7 = 1;
            if (longValue >= 1) {
                byte readByte = this.f16118r.readByte();
                boolean z9 = true;
                if ((readByte & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((readByte & 2) == 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((readByte & 4) != 4) {
                    z9 = false;
                }
                if (z7) {
                    j7 = 5;
                }
                if (z8) {
                    j7 += 4;
                }
                if (z9) {
                    j7 += 4;
                }
                if (longValue >= j7) {
                    if (z7) {
                        this.f16119s.f2315q = Long.valueOf(interfaceC1343h.H() * 1000);
                    }
                    if (z8) {
                        this.f16120t.f2315q = Long.valueOf(interfaceC1343h.H() * 1000);
                    }
                    if (z9) {
                        this.f16121u.f2315q = Long.valueOf(interfaceC1343h.H() * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return C1530l.f16479a;
    }
}
