package K;

import W5.AbstractC0117y;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.Locale;
import r0.AbstractC1111a;
import z5.C1530l;
/* renamed from: K.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e implements InterfaceC0028d, InterfaceC0030f, Z5.b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1475q;

    /* renamed from: r  reason: collision with root package name */
    public Object f1476r;

    /* renamed from: s  reason: collision with root package name */
    public int f1477s;

    /* renamed from: t  reason: collision with root package name */
    public int f1478t;

    /* renamed from: u  reason: collision with root package name */
    public Object f1479u;

    /* renamed from: v  reason: collision with root package name */
    public Object f1480v;

    public /* synthetic */ C0029e() {
        this.f1475q = 0;
    }

    @Override // K.InterfaceC0028d
    public void H(int i7) {
        this.f1478t = i7;
    }

    public C0029e a(D5.i iVar, int i7, int i8) {
        return new C0029e((L5.q) this.f1480v, (Z5.b) this.f1479u, iVar, i7, i8);
    }

    public Object b(Z5.c cVar, D5.d dVar) {
        Object e3 = AbstractC0117y.e(new a6.k(null, this, cVar), dVar);
        if (e3 == E5.a.f612q) {
            return e3;
        }
        return C1530l.f16479a;
    }

    public Z5.b c(D5.i iVar, int i7, int i8) {
        D5.i iVar2 = (D5.i) this.f1476r;
        D5.i r3 = iVar.r(iVar2);
        int i9 = this.f1478t;
        int i10 = this.f1477s;
        if (i8 == 1) {
            if (i10 != -3) {
                if (i7 != -3) {
                    if (i10 != -2) {
                        if (i7 != -2) {
                            i7 += i10;
                            if (i7 < 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i7 = i10;
            }
            i8 = i9;
        }
        if (M5.g.a(r3, iVar2) && i7 == i10 && i8 == i9) {
            return this;
        }
        return a(r3, i7, i8);
    }

    public String d() {
        ArrayList arrayList = new ArrayList(4);
        D5.j jVar = D5.j.f531q;
        D5.i iVar = (D5.i) this.f1476r;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i7 = this.f1477s;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        int i8 = this.f1478t;
        if (i8 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC1111a.G(i8)));
        }
        return getClass().getSimpleName() + '[' + A5.k.a0(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // K.InterfaceC0030f
    public ClipData f() {
        return (ClipData) this.f1476r;
    }

    @Override // K.InterfaceC0028d
    public C0031g i() {
        return new C0031g(new C0029e(this));
    }

    @Override // K.InterfaceC0030f
    public int j() {
        return this.f1478t;
    }

    @Override // K.InterfaceC0030f
    public ContentInfo k() {
        return null;
    }

    @Override // K.InterfaceC0028d
    public void o(Bundle bundle) {
        this.f1480v = bundle;
    }

    @Override // K.InterfaceC0028d
    public void q(Uri uri) {
        this.f1479u = uri;
    }

    @Override // K.InterfaceC0030f
    public int r() {
        return this.f1477s;
    }

    @Override // Z5.b
    public Object t(Z5.c cVar, D5.d dVar) {
        Object e3;
        E5.a aVar = E5.a.f612q;
        C1530l c1530l = C1530l.f16479a;
        if (this.f1477s == -3) {
            D5.i k5 = dVar.k();
            D5.i r3 = k5.r((D5.i) this.f1476r);
            if (M5.g.a(r3, k5)) {
                e3 = b(cVar, dVar);
                if (e3 != aVar) {
                    return c1530l;
                }
            } else {
                D5.e eVar = D5.e.f529q;
                if (M5.g.a(r3.f(eVar), k5.f(eVar))) {
                    D5.i k7 = dVar.k();
                    if (!(cVar instanceof a6.u) && !(cVar instanceof a6.o)) {
                        cVar = new Z5.i(cVar, k7);
                    }
                    e3 = a6.c.a(r3, cVar, b6.a.l(r3), new a6.g(this, null), dVar);
                    if (e3 != aVar) {
                        e3 = c1530l;
                    }
                    if (e3 != aVar) {
                        return c1530l;
                    }
                }
            }
            return e3;
        }
        e3 = AbstractC0117y.e(new a6.e(null, this, cVar), dVar);
        if (e3 != aVar) {
            e3 = c1530l;
        }
        if (e3 != aVar) {
            return c1530l;
        }
        return e3;
    }

    public String toString() {
        String str;
        String valueOf;
        Uri uri;
        String str2;
        switch (this.f1475q) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f1476r).getDescription());
                sb.append(", source=");
                int i7 = this.f1477s;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        str = String.valueOf(i7);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i8 = this.f1478t;
                if ((i8 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i8);
                }
                sb.append(valueOf);
                String str3 = "";
                if (((Uri) this.f1479u) == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (((Bundle) this.f1480v) != null) {
                    str3 = ", hasExtras";
                }
                return AbstractC1111a.t(sb, str3, "}");
            case 2:
                return ((Z5.b) this.f1479u) + " -> " + d();
            default:
                return super.toString();
        }
    }

    public C0029e(C0029e c0029e) {
        this.f1475q = 1;
        ClipData clipData = (ClipData) c0029e.f1476r;
        clipData.getClass();
        this.f1476r = clipData;
        int i7 = c0029e.f1477s;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i7 <= 5) {
            this.f1477s = i7;
            int i8 = c0029e.f1478t;
            if ((i8 & 1) == i8) {
                this.f1478t = i8;
                this.f1479u = (Uri) c0029e.f1479u;
                this.f1480v = (Bundle) c0029e.f1480v;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i8) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }

    public C0029e(L5.q qVar, Z5.b bVar, D5.i iVar, int i7, int i8) {
        this.f1475q = 2;
        this.f1475q = 2;
        this.f1476r = iVar;
        this.f1477s = i7;
        this.f1478t = i8;
        this.f1479u = bVar;
        this.f1480v = qVar;
    }
}
