package e2;

import android.net.Uri;
import java.io.Serializable;
import java.util.HashSet;
import o4.C1069a;
import o4.InterfaceC1071c;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public String f9776a;

    /* renamed from: b  reason: collision with root package name */
    public int f9777b;

    /* renamed from: c  reason: collision with root package name */
    public int f9778c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Serializable f9779e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Serializable f9780g;

    public X(Uri uri) {
        this.d = uri;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.Y, e2.W] */
    public static W a(X x7) {
        return new Y(x7);
    }

    public void b(o4.g gVar) {
        if (!((HashSet) this.d).contains(gVar.f12935a)) {
            ((HashSet) this.f9779e).add(gVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C1069a c() {
        boolean z7;
        if (((InterfaceC1071c) this.f) != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return new C1069a(this.f9776a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.f9779e), this.f9777b, this.f9778c, (InterfaceC1071c) this.f, (HashSet) this.f9780g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void d() {
        boolean z7;
        if (this.f9777b == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            this.f9777b = 2;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public X(Class cls, Class[] clsArr) {
        this.f9776a = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.f9779e = new HashSet();
        this.f9777b = 0;
        this.f9778c = 0;
        this.f9780g = new HashSet();
        hashSet.add(o4.o.a(cls));
        for (Class cls2 : clsArr) {
            p6.l.h(cls2, "Null interface");
            ((HashSet) this.d).add(o4.o.a(cls2));
        }
    }
}
