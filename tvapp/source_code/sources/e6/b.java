package e6;

import L5.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1530l;
/* loaded from: classes.dex */
public final class b extends M5.h implements l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f10177r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d f10178s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ c f10179t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i7) {
        super(1);
        this.f10177r = i7;
        this.f10178s = dVar;
        this.f10179t = cVar;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.f10177r) {
            case 0:
                this.f10178s.e(this.f10179t.f10181r);
                return C1530l.f16479a;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f10183h;
                c cVar = this.f10179t;
                Object obj2 = cVar.f10181r;
                d dVar = this.f10178s;
                atomicReferenceFieldUpdater.set(dVar, obj2);
                dVar.e(cVar.f10181r);
                return C1530l.f16479a;
        }
    }
}
