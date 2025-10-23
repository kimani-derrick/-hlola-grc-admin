package androidx.activity;

import java.util.ListIterator;
import z5.C1530l;
/* loaded from: classes.dex */
public final class o extends M5.h implements L5.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f5345r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ w f5346s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i7) {
        super(1);
        this.f5345r = i7;
        this.f5346s = wVar;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        b bVar = (b) obj;
        switch (this.f5345r) {
            case 0:
                M5.g.f(bVar, "backEvent");
                w wVar = this.f5346s;
                A5.i iVar = wVar.f5382b;
                ListIterator listIterator = iVar.listIterator(iVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((n) obj2).f5342a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                n nVar = (n) obj2;
                wVar.f5383c = nVar;
                if (nVar != null) {
                    nVar.d(bVar);
                }
                return C1530l.f16479a;
            default:
                M5.g.f(bVar, "backEvent");
                w wVar2 = this.f5346s;
                n nVar2 = wVar2.f5383c;
                if (nVar2 == null) {
                    A5.i iVar2 = wVar2.f5382b;
                    ListIterator listIterator2 = iVar2.listIterator(iVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((n) obj3).f5342a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    nVar2 = (n) obj3;
                }
                if (nVar2 != null) {
                    nVar2.c(bVar);
                }
                return C1530l.f16479a;
        }
    }
}
