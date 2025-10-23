package W5;

import java.util.concurrent.locks.LockSupport;
/* renamed from: W5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096c extends AbstractC0092a {

    /* renamed from: t  reason: collision with root package name */
    public final Thread f3976t;

    /* renamed from: u  reason: collision with root package name */
    public final Q f3977u;

    public C0096c(D5.i iVar, Thread thread, Q q5) {
        super(iVar, true);
        this.f3976t = thread;
        this.f3977u = q5;
    }

    @Override // W5.j0
    public final void t(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f3976t;
        if (!M5.g.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
