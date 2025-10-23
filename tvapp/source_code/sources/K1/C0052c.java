package K1;

import java.io.Serializable;
import java.util.ArrayList;
import z5.C1526h;
/* renamed from: K1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052c extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public C0053d f1572t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f1573u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f1574v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f1575w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ C0053d f1576x;

    /* renamed from: y  reason: collision with root package name */
    public int f1577y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052c(C0053d c0053d, D5.d dVar) {
        super(dVar);
        this.f1576x = c0053d;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1575w = obj;
        this.f1577y |= Integer.MIN_VALUE;
        Serializable a7 = this.f1576x.a(null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
