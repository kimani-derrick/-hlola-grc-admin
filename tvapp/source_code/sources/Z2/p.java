package Z2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final B f4648a;

    /* renamed from: b  reason: collision with root package name */
    public final D f4649b;

    /* renamed from: c  reason: collision with root package name */
    public final n f4650c;
    public final CopyOnWriteArraySet d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f4651e;
    public final ArrayDeque f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4652g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4653h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4654i;

    public p(Looper looper, B b7, n nVar) {
        this(new CopyOnWriteArraySet(), looper, b7, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f4652g) {
            try {
                if (this.f4653h) {
                    return;
                }
                this.d.add(new o(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        D d = this.f4649b;
        if (!d.f4597a.hasMessages(0)) {
            d.getClass();
            C b7 = D.b();
            b7.f4595a = d.f4597a.obtainMessage(0);
            d.getClass();
            Message message = b7.f4595a;
            message.getClass();
            d.f4597a.sendMessageAtFrontOfQueue(message);
            b7.a();
        }
        ArrayDeque arrayDeque2 = this.f4651e;
        boolean z7 = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z7) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i7, m mVar) {
        f();
        this.f.add(new l(new CopyOnWriteArraySet(this.d), i7, mVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.f4652g) {
            this.f4653h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f4650c;
            oVar.d = true;
            if (oVar.f4647c) {
                oVar.f4647c = false;
                nVar.b(oVar.f4645a, oVar.f4646b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, m mVar) {
        c(i7, mVar);
        b();
    }

    public final void f() {
        boolean z7;
        if (!this.f4654i) {
            return;
        }
        if (Thread.currentThread() == this.f4649b.f4597a.getLooper().getThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, B b7, n nVar, boolean z7) {
        this.f4648a = b7;
        this.d = copyOnWriteArraySet;
        this.f4650c = nVar;
        this.f4652g = new Object();
        this.f4651e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.f4649b = b7.a(looper, new Handler.Callback() { // from class: Z2.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    if (!oVar.d && oVar.f4647c) {
                        C0162g c5 = oVar.f4646b.c();
                        oVar.f4646b = new I.h();
                        oVar.f4647c = false;
                        pVar.f4650c.b(oVar.f4645a, c5);
                    }
                    if (pVar.f4649b.f4597a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f4654i = z7;
    }
}
