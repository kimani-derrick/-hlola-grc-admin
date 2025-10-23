package g2;

import Z2.AbstractC0156a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* renamed from: g2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721l {

    /* renamed from: a  reason: collision with root package name */
    public final O3.E f10699a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10700b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f10701c = new ByteBuffer[0];
    public boolean d;

    public C0721l(O3.U u7) {
        this.f10699a = u7;
        C0722m c0722m = C0722m.f10702e;
        this.d = false;
    }

    public final C0722m a(C0722m c0722m) {
        if (!c0722m.equals(C0722m.f10702e)) {
            int i7 = 0;
            while (true) {
                O3.E e3 = this.f10699a;
                if (i7 < e3.size()) {
                    InterfaceC0724o interfaceC0724o = (InterfaceC0724o) e3.get(i7);
                    C0722m c5 = interfaceC0724o.c(c0722m);
                    if (interfaceC0724o.a()) {
                        AbstractC0156a.k(!c5.equals(C0722m.f10702e));
                        c0722m = c5;
                    }
                    i7++;
                } else {
                    return c0722m;
                }
            }
        } else {
            throw new C0723n(c0722m);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f10700b;
        arrayList.clear();
        this.d = false;
        int i7 = 0;
        while (true) {
            O3.E e3 = this.f10699a;
            if (i7 >= e3.size()) {
                break;
            }
            InterfaceC0724o interfaceC0724o = (InterfaceC0724o) e3.get(i7);
            interfaceC0724o.flush();
            if (interfaceC0724o.a()) {
                arrayList.add(interfaceC0724o);
            }
            i7++;
        }
        this.f10701c = new ByteBuffer[arrayList.size()];
        for (int i8 = 0; i8 <= c(); i8++) {
            this.f10701c[i8] = ((InterfaceC0724o) arrayList.get(i8)).b();
        }
    }

    public final int c() {
        return this.f10701c.length - 1;
    }

    public final boolean d() {
        if (this.d && ((InterfaceC0724o) this.f10700b.get(c())).e() && !this.f10701c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return !this.f10700b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0721l)) {
            return false;
        }
        C0721l c0721l = (C0721l) obj;
        O3.E e3 = this.f10699a;
        if (e3.size() != c0721l.f10699a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < e3.size(); i7++) {
            if (e3.get(i7) != c0721l.f10699a.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z7;
        ByteBuffer byteBuffer2;
        boolean z8;
        do {
            z7 = false;
            for (int i7 = 0; i7 <= c(); i7++) {
                if (!this.f10701c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f10700b;
                    InterfaceC0724o interfaceC0724o = (InterfaceC0724o) arrayList.get(i7);
                    if (interfaceC0724o.e()) {
                        if (!this.f10701c[i7].hasRemaining() && i7 < c()) {
                            ((InterfaceC0724o) arrayList.get(i7 + 1)).d();
                        }
                    } else {
                        if (i7 > 0) {
                            byteBuffer2 = this.f10701c[i7 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = InterfaceC0724o.f10706a;
                        }
                        interfaceC0724o.f(byteBuffer2);
                        this.f10701c[i7] = interfaceC0724o.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f10701c[i7].hasRemaining()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        z7 |= z8;
                    }
                }
            }
        } while (z7);
    }

    public final void g() {
        int i7 = 0;
        while (true) {
            O3.E e3 = this.f10699a;
            if (i7 < e3.size()) {
                InterfaceC0724o interfaceC0724o = (InterfaceC0724o) e3.get(i7);
                interfaceC0724o.flush();
                interfaceC0724o.g();
                i7++;
            } else {
                this.f10701c = new ByteBuffer[0];
                C0722m c0722m = C0722m.f10702e;
                this.d = false;
                return;
            }
        }
    }

    public final int hashCode() {
        return this.f10699a.hashCode();
    }
}
