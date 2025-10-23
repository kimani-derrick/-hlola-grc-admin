package g1;

import D5.d;
import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import Y0.c;
import com.boxhdo.android.data.model.response.ErrorResponse;
import h6.I;
import h6.v;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import k3.AbstractC0958a;
import p6.l;
import v6.InterfaceC1343h;
import x6.C1483p;
import x6.N;
import z5.C1525g;
import z5.C1530l;
/* renamed from: g1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708a extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f10505u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f10506v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f10507w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708a(p pVar, d dVar) {
        super(2, dVar);
        this.f10507w = pVar;
    }

    @Override // F5.a
    public final d h(d dVar, Object obj) {
        C0708a c0708a = new C0708a(this.f10507w, dVar);
        c0708a.f10506v = obj;
        return c0708a;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0708a) h((d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String str;
        Object m7;
        I i7;
        Charset a7;
        E5.a aVar = E5.a.f612q;
        int i8 = this.f10505u;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    AbstractC0958a.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0958a.H(obj);
                InterfaceC0116x interfaceC0116x = (InterfaceC0116x) this.f10506v;
                p pVar = this.f10507w;
                this.f10505u = 1;
                obj = pVar.j(interfaceC0116x, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (c) obj;
        } catch (Exception e3) {
            if (!(e3 instanceof CancellationException)) {
                String str2 = null;
                if (e3 instanceof C1483p) {
                    C1483p c1483p = (C1483p) e3;
                    int i9 = c1483p.f16316q;
                    if (i9 != 400) {
                        if (i9 != 401) {
                            return new Y0.a(new H1.a(null));
                        }
                        return new Y0.a(new IOException());
                    }
                    N n = c1483p.f16317r;
                    if (n != null && (i7 = n.f16287c) != null) {
                        InterfaceC1343h f = i7.f();
                        try {
                            v b7 = i7.b();
                            if (b7 == null) {
                                a7 = null;
                            } else {
                                a7 = b7.a(U5.a.f3474a);
                            }
                            if (a7 == null) {
                                a7 = U5.a.f3474a;
                            }
                            str = f.S(i6.b.s(f, a7));
                            l.i(f, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                l.i(f, th);
                                throw th2;
                            }
                        }
                    } else {
                        str = null;
                    }
                    String str3 = "";
                    if (str == null) {
                        str = "";
                    }
                    try {
                        m7 = (ErrorResponse) b.f10508a.a(ErrorResponse.class).a(str);
                    } catch (Throwable th3) {
                        m7 = AbstractC0958a.m(th3);
                    }
                    if (m7 instanceof C1525g) {
                        m7 = null;
                    }
                    ErrorResponse errorResponse = (ErrorResponse) m7;
                    if (errorResponse != null) {
                        str2 = errorResponse.f7501a;
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    return new Y0.a(new H1.a(str3));
                } else if (e3 instanceof H1.b) {
                    return new Y0.a(new IOException());
                } else {
                    if (e3 instanceof IOException) {
                        return new Y0.a(new Throwable());
                    }
                    return new Y0.a(new H1.a(null));
                }
            }
            throw e3;
        }
    }
}
