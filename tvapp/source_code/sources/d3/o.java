package d3;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: e  reason: collision with root package name */
    public final Callable f9249e;

    public /* synthetic */ o(h hVar) {
        super(false, null, null);
        this.f9249e = hVar;
    }

    @Override // d3.p
    public final String a() {
        try {
            return (String) this.f9249e.call();
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
