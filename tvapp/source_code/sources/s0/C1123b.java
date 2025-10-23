package s0;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import android.net.Uri;
import android.view.InputEvent;
import k3.AbstractC0958a;
import t0.C1222c;
import z5.C1530l;
/* renamed from: s0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123b extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f13534u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C1125d f13535v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Uri f13536w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ InputEvent f13537x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1123b(C1125d c1125d, Uri uri, InputEvent inputEvent, D5.d dVar) {
        super(2, dVar);
        this.f13535v = c1125d;
        this.f13536w = uri;
        this.f13537x = inputEvent;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1123b(this.f13535v, this.f13536w, this.f13537x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1123b) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f13534u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C1222c c1222c = this.f13535v.f13541a;
            this.f13534u = 1;
            if (c1222c.c(this.f13536w, this.f13537x, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
