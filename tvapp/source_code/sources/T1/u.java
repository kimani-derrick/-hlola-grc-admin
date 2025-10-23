package T1;

import H2.C0002c;
import android.content.Context;
import c2.C0391b;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static volatile k f3266e;

    /* renamed from: a  reason: collision with root package name */
    public final C0391b f3267a;

    /* renamed from: b  reason: collision with root package name */
    public final C0391b f3268b;

    /* renamed from: c  reason: collision with root package name */
    public final Y1.b f3269c;
    public final Z1.j d;

    public u(C0391b c0391b, C0391b c0391b2, Y1.b bVar, Z1.j jVar, Z1.l lVar) {
        this.f3267a = c0391b;
        this.f3268b = c0391b2;
        this.f3269c = bVar;
        this.d = jVar;
        lVar.getClass();
        lVar.f4586a.execute(new E1.b(5, lVar));
    }

    public static u a() {
        k kVar = f3266e;
        if (kVar != null) {
            return (u) kVar.f3249v.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, T1.j] */
    public static void b(Context context) {
        if (f3266e == null) {
            synchronized (u.class) {
                try {
                    if (f3266e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f3243a = context;
                        f3266e = obj.b();
                    }
                } finally {
                }
            }
        }
    }

    public final s c(R1.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar instanceof l) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(R1.a.d);
        } else {
            singleton = Collections.singleton(new Q1.b("proto"));
        }
        C0002c a7 = i.a();
        aVar.getClass();
        a7.K("cct");
        String str = aVar.f2882a;
        String str2 = aVar.f2883b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a7.f1018s = bytes;
        return new s(singleton, a7.l(), this);
    }
}
