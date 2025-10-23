package k1;

import android.net.Uri;
import z5.C1526h;
/* renamed from: k1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932e extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Uri f12130t;

    /* renamed from: u  reason: collision with root package name */
    public C0935h f12131u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f12132v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0935h f12133w;

    /* renamed from: x  reason: collision with root package name */
    public int f12134x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0932e(C0935h c0935h, D5.d dVar) {
        super(dVar);
        this.f12133w = c0935h;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f12132v = obj;
        this.f12134x |= Integer.MIN_VALUE;
        Object b7 = this.f12133w.b(null, null, null, this);
        if (b7 == E5.a.f612q) {
            return b7;
        }
        return new C1526h(b7);
    }
}
