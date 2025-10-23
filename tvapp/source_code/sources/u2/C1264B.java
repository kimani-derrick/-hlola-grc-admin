package u2;

import Z2.AbstractC0156a;
import e2.C0593J;
import e2.K;
import java.util.List;
import k2.InterfaceC0948m;
/* renamed from: u2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14695a;

    /* renamed from: b  reason: collision with root package name */
    public final List f14696b;

    /* renamed from: c  reason: collision with root package name */
    public final k2.w[] f14697c;

    public C1264B(int i7, List list) {
        this.f14695a = i7;
        switch (i7) {
            case 1:
                this.f14696b = list;
                this.f14697c = new k2.w[list.size()];
                return;
            default:
                this.f14696b = list;
                this.f14697c = new k2.w[list.size()];
                return;
        }
    }

    public void a(long j7, Z2.y yVar) {
        if (yVar.a() < 9) {
            return;
        }
        int g7 = yVar.g();
        int g8 = yVar.g();
        int u7 = yVar.u();
        if (g7 == 434 && g8 == 1195456820 && u7 == 3) {
            p6.l.l(j7, yVar, this.f14697c);
        }
    }

    public final void b(InterfaceC0948m interfaceC0948m, F f) {
        boolean z7;
        boolean z8;
        switch (this.f14695a) {
            case 0:
                int i7 = 0;
                while (true) {
                    k2.w[] wVarArr = this.f14697c;
                    if (i7 < wVarArr.length) {
                        f.a();
                        f.b();
                        k2.w q5 = interfaceC0948m.q(f.d, 3);
                        K k5 = (K) this.f14696b.get(i7);
                        String str = k5.f9655B;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        AbstractC0156a.e("Invalid closed caption MIME type provided: " + str, z7);
                        String str2 = k5.f9676q;
                        if (str2 == null) {
                            f.b();
                            str2 = f.f14725e;
                        }
                        C0593J c0593j = new C0593J();
                        c0593j.f9597a = str2;
                        c0593j.f9605k = str;
                        c0593j.d = k5.f9679t;
                        c0593j.f9599c = k5.f9678s;
                        c0593j.f9594C = k5.f9672T;
                        c0593j.f9607m = k5.f9657D;
                        q5.e(new K(c0593j));
                        wVarArr[i7] = q5;
                        i7++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i8 = 0;
                while (true) {
                    k2.w[] wVarArr2 = this.f14697c;
                    if (i8 < wVarArr2.length) {
                        f.a();
                        f.b();
                        k2.w q7 = interfaceC0948m.q(f.d, 3);
                        K k7 = (K) this.f14696b.get(i8);
                        String str3 = k7.f9655B;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        AbstractC0156a.e("Invalid closed caption MIME type provided: " + str3, z8);
                        C0593J c0593j2 = new C0593J();
                        f.b();
                        c0593j2.f9597a = f.f14725e;
                        c0593j2.f9605k = str3;
                        c0593j2.d = k7.f9679t;
                        c0593j2.f9599c = k7.f9678s;
                        c0593j2.f9594C = k7.f9672T;
                        c0593j2.f9607m = k7.f9657D;
                        q7.e(new K(c0593j2));
                        wVarArr2[i8] = q7;
                        i8++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
