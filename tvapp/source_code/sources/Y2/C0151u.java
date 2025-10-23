package Y2;

import Z2.AbstractC0156a;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* renamed from: Y2.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151u implements InterfaceC0144m {

    /* renamed from: A  reason: collision with root package name */
    public InterfaceC0144m f4452A;

    /* renamed from: q  reason: collision with root package name */
    public final Context f4453q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f4454r;

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC0144m f4455s;

    /* renamed from: t  reason: collision with root package name */
    public B f4456t;

    /* renamed from: u  reason: collision with root package name */
    public C0134c f4457u;

    /* renamed from: v  reason: collision with root package name */
    public C0140i f4458v;

    /* renamed from: w  reason: collision with root package name */
    public InterfaceC0144m f4459w;

    /* renamed from: x  reason: collision with root package name */
    public Y f4460x;

    /* renamed from: y  reason: collision with root package name */
    public C0142k f4461y;

    /* renamed from: z  reason: collision with root package name */
    public S f4462z;

    public C0151u(Context context, InterfaceC0144m interfaceC0144m) {
        this.f4453q = context.getApplicationContext();
        interfaceC0144m.getClass();
        this.f4455s = interfaceC0144m;
        this.f4454r = new ArrayList();
    }

    public static void h(InterfaceC0144m interfaceC0144m, W w7) {
        if (interfaceC0144m != null) {
            interfaceC0144m.m(w7);
        }
    }

    public final void a(InterfaceC0144m interfaceC0144m) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f4454r;
            if (i7 < arrayList.size()) {
                interfaceC0144m.m((W) arrayList.get(i7));
                i7++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [Y2.m, Y2.g, Y2.k] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Y2.m, Y2.B, Y2.g] */
    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        boolean z7;
        InterfaceC0144m interfaceC0144m;
        if (this.f4452A == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        String scheme = c0148q.f4422a.getScheme();
        int i7 = Z2.H.f4603a;
        Uri uri = c0148q.f4422a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f4453q;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f4457u == null) {
                    C0134c c0134c = new C0134c(context);
                    this.f4457u = c0134c;
                    a(c0134c);
                }
                interfaceC0144m = this.f4457u;
                this.f4452A = interfaceC0144m;
            } else {
                if ("content".equals(scheme)) {
                    if (this.f4458v == null) {
                        C0140i c0140i = new C0140i(context);
                        this.f4458v = c0140i;
                        a(c0140i);
                    }
                    interfaceC0144m = this.f4458v;
                } else {
                    boolean equals = "rtmp".equals(scheme);
                    InterfaceC0144m interfaceC0144m2 = this.f4455s;
                    if (equals) {
                        if (this.f4459w == null) {
                            try {
                                InterfaceC0144m interfaceC0144m3 = (InterfaceC0144m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                                this.f4459w = interfaceC0144m3;
                                a(interfaceC0144m3);
                            } catch (ClassNotFoundException unused) {
                                AbstractC0156a.K("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                            } catch (Exception e3) {
                                throw new RuntimeException("Error instantiating RTMP extension", e3);
                            }
                            if (this.f4459w == null) {
                                this.f4459w = interfaceC0144m2;
                            }
                        }
                        interfaceC0144m = this.f4459w;
                    } else if ("udp".equals(scheme)) {
                        if (this.f4460x == null) {
                            Y y3 = new Y();
                            this.f4460x = y3;
                            a(y3);
                        }
                        interfaceC0144m = this.f4460x;
                    } else if ("data".equals(scheme)) {
                        if (this.f4461y == null) {
                            ?? abstractC0138g = new AbstractC0138g(false);
                            this.f4461y = abstractC0138g;
                            a(abstractC0138g);
                        }
                        interfaceC0144m = this.f4461y;
                    } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                        this.f4452A = interfaceC0144m2;
                    } else {
                        if (this.f4462z == null) {
                            S s6 = new S(context);
                            this.f4462z = s6;
                            a(s6);
                        }
                        interfaceC0144m = this.f4462z;
                    }
                }
                this.f4452A = interfaceC0144m;
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f4457u == null) {
                    C0134c c0134c2 = new C0134c(context);
                    this.f4457u = c0134c2;
                    a(c0134c2);
                }
                interfaceC0144m = this.f4457u;
                this.f4452A = interfaceC0144m;
            } else {
                if (this.f4456t == null) {
                    ?? abstractC0138g2 = new AbstractC0138g(false);
                    this.f4456t = abstractC0138g2;
                    a(abstractC0138g2);
                }
                interfaceC0144m = this.f4456t;
                this.f4452A = interfaceC0144m;
            }
        }
        return this.f4452A.c(c0148q);
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        InterfaceC0144m interfaceC0144m = this.f4452A;
        if (interfaceC0144m != null) {
            try {
                interfaceC0144m.close();
            } finally {
                this.f4452A = null;
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        InterfaceC0144m interfaceC0144m = this.f4452A;
        if (interfaceC0144m == null) {
            return null;
        }
        return interfaceC0144m.g();
    }

    @Override // Y2.InterfaceC0144m
    public final void m(W w7) {
        w7.getClass();
        this.f4455s.m(w7);
        this.f4454r.add(w7);
        h(this.f4456t, w7);
        h(this.f4457u, w7);
        h(this.f4458v, w7);
        h(this.f4459w, w7);
        h(this.f4460x, w7);
        h(this.f4461y, w7);
        h(this.f4462z, w7);
    }

    @Override // Y2.InterfaceC0144m
    public final Map n() {
        InterfaceC0144m interfaceC0144m = this.f4452A;
        if (interfaceC0144m == null) {
            return Collections.emptyMap();
        }
        return interfaceC0144m.n();
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        InterfaceC0144m interfaceC0144m = this.f4452A;
        interfaceC0144m.getClass();
        return interfaceC0144m.r(bArr, i7, i8);
    }
}
