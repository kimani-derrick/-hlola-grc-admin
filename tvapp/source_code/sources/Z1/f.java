package Z1;

import H2.U;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b2.C0362a;
import b2.InterfaceC0364c;
import java.util.Objects;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ j f4557q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ T1.i f4558r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f4559s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Runnable f4560t;

    public /* synthetic */ f(j jVar, T1.i iVar, int i7, Runnable runnable) {
        this.f4557q = jVar;
        this.f4558r = iVar;
        this.f4559s = i7;
        this.f4560t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T1.i iVar = this.f4558r;
        int i7 = this.f4559s;
        Runnable runnable = this.f4560t;
        j jVar = this.f4557q;
        InterfaceC0364c interfaceC0364c = jVar.f;
        try {
            try {
                a2.d dVar = jVar.f4574c;
                Objects.requireNonNull(dVar);
                ((a2.j) interfaceC0364c).n(new U(5, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar.f4572a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    jVar.a(iVar, i7);
                } else {
                    ((a2.j) interfaceC0364c).n(new g(jVar, iVar, i7));
                }
            } catch (C0362a unused) {
                jVar.d.a(iVar, i7 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
