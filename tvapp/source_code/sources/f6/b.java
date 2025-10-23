package f6;

import M5.g;
import W5.C0100g;
import W5.InterfaceC0099f;
import h6.B;
import java.lang.reflect.Method;
import k3.AbstractC0958a;
import t3.C1251o;
import t3.InterfaceC1239c;
import x6.C1483p;
import x6.InterfaceC1470c;
import x6.InterfaceC1473f;
import x6.N;
import x6.r;
import z5.C1525g;
/* loaded from: classes.dex */
public final class b implements InterfaceC1239c, InterfaceC1473f {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10442q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0099f f10443r;

    public /* synthetic */ b(C0100g c0100g, int i7) {
        this.f10442q = i7;
        this.f10443r = c0100g;
    }

    @Override // t3.InterfaceC1239c
    public void a(C1251o c1251o) {
        Exception f = c1251o.f();
        if (f == null) {
            if (c1251o.d) {
                this.f10443r.q(null);
                return;
            } else {
                this.f10443r.m(c1251o.g());
                return;
            }
        }
        this.f10443r.m(AbstractC0958a.m(f));
    }

    @Override // x6.InterfaceC1473f
    public void e(InterfaceC1470c interfaceC1470c, N n) {
        C1525g m7;
        switch (this.f10442q) {
            case 1:
                g.g(interfaceC1470c, "call");
                g.g(n, "response");
                boolean f = n.f16285a.f();
                InterfaceC0099f interfaceC0099f = this.f10443r;
                if (f) {
                    Object obj = n.f16286b;
                    if (obj == null) {
                        B h7 = interfaceC1470c.h();
                        h7.getClass();
                        Object cast = r.class.cast(h7.f11073e.get(r.class));
                        if (cast != null) {
                            StringBuilder sb = new StringBuilder("Response from ");
                            Method method = ((r) cast).f16322a;
                            g.b(method, "method");
                            Class<?> declaringClass = method.getDeclaringClass();
                            g.b(declaringClass, "method.declaringClass");
                            sb.append(declaringClass.getName());
                            sb.append('.');
                            sb.append(method.getName());
                            sb.append(" was null but response body type was declared as non-null");
                            m7 = AbstractC0958a.m(new NullPointerException(sb.toString()));
                        } else {
                            NullPointerException nullPointerException = new NullPointerException();
                            g.j(nullPointerException, g.class.getName());
                            throw nullPointerException;
                        }
                    } else {
                        interfaceC0099f.m(obj);
                        return;
                    }
                } else {
                    m7 = AbstractC0958a.m(new C1483p(n));
                }
                interfaceC0099f.m(m7);
                return;
            default:
                g.g(interfaceC1470c, "call");
                g.g(n, "response");
                this.f10443r.m(n);
                return;
        }
    }

    @Override // x6.InterfaceC1473f
    public void f(InterfaceC1470c interfaceC1470c, Throwable th) {
        switch (this.f10442q) {
            case 1:
                g.g(interfaceC1470c, "call");
                g.g(th, "t");
                this.f10443r.m(AbstractC0958a.m(th));
                return;
            default:
                g.g(interfaceC1470c, "call");
                g.g(th, "t");
                this.f10443r.m(AbstractC0958a.m(th));
                return;
        }
    }
}
