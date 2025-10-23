package o4;

import e2.X;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: o4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12917a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f12918b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f12919c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12920e;
    public final InterfaceC1071c f;

    /* renamed from: g  reason: collision with root package name */
    public final Set f12921g;

    public C1069a(String str, Set set, Set set2, int i7, int i8, InterfaceC1071c interfaceC1071c, Set set3) {
        this.f12917a = str;
        this.f12918b = Collections.unmodifiableSet(set);
        this.f12919c = Collections.unmodifiableSet(set2);
        this.d = i7;
        this.f12920e = i8;
        this.f = interfaceC1071c;
        this.f12921g = Collections.unmodifiableSet(set3);
    }

    public static X a(Class cls) {
        return new X(cls, new Class[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.X, java.lang.Object] */
    public static X b(o oVar) {
        o[] oVarArr = new o[0];
        ?? obj = new Object();
        obj.f9776a = null;
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.f9779e = new HashSet();
        obj.f9777b = 0;
        obj.f9778c = 0;
        obj.f9780g = new HashSet();
        hashSet.add(oVar);
        for (o oVar2 : oVarArr) {
            p6.l.h(oVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.d, oVarArr);
        return obj;
    }

    public static C1069a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(cls));
        for (Class cls2 : clsArr) {
            p6.l.h(cls2, "Null interface");
            hashSet.add(o.a(cls2));
        }
        return new C1069a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f2.c(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f12918b.toArray()) + ">{" + this.d + ", type=" + this.f12920e + ", deps=" + Arrays.toString(this.f12919c.toArray()) + "}";
    }
}
