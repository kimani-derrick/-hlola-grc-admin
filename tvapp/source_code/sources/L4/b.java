package L4;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import o4.InterfaceC1071c;
import o4.o;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1071c {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2131q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ o f2132r;

    public /* synthetic */ b(o oVar, int i7) {
        this.f2131q = i7;
        this.f2132r = oVar;
    }

    @Override // o4.InterfaceC1071c
    public final Object h(H.e eVar) {
        switch (this.f2131q) {
            case 0:
                return new e((Context) eVar.c(Context.class), ((h4.f) eVar.c(h4.f.class)).d(), eVar.C(f.class), eVar.d(T4.b.class), (Executor) eVar.g(this.f2132r));
            default:
                return RemoteConfigRegistrar.a(this.f2132r, eVar);
        }
    }
}
