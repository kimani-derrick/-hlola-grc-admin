package k1;

import java.io.Serializable;
import z5.C1526h;
/* renamed from: k1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931d extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public String f12125t;

    /* renamed from: u  reason: collision with root package name */
    public C0935h f12126u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f12127v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0935h f12128w;

    /* renamed from: x  reason: collision with root package name */
    public int f12129x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0931d(C0935h c0935h, D5.d dVar) {
        super(dVar);
        this.f12128w = c0935h;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f12127v = obj;
        this.f12129x |= Integer.MIN_VALUE;
        Serializable a7 = this.f12128w.a(null, null, null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
