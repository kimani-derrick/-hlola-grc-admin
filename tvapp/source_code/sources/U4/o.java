package U4;

import f3.InterfaceC0696a;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class o implements InterfaceC0696a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f3464a = new AtomicReference();

    @Override // f3.InterfaceC0696a
    public final void a(boolean z7) {
        Random random = p.f3465j;
        synchronized (p.class) {
            for (f fVar : p.f3466k.values()) {
                fVar.c(z7);
            }
        }
    }
}
