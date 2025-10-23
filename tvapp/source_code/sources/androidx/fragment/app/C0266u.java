package androidx.fragment.app;

import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: androidx.fragment.app.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266u extends AbstractC0268w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Z5.n f6084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f6085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p6.l f6086c;
    public final /* synthetic */ androidx.activity.result.b d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC0269x f6087e;

    public C0266u(TVUpdateFragment tVUpdateFragment, Z5.n nVar, AtomicReference atomicReference, p6.l lVar, androidx.activity.result.b bVar) {
        this.f6087e = tVUpdateFragment;
        this.f6084a = nVar;
        this.f6085b = atomicReference;
        this.f6086c = lVar;
        this.d = bVar;
    }

    @Override // androidx.fragment.app.AbstractC0268w
    public final void a() {
        androidx.activity.h hVar;
        StringBuilder sb = new StringBuilder("fragment_");
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6087e;
        sb.append(componentCallbacksC0269x.f6138u);
        sb.append("_rq#");
        sb.append(componentCallbacksC0269x.f6131j0.getAndIncrement());
        String sb2 = sb.toString();
        Z5.n nVar = this.f6084a;
        nVar.getClass();
        ComponentCallbacksC0269x componentCallbacksC0269x2 = (ComponentCallbacksC0269x) nVar.f4918q;
        C0271z c0271z = componentCallbacksC0269x2.f6107K;
        if (c0271z instanceof androidx.activity.result.h) {
            hVar = c0271z.f6150v.f5323A;
        } else {
            hVar = componentCallbacksC0269x2.Z().f5323A;
        }
        this.f6085b.set(hVar.c(sb2, componentCallbacksC0269x, this.f6086c, this.d));
    }
}
