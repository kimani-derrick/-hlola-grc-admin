package androidx.activity;

import java.util.ListIterator;
import z5.C1530l;
/* loaded from: classes.dex */
public final class p extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f5347r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ w f5348s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i7) {
        super(0);
        this.f5347r = i7;
        this.f5348s = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // L5.a
    public final Object b() {
        ?? r3;
        switch (this.f5347r) {
            case 0:
                this.f5348s.c();
                return C1530l.f16479a;
            case 1:
                w wVar = this.f5348s;
                n nVar = wVar.f5383c;
                if (nVar == null) {
                    A5.i iVar = wVar.f5382b;
                    ListIterator listIterator = iVar.listIterator(iVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r3 = listIterator.previous();
                            if (((n) r3).f5342a) {
                            }
                        } else {
                            r3 = 0;
                        }
                    }
                    nVar = r3;
                }
                wVar.f5383c = null;
                if (nVar != null) {
                    nVar.a();
                }
                return C1530l.f16479a;
            default:
                this.f5348s.c();
                return C1530l.f16479a;
        }
    }
}
